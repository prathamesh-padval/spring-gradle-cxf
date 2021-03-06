package https.paysecure.merchant_soap;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2020-07-05T15:37:04.064+05:30
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "IssuerWebService", 
                  wsdlLocation = "classpath:wsdl/Issuer.wsdl",
                  targetNamespace = "https://paysecure/merchant.soap/") 
public class IssuerWebService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("https://paysecure/merchant.soap/", "IssuerWebService");
    public final static QName IssuerWebServiceSoap = new QName("https://paysecure/merchant.soap/", "IssuerWebServiceSoap");
    static {
        URL url = IssuerWebService.class.getClassLoader().getResource("wsdl/Issuer.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(IssuerWebService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/Issuer.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public IssuerWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IssuerWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IssuerWebService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public IssuerWebService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public IssuerWebService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public IssuerWebService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns IssuerWebServiceSoap
     */
    @WebEndpoint(name = "IssuerWebServiceSoap")
    public IssuerWebServiceSoap getIssuerWebServiceSoap() {
        return super.getPort(IssuerWebServiceSoap, IssuerWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IssuerWebServiceSoap
     */
    @WebEndpoint(name = "IssuerWebServiceSoap")
    public IssuerWebServiceSoap getIssuerWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(IssuerWebServiceSoap, IssuerWebServiceSoap.class, features);
    }

}
