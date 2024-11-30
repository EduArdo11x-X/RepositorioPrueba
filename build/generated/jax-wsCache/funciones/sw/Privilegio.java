
package sw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para privilegio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="privilegio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_privilegio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="listaROlPrivilegio" type="{http://sw/}rolPrivilegio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "privilegio", propOrder = {
    "descripcion",
    "idPrivilegio",
    "listaROlPrivilegio",
    "nombre"
})
public class Privilegio {

    protected String descripcion;
    @XmlElement(name = "id_privilegio")
    protected int idPrivilegio;
    @XmlElement(nillable = true)
    protected List<RolPrivilegio> listaROlPrivilegio;
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idPrivilegio.
     * 
     */
    public int getIdPrivilegio() {
        return idPrivilegio;
    }

    /**
     * Define el valor de la propiedad idPrivilegio.
     * 
     */
    public void setIdPrivilegio(int value) {
        this.idPrivilegio = value;
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
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
