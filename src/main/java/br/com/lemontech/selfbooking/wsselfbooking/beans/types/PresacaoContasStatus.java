
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for presacaoContasStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="presacaoContasStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDENTE"/>
 *     &lt;enumeration value="APROVADO"/>
 *     &lt;enumeration value="REPROVADO"/>
 *     &lt;enumeration value="AUTORIZACAO"/>
 *     &lt;enumeration value="PENDENCIA_APROVADOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "presacaoContasStatus")
@XmlEnum
public enum PresacaoContasStatus {

    PENDENTE,
    APROVADO,
    REPROVADO,
    AUTORIZACAO,
    PENDENCIA_APROVADOR;

    public String value() {
        return name();
    }

    public static PresacaoContasStatus fromValue(String v) {
        return valueOf(v);
    }

}
