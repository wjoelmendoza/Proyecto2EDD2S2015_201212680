
package com.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para addSeguidor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="addSeguidor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uCorreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCorreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addSeguidor", propOrder = {
    "uCorreo",
    "sCorreo",
    "sNombre"
})
public class AddSeguidor {

    protected String uCorreo;
    protected String sCorreo;
    protected String sNombre;

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
     * Obtiene el valor de la propiedad sCorreo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCorreo() {
        return sCorreo;
    }

    /**
     * Define el valor de la propiedad sCorreo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCorreo(String value) {
        this.sCorreo = value;
    }

    /**
     * Obtiene el valor de la propiedad sNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNombre() {
        return sNombre;
    }

    /**
     * Define el valor de la propiedad sNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNombre(String value) {
        this.sNombre = value;
    }

}
