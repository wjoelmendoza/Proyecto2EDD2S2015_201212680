
package com.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActPerfil_QNAME = new QName("http://webservice.com/", "actPerfil");
    private final static QName _EliminarPerfil_QNAME = new QName("http://webservice.com/", "eliminarPerfil");
    private final static QName _GraficarSeguidores_QNAME = new QName("http://webservice.com/", "graficarSeguidores");
    private final static QName _BuscarUsuarioResponse_QNAME = new QName("http://webservice.com/", "buscarUsuarioResponse");
    private final static QName _BuscarUsuario_QNAME = new QName("http://webservice.com/", "buscarUsuario");
    private final static QName _AgregarUsuario_QNAME = new QName("http://webservice.com/", "agregarUsuario");
    private final static QName _GraficarArbolB_QNAME = new QName("http://webservice.com/", "graficarArbolB");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminarPerfil }
     * 
     */
    public EliminarPerfil createEliminarPerfil() {
        return new EliminarPerfil();
    }

    /**
     * Create an instance of {@link GraficarSeguidores }
     * 
     */
    public GraficarSeguidores createGraficarSeguidores() {
        return new GraficarSeguidores();
    }

    /**
     * Create an instance of {@link ActPerfil }
     * 
     */
    public ActPerfil createActPerfil() {
        return new ActPerfil();
    }

    /**
     * Create an instance of {@link BuscarUsuarioResponse }
     * 
     */
    public BuscarUsuarioResponse createBuscarUsuarioResponse() {
        return new BuscarUsuarioResponse();
    }

    /**
     * Create an instance of {@link BuscarUsuario }
     * 
     */
    public BuscarUsuario createBuscarUsuario() {
        return new BuscarUsuario();
    }

    /**
     * Create an instance of {@link AgregarUsuario }
     * 
     */
    public AgregarUsuario createAgregarUsuario() {
        return new AgregarUsuario();
    }

    /**
     * Create an instance of {@link GraficarArbolB }
     * 
     */
    public GraficarArbolB createGraficarArbolB() {
        return new GraficarArbolB();
    }

    /**
     * Create an instance of {@link Perfil }
     * 
     */
    public Perfil createPerfil() {
        return new Perfil();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActPerfil }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "actPerfil")
    public JAXBElement<ActPerfil> createActPerfil(ActPerfil value) {
        return new JAXBElement<ActPerfil>(_ActPerfil_QNAME, ActPerfil.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPerfil }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "eliminarPerfil")
    public JAXBElement<EliminarPerfil> createEliminarPerfil(EliminarPerfil value) {
        return new JAXBElement<EliminarPerfil>(_EliminarPerfil_QNAME, EliminarPerfil.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraficarSeguidores }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "graficarSeguidores")
    public JAXBElement<GraficarSeguidores> createGraficarSeguidores(GraficarSeguidores value) {
        return new JAXBElement<GraficarSeguidores>(_GraficarSeguidores_QNAME, GraficarSeguidores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "buscarUsuarioResponse")
    public JAXBElement<BuscarUsuarioResponse> createBuscarUsuarioResponse(BuscarUsuarioResponse value) {
        return new JAXBElement<BuscarUsuarioResponse>(_BuscarUsuarioResponse_QNAME, BuscarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "buscarUsuario")
    public JAXBElement<BuscarUsuario> createBuscarUsuario(BuscarUsuario value) {
        return new JAXBElement<BuscarUsuario>(_BuscarUsuario_QNAME, BuscarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "agregarUsuario")
    public JAXBElement<AgregarUsuario> createAgregarUsuario(AgregarUsuario value) {
        return new JAXBElement<AgregarUsuario>(_AgregarUsuario_QNAME, AgregarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraficarArbolB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "graficarArbolB")
    public JAXBElement<GraficarArbolB> createGraficarArbolB(GraficarArbolB value) {
        return new JAXBElement<GraficarArbolB>(_GraficarArbolB_QNAME, GraficarArbolB.class, null, value);
    }

}
