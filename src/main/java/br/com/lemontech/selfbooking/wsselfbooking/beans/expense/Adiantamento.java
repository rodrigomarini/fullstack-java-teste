
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.AdiantamentoStatus;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCredito;


/**
 * <p>Java class for adiantamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adiantamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matriculaAutorizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeAutorizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tipoCredito" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoCredito" minOccurs="0"/>
 *         &lt;element name="numeroAutorizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacaoSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacaoFinanceiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}adiantamentoStatus" minOccurs="0"/>
 *         &lt;element name="dataLiberacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="matriculaCancelador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCancelador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="itens" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}adiantamentoItens" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adiantamento", propOrder = {
    "id",
    "matriculaAutorizador",
    "nomeAutorizador",
    "dataInicial",
    "dataFinal",
    "tipoCredito",
    "numeroAutorizacao",
    "observacaoSolicitante",
    "observacaoFinanceiro",
    "status",
    "dataLiberacao",
    "matriculaCancelador",
    "nomeCancelador",
    "dataCancelamento",
    "itens"
})
public class Adiantamento {

    protected int id;
    protected String matriculaAutorizador;
    protected String nomeAutorizador;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicial;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFinal;
    @XmlSchemaType(name = "string")
    protected TipoCredito tipoCredito;
    protected String numeroAutorizacao;
    protected String observacaoSolicitante;
    protected String observacaoFinanceiro;
    @XmlSchemaType(name = "string")
    protected AdiantamentoStatus status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataLiberacao;
    protected String matriculaCancelador;
    protected String nomeCancelador;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCancelamento;
    protected AdiantamentoItens itens;

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
     * Gets the value of the dataInicial property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicial() {
        return dataInicial;
    }

    /**
     * Sets the value of the dataInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicial(XMLGregorianCalendar value) {
        this.dataInicial = value;
    }

    /**
     * Gets the value of the dataFinal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinal() {
        return dataFinal;
    }

    /**
     * Sets the value of the dataFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinal(XMLGregorianCalendar value) {
        this.dataFinal = value;
    }

    /**
     * Gets the value of the tipoCredito property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCredito }
     *     
     */
    public TipoCredito getTipoCredito() {
        return tipoCredito;
    }

    /**
     * Sets the value of the tipoCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCredito }
     *     
     */
    public void setTipoCredito(TipoCredito value) {
        this.tipoCredito = value;
    }

    /**
     * Gets the value of the numeroAutorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAutorizacao() {
        return numeroAutorizacao;
    }

    /**
     * Sets the value of the numeroAutorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAutorizacao(String value) {
        this.numeroAutorizacao = value;
    }

    /**
     * Gets the value of the observacaoSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoSolicitante() {
        return observacaoSolicitante;
    }

    /**
     * Sets the value of the observacaoSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoSolicitante(String value) {
        this.observacaoSolicitante = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AdiantamentoStatus }
     *     
     */
    public AdiantamentoStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdiantamentoStatus }
     *     
     */
    public void setStatus(AdiantamentoStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the dataLiberacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataLiberacao() {
        return dataLiberacao;
    }

    /**
     * Sets the value of the dataLiberacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataLiberacao(XMLGregorianCalendar value) {
        this.dataLiberacao = value;
    }

    /**
     * Gets the value of the matriculaCancelador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaCancelador() {
        return matriculaCancelador;
    }

    /**
     * Sets the value of the matriculaCancelador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaCancelador(String value) {
        this.matriculaCancelador = value;
    }

    /**
     * Gets the value of the nomeCancelador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCancelador() {
        return nomeCancelador;
    }

    /**
     * Sets the value of the nomeCancelador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCancelador(String value) {
        this.nomeCancelador = value;
    }

    /**
     * Gets the value of the dataCancelamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCancelamento() {
        return dataCancelamento;
    }

    /**
     * Sets the value of the dataCancelamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCancelamento(XMLGregorianCalendar value) {
        this.dataCancelamento = value;
    }

    /**
     * Gets the value of the itens property.
     * 
     * @return
     *     possible object is
     *     {@link AdiantamentoItens }
     *     
     */
    public AdiantamentoItens getItens() {
        return itens;
    }

    /**
     * Sets the value of the itens property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdiantamentoItens }
     *     
     */
    public void setItens(AdiantamentoItens value) {
        this.itens = value;
    }

}
