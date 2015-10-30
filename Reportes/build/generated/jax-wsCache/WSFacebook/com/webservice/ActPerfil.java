
package com.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actPerfil complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actPerfil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uEdad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="uNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uCorreo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actPerfil", propOrder = {
    "uEdad",
    "uNombre",
    "estCivil",
    "uGenero",
    "uCorreo",
    "uPais"
})
public class ActPerfil {

    protected int uEdad;
    protected String uNombre;
    protected String estCivil;
    protected String uGenero;
    protected String uCorreo;
    protected String uPais;

    /**
     * Obtiene el valor de la propiedad uEdad.
     * 
     */
    public int getUEdad() {
        return uEdad;
    }

    /**
     * Define el valor de la propiedad uEdad.
     * 
     */
    public void setUEdad(int value) {
        this.uEdad = value;
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

    /**
     * Obtiene el valor de la propiedad estCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstCivil() {
        return estCivil;
    }

    /**
     * Define el valor de la propiedad estCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstCivil(String value) {
        this.estCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad uGenero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUGenero() {
        return uGenero;
    }

    /**
     * Define el valor de la propiedad uGenero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUGenero(String value) {
        this.uGenero = value;
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
     * Obtiene el valor de la propiedad uPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPais() {
        return uPais;
    }

    /**
     * Define el valor de la propiedad uPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPais(String value) {
        this.uPais = value;
    }

}
