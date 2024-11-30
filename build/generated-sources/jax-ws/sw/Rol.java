
package sw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="decripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_rol" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="listaROlPrivilegio" type="{http://sw/}rolPrivilegio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listaUsuarioRol" type="{http://sw/}usuarioRol" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rol", propOrder = {
    "decripcion",
    "idRol",
    "listaROlPrivilegio",
    "listaUsuarioRol",
    "rol"
})
public class Rol {

    protected String decripcion;
    @XmlElement(name = "id_rol")
    protected int idRol;
    @XmlElement(nillable = true)
    protected List<RolPrivilegio> listaROlPrivilegio;
    @XmlElement(nillable = true)
    protected List<UsuarioRol> listaUsuarioRol;
    protected String rol;

    /**
     * Obtiene el valor de la propiedad decripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecripcion() {
        return decripcion;
    }

    /**
     * Define el valor de la propiedad decripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecripcion(String value) {
        this.decripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idRol.
     * 
     */
    public int getIdRol() {
        return idRol;
    }

    /**
     * Define el valor de la propiedad idRol.
     * 
     */
    public void setIdRol(int value) {
        this.idRol = value;
    }

    /**
     * Gets the value of the listaROlPrivilegio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaROlPrivilegio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaROlPrivilegio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolPrivilegio }
     * 
     * 
     */
    public List<RolPrivilegio> getListaROlPrivilegio() {
        if (listaROlPrivilegio == null) {
            listaROlPrivilegio = new ArrayList<RolPrivilegio>();
        }
        return this.listaROlPrivilegio;
    }

    /**
     * Gets the value of the listaUsuarioRol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaUsuarioRol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaUsuarioRol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsuarioRol }
     * 
     * 
     */
    public List<UsuarioRol> getListaUsuarioRol() {
        if (listaUsuarioRol == null) {
            listaUsuarioRol = new ArrayList<UsuarioRol>();
        }
        return this.listaUsuarioRol;
    }

    /**
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRol(String value) {
        this.rol = value;
    }

}
