
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adiantamentoStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="adiantamentoStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDENTE"/>
 *     &lt;enumeration value="LIBERADO"/>
 *     &lt;enumeration value="CANCELADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "adiantamentoStatus")
@XmlEnum
public enum AdiantamentoStatus {

    PENDENTE,
    LIBERADO,
    CANCELADO;

    public String value() {
        return name();
    }

    public static AdiantamentoStatus fromValue(String v) {
        return valueOf(v);
    }

}
