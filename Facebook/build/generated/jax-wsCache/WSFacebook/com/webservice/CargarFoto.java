
package com.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cargarFoto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cargarFoto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uCorreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uFoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cargarFoto", propOrder = {
    "uCorreo",
    "ext",
    "uFoto"
})
public class CargarFoto {

    protected String uCorreo;
    protected String ext;
    protected String uFoto;

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
     * Obtiene el valor de la propiedad ext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt() {
        return ext;
    }

    /**
     * Define el valor de la propiedad ext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt(String value) {
        this.ext = value;
    }

    /**
     * Obtiene el valor de la propiedad uFoto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUFoto() {
        return uFoto;
    }

    /**
     * Define el valor de la propiedad uFoto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUFoto(String value) {
        this.uFoto = value;
    }

}
