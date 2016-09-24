package br.com.lemontech.util;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateUtil {

	private static Logger logger = LoggerFactory.getLogger(DateUtil.class);

	public static final XMLGregorianCalendar getXMLGregorianCalendar(Long millisecond){
		try {
			GregorianCalendar date = new GregorianCalendar(); 
			date.setTimeInMillis(millisecond);
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
		} catch (DatatypeConfigurationException e) {
			logger.error("Problema ao converter data",e);
			throw new RuntimeException(e);
		}
	}

	public static final Date getDate(XMLGregorianCalendar date){
		
		try {
			Date d = new Date();
			
			if(date != null){
				d.setTime(date.getMillisecond());
			}
			
			return d;
		} catch (Exception e) {
			logger.error("Problema ao converter data",e);
			throw new RuntimeException(e);
		}
	}

}
