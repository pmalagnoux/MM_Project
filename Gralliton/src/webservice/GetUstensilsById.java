
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getUstensilsById complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getUstensilsById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recipeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUstensilsById", propOrder = {
    "recipeId"
})
public class GetUstensilsById {

    protected int recipeId;

    /**
     * Obtient la valeur de la propri�t� recipeId.
     * 
     */
    public int getRecipeId() {
        return recipeId;
    }

    /**
     * D�finit la valeur de la propri�t� recipeId.
     * 
     */
    public void setRecipeId(int value) {
        this.recipeId = value;
    }

}
