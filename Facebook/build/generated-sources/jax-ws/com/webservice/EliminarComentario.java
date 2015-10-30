
package com.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarComentario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarComentario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uCorreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCorreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarComentario", propOrder = {
    "uCorreo",
    "sCorreo",
    "pos"
})
public class EliminarComentario {

    protected String uCorreo;
    protected String sCorreo;
    protected int pos;

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
     * Obtiene el valor de la propiedad pos.
     * 
     */
    public int getPos() {
        return pos;
    }

    /**
     * Define el valor de la propiedad pos.
     * 
     */
    public void setPos(int value) {
        this.pos = value;
    }

}
