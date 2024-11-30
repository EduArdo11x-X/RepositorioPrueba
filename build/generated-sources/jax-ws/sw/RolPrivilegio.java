
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rolPrivilegio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rolPrivilegio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_privilegio" type="{http://sw/}privilegio" minOccurs="0"/&gt;
 *         &lt;element name="id_rol" type="{http://sw/}rol" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rolPrivilegio", propOrder = {
    "idPrivilegio",
    "idRol"
})
public class RolPrivilegio {

    @XmlElement(name = "id_privilegio")
    protected Privilegio idPrivilegio;
    @XmlElement(name = "id_rol")
    protected Rol idRol;

    /**
     * Obtiene el valor de la propiedad idPrivilegio.
     * 
     * @return
     *     possible object is
     *     {@link Privilegio }
     *     
     */
    public Privilegio getIdPrivilegio() {
        return idPrivilegio;
    }

    /**
     * Define el valor de la propiedad idPrivilegio.
     * 
     * @param value
     *     allowed object is
     *     {@link Privilegio }
     *     
     */
    public void setIdPrivilegio(Privilegio value) {
        this.idPrivilegio = value;
    }

    /**
     * Obtiene el valor de la propiedad idRol.
     * 
     * @return
     *     possible object is
     *     {@link Rol }
     *     
     */
    public Rol getIdRol() {
        return idRol;
    }

    /**
     * Define el valor de la propiedad idRol.
     * 
     * @param value
     *     allowed object is
     *     {@link Rol }
     *     
     */
    public void setIdRol(Rol value) {
        this.idRol = value;
    }

}
