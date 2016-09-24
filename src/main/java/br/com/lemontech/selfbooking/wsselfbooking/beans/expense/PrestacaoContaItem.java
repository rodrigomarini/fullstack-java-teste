
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.DeslocamentoTerrestre;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda;


/**
 * <p>Java class for prestacaoContaItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prestacaoContaItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="moeda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda" minOccurs="0"/>
 *         &lt;element name="urlImagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorExterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deslocamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}deslocamentoTerrestre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prestacaoContaItem", propOrder = {
    "tipoDespesa",
    "valor",
    "moeda",
    "urlImagem",
    "observacao",
    "identificadorExterno",
    "deslocamento"
})
public class PrestacaoContaItem {

    protected String tipoDespesa;
    protected Double valor;
    @XmlSchemaType(name = "string")
    protected Moeda moeda;
    protected String urlImagem;
    protected String observacao;
    protected String identificadorExterno;
    protected DeslocamentoTerrestre deslocamento;

    /**
     * Gets the value of the tipoDespesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDespesa() {
        return tipoDespesa;
    }

    /**
     * Sets the value of the tipoDespesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDespesa(String value) {
        this.tipoDespesa = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValor(Double value) {
        this.valor = value;
    }

    /**
     * Gets the value of the moeda property.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoeda() {
        return moeda;
    }

    /**
     * Sets the value of the moeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoeda(Moeda value) {
        this.moeda = value;
    }

    /**
     * Gets the value of the urlImagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImagem() {
        return urlImagem;
    }

    /**
     * Sets the value of the urlImagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImagem(String value) {
        this.urlImagem = value;
    }

    /**
     * Gets the value of the observacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Sets the value of the observacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Gets the value of the identificadorExterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorExterno() {
        return identificadorExterno;
    }

    /**
     * Sets the value of the identificadorExterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorExterno(String value) {
        this.identificadorExterno = value;
    }

    /**
     * Gets the value of the deslocamento property.
     * 
     * @return
     *     possible object is
     *     {@link DeslocamentoTerrestre }
     *     
     */
    public DeslocamentoTerrestre getDeslocamento() {
        return deslocamento;
    }

    /**
     * Sets the value of the deslocamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeslocamentoTerrestre }
     *     
     */
    public void setDeslocamento(DeslocamentoTerrestre value) {
        this.deslocamento = value;
    }

}
