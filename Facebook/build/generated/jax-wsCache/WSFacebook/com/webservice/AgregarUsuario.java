
package com.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uContra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uCorreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregarUsuario", propOrder = {
    "uContra",
    "uCorreo",
    "uNombre"
})
public class AgregarUsuario {

    protected String uContra;
    protected String uCorreo;
    protected String uNombre;

    /**
     * Obtiene el valor de la propiedad uContra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUContra() {
        return uContra;
    }

    /**
     * Define el valor de la propiedad uContra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUContra(String value) {
        this.uContra = value;
    }

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
     * Obtiene el valor de la propiedad uNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNombre() {
        return uNombre;
    }

    /**
     * Define el valor de la propiedad uNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNombre(String value) {
        this.uNombre = value;
    }

}
