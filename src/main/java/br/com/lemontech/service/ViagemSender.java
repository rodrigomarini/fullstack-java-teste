package br.com.lemontech.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.lemontech.model.Viagem;

/*
 * Classe responsável pelo envio dos dados de viagens obtidas através de mensageria  
 */
@Stateful
public class ViagemSender {
	
	private static Logger logger = LoggerFactory.getLogger(ViagemSender.class);
	
	@Resource(mappedName = "java:/ConnectionFactory")
    private ConnectionFactory connectionFactory;

	@Inject
	private JMSContext context;

	@Resource(lookup="java:/jms/queues/persist")
	private Destination queue;

	private Connection connection;
	private Session session;
	
	@PostConstruct
    public void init() {
        try {
            connection = connectionFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        } catch (JMSException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
 
    @PreDestroy
    public void destroy() {
        if (connection != null) {
            try {
                connection.close();
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }

	/*
	 * Envia um objeto para o componente de persistêcia.
	 * @param Viagem viagem a ser persistida no db.
	 */
	public void send(Viagem viagem){
		ObjectMessage message;
		try {
			message = session.createObjectMessage(viagem);
			context.createProducer().send(queue, message);
		} catch (JMSException e) {
			logger.error("Problema ao enviar objeto Viagem",e);
		}
	}

}
