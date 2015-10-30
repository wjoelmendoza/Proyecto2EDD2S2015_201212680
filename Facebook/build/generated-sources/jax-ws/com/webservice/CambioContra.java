
package com.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambioContra complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambioContra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uCorreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actContra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nContra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambioContra", propOrder = {
    "uCorreo",
    "actContra",
    "nContra"
})
public class CambioContra {

    protected String uCorreo;
    protected String actContra;
    protected String nContra;

    /**
     * Obtiene el valor de la propiedad uCorreo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCorreo() {
        return uCorreo;
    }

    /**
     * Define el valor de la propiedad uCorreo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCorreo(String value) {
        this.uCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad actContra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActContra() {
        return actContra;
    }

    /**
     * Define el valor de la propiedad actContra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActContra(String value) {
        this.actContra = value;
    }

    /**
     * Obtiene el valor de la propiedad nContra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNContra() {
        return nContra;
    }

    /**
     * Define el valor de la propiedad nContra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNContra(String value) {
        this.nContra = value;
    }

}
