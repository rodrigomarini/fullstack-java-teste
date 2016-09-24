package br.com.lemontech.listener;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.lemontech.model.Viagem;

@MessageDriven(activationConfig = { 
		@ActivationConfigProperty(
				propertyName = "destinationLookup", 
				propertyValue = "java:/jms/queues/persist")
})
public class ViagemListenerMDB implements MessageListener{
	
	private Logger logger = LoggerFactory.getLogger(ViagemListenerMDB.class);

	public void onMessage(Message message) {
		ObjectMessage object = (ObjectMessage) message;
		Viagem viagem;
		try {
			viagem = (Viagem) object.getObject();
			// TODO persistir esse obj
		} catch (JMSException e) {
			logger.error("Problema ao receber objeto Viagem",e);
		}
		
	}

}
