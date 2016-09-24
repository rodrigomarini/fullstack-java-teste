package br.com.lemontech.conf;

import javax.jms.JMSDestinationDefinition;

/*
 * Classe de configuração para JMS - Necessária para que a injection do Destination funcione
 * O objetivo é informar ao servidor que o tópico definido no atributo name deve ficar disponível na JNDI
 * 
 */
@JMSDestinationDefinition(name = "java:/jms/queues/persist", interfaceName = "javax.jms.Queue")
public class ConfigureJMSDestination {

}
