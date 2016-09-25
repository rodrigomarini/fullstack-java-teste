package br.com.lemontech.listener;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.lemontech.dao.ViagemDao;
import br.com.lemontech.model.Viagem;

@MessageDriven(activationConfig = { 
		@ActivationConfigProperty(
				propertyName = "destinationLookup", 
				propertyValue = "java:/jms/queues/persist")
})
public class ViagemListenerMDB implements MessageListener{
	
	private Logger logger = LoggerFactory.getLogger(ViagemListenerMDB.class);
	
	@Inject
	ViagemDao viagemDao;
	
	@Transactional
	public void onMessage(Message message) {
		ObjectMessage object = (ObjectMessage) message;
		try {
			Viagem viagem = (Viagem) object.getObject();
			viagemDao.save(viagem);
		} catch (JMSException e) {
			logger.error("Problema ao receber objeto Viagem",e);
		}
		
	}

}
