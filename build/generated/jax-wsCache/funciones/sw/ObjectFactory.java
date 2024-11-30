
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
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

    private final static QName _CargarDatos_QNAME = new QName("http://sw/", "cargarDatos");
    private final static QName _CargarDatosResponse_QNAME = new QName("http://sw/", "cargarDatosResponse");
    private final static QName _ConsultaPalabra_QNAME = new QName("http://sw/", "consultaPalabra");
    private final static QName _ConsultaPalabraResponse_QNAME = new QName("http://sw/", "consultaPalabraResponse");
    private final static QName _ElevarNumero_QNAME = new QName("http://sw/", "elevarNumero");
    private final static QName _ElevarNumeroResponse_QNAME = new QName("http://sw/", "elevarNumeroResponse");
    private final static QName _Hello_QNAME = new QName("http://sw/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://sw/", "helloResponse");
    private final static QName _Rol_QNAME = new QName("http://sw/", "rol");
    private final static QName _Usuario_QNAME = new QName("http://sw/", "usuario");
    private final static QName _UsuarioRol_QNAME = new QName("http://sw/", "usuarioRol");
    private final static QName _ValidarDatos_QNAME = new QName("http://sw/", "validarDatos");
    private final static QName _ValidarDatosResponse_QNAME = new QName("http://sw/", "validarDatosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CargarDatos }
     * 
     */
    public CargarDatos createCargarDatos() {
        return new CargarDatos();
    }

    /**
     * Create an instance of {@link CargarDatosResponse }
     * 
     */
    public CargarDatosResponse createCargarDatosResponse() {
        return new CargarDatosResponse();
    }

    /**
     * Create an instance of {@link ConsultaPalabra }
     * 
     */
    public ConsultaPalabra createConsultaPalabra() {
        return new ConsultaPalabra();
    }

    /**
     * Create an instance of {@link ConsultaPalabraResponse }
     * 
     */
    public ConsultaPalabraResponse createConsultaPalabraResponse() {
        return new ConsultaPalabraResponse();
    }

    /**
     * Create an instance of {@link ElevarNumero }
     * 
     */
    public ElevarNumero createElevarNumero() {
        return new ElevarNumero();
    }

    /**
     * Create an instance of {@link ElevarNumeroResponse }
     * 
     */
    public ElevarNumeroResponse createElevarNumeroResponse() {
        return new ElevarNumeroResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Rol }
     * 
     */
    public Rol createRol() {
        return new Rol();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link UsuarioRol }
     * 
     */
    public UsuarioRol createUsuarioRol() {
        return new UsuarioRol();
    }

    /**
     * Create an instance of {@link ValidarDatos }
     * 
     */
    public ValidarDatos createValidarDatos() {
        return new ValidarDatos();
    }

    /**
     * Create an instance of {@link ValidarDatosResponse }
     * 
     */
    public ValidarDatosResponse createValidarDatosResponse() {
        return new ValidarDatosResponse();
    }

    /**
     * Create an instance of {@link RolPrivilegio }
     * 
     */
    public RolPrivilegio createRolPrivilegio() {
        return new RolPrivilegio();
    }

    /**
     * Create an instance of {@link Privilegio }
     * 
     */
    public Privilegio createPrivilegio() {
        return new Privilegio();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link Vehiculo }
     * 
     */
    public Vehiculo createVehiculo() {
        return new Vehiculo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarDatos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CargarDatos }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "cargarDatos")
    public JAXBElement<CargarDatos> createCargarDatos(CargarDatos value) {
        return new JAXBElement<CargarDatos>(_CargarDatos_QNAME, CargarDatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargarDatosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CargarDatosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "cargarDatosResponse")
    public JAXBElement<CargarDatosResponse> createCargarDatosResponse(CargarDatosResponse value) {
        return new JAXBElement<CargarDatosResponse>(_CargarDatosResponse_QNAME, CargarDatosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPalabra }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaPalabra }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "consultaPalabra")
    public JAXBElement<ConsultaPalabra> createConsultaPalabra(ConsultaPalabra value) {
        return new JAXBElement<ConsultaPalabra>(_ConsultaPalabra_QNAME, ConsultaPalabra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaPalabraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaPalabraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "consultaPalabraResponse")
    public JAXBElement<ConsultaPalabraResponse> createConsultaPalabraResponse(ConsultaPalabraResponse value) {
        return new JAXBElement<ConsultaPalabraResponse>(_ConsultaPalabraResponse_QNAME, ConsultaPalabraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElevarNumero }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElevarNumero }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "elevarNumero")
    public JAXBElement<ElevarNumero> createElevarNumero(ElevarNumero value) {
        return new JAXBElement<ElevarNumero>(_ElevarNumero_QNAME, ElevarNumero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElevarNumeroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElevarNumeroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "elevarNumeroResponse")
    public JAXBElement<ElevarNumeroResponse> createElevarNumeroResponse(ElevarNumeroResponse value) {
        return new JAXBElement<ElevarNumeroResponse>(_ElevarNumeroResponse_QNAME, ElevarNumeroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Rol }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "rol")
    public JAXBElement<Rol> createRol(Rol value) {
        return new JAXBElement<Rol>(_Rol_QNAME, Rol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioRol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsuarioRol }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "usuarioRol")
    public JAXBElement<UsuarioRol> createUsuarioRol(UsuarioRol value) {
        return new JAXBElement<UsuarioRol>(_UsuarioRol_QNAME, UsuarioRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarDatos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarDatos }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "validarDatos")
    public JAXBElement<ValidarDatos> createValidarDatos(ValidarDatos value) {
        return new JAXBElement<ValidarDatos>(_ValidarDatos_QNAME, ValidarDatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarDatosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarDatosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "validarDatosResponse")
    public JAXBElement<ValidarDatosResponse> createValidarDatosResponse(ValidarDatosResponse value) {
        return new JAXBElement<ValidarDatosResponse>(_ValidarDatosResponse_QNAME, ValidarDatosResponse.class, null, value);
    }

}
