
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getUstensil1Response complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getUstensil1Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservice/}ustensil" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUstensil1Response", propOrder = {
    "_return"
})
public class GetUstensil1Response {

    @XmlElement(name = "return")
    protected Ustensil _return;

    /**
     * Obtient la valeur de la propri�t� return.
     * 
     * @return
     *     possible object is
     *     {@link Ustensil }
     *     
     */
    public Ustensil getReturn() {
        return _return;
    }

    /**
     * D�finit la valeur de la propri�t� return.
     * 
     * @param value
     *     allowed object is
     *     {@link Ustensil }
     *     
     */
    public void setReturn(Ustensil value) {
        this._return = value;
    }

}
