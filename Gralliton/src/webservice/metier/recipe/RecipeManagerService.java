
package webservice.metier.recipe;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RecipeManagerService", targetNamespace = "http://recipe.metier.webService/", wsdlLocation = "http://localhost:8686/RecipeManager/?wsdl")
public class RecipeManagerService
    extends Service
{

    private final static URL RECIPEMANAGERSERVICE_WSDL_LOCATION;
    private final static WebServiceException RECIPEMANAGERSERVICE_EXCEPTION;
    private final static QName RECIPEMANAGERSERVICE_QNAME = new QName("http://recipe.metier.webService/", "RecipeManagerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8686/RecipeManager/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RECIPEMANAGERSERVICE_WSDL_LOCATION = url;
        RECIPEMANAGERSERVICE_EXCEPTION = e;
    }

    public RecipeManagerService() {
        super(__getWsdlLocation(), RECIPEMANAGERSERVICE_QNAME);
    }

    public RecipeManagerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RECIPEMANAGERSERVICE_QNAME, features);
    }

    public RecipeManagerService(URL wsdlLocation) {
        super(wsdlLocation, RECIPEMANAGERSERVICE_QNAME);
    }

    public RecipeManagerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RECIPEMANAGERSERVICE_QNAME, features);
    }

    public RecipeManagerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RecipeManagerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RecipeManagerWS
     */
    @WebEndpoint(name = "RecipeManagerWSPort")
    public RecipeManagerWS getRecipeManagerWSPort() {
        return super.getPort(new QName("http://recipe.metier.webService/", "RecipeManagerWSPort"), RecipeManagerWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RecipeManagerWS
     */
    @WebEndpoint(name = "RecipeManagerWSPort")
    public RecipeManagerWS getRecipeManagerWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://recipe.metier.webService/", "RecipeManagerWSPort"), RecipeManagerWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RECIPEMANAGERSERVICE_EXCEPTION!= null) {
            throw RECIPEMANAGERSERVICE_EXCEPTION;
        }
        return RECIPEMANAGERSERVICE_WSDL_LOCATION;
    }

}