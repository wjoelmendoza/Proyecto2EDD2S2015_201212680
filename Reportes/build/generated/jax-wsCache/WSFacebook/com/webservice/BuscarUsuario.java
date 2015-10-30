
package com.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pBusqueda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarUsuario", propOrder = {
    "pBusqueda"
})
public class BuscarUsuario {

    protected String pBusqueda;

    /**
     * Obtiene el valor de la propiedad pBusqueda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBusqueda() {
        return pBusqueda;
    }

    /**
     * Define el valor de la propiedad pBusqueda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBusqueda(String value) {
        this.pBusqueda = value;
    }

}
