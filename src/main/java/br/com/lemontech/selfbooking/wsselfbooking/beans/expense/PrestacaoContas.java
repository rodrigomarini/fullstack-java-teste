
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PresacaoContasStatus;


/**
 * <p>Java class for prestacaoContas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prestacaoContas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matriculaAutorizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeAutorizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}presacaoContasStatus" minOccurs="0"/>
 *         &lt;element name="observacaoFinanceiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="justificativaReprovacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reembolso" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="itens" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}prestacaoContaItens" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prestacaoContas", propOrder = {
    "id",
    "matriculaAutorizador",
    "nomeAutorizador",
    "status",
    "observacaoFinanceiro",
    "justificativaReprovacao",
    "reembolso",
    "itens"
})
public class PrestacaoContas {

    protected int id;
    protected String matriculaAutorizador;
    protected String nomeAutorizador;
    @XmlSchemaType(name = "string")
    protected PresacaoContasStatus status;
    protected String observacaoFinanceiro;
    protected String justificativaReprovacao;
    protected Boolean reembolso;
    protected PrestacaoContaItens itens;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the matriculaAutorizador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaAutorizador() {
        return matriculaAutorizador;
    }

    /**
     * Sets the value of the matriculaAutorizador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaAutorizador(String value) {
        this.matriculaAutorizador = value;
    }

    /**
     * Gets the value of the nomeAutorizador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAutorizador() {
        return nomeAutorizador;
    }

    /**
     * Sets the value of the nomeAutorizador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAutorizador(String value) {
        this.nomeAutorizador = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PresacaoContasStatus }
     *     
     */
    public PresacaoContasStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresacaoContasStatus }
     *     
     */
    public void setStatus(PresacaoContasStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the observacaoFinanceiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoFinanceiro() {
        return observacaoFinanceiro;
    }

    /**
     * Sets the value of the observacaoFinanceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoFinanceiro(String value) {
        this.observacaoFinanceiro = value;
    }

    /**
     * Gets the value of the justificativaReprovacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaReprovacao() {
        return justificativaReprovacao;
    }

    /**
     * Sets the value of the justificativaReprovacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaReprovacao(String value) {
        this.justificativaReprovacao = value;
    }

    /**
     * Gets the value of the reembolso property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReembolso() {
        return reembolso;
    }

    /**
     * Sets the value of the reembolso property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReembolso(Boolean value) {
        this.reembolso = value;
    }

    /**
     * Gets the value of the itens property.
     * 
     * @return
     *     possible object is
     *     {@link PrestacaoContaItens }
     *     
     */
    public PrestacaoContaItens getItens() {
        return itens;
    }

    /**
     * Sets the value of the itens property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrestacaoContaItens }
     *     
     */
    public void setItens(PrestacaoContaItens value) {
        this.itens = value;
    }

}
