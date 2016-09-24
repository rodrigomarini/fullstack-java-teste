
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCredito.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoCredito">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEPOSITO"/>
 *     &lt;enumeration value="CARTAO_CREDITO"/>
 *     &lt;enumeration value="ESPECIE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoCredito")
@XmlEnum
public enum TipoCredito {

    DEPOSITO,
    CARTAO_CREDITO,
    ESPECIE;

    public String value() {
        return name();
    }

    public static TipoCredito fromValue(String v) {
        return valueOf(v);
    }

}
