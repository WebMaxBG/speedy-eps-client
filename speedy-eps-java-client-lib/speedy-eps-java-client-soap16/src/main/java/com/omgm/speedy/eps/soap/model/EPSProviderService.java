
package com.omgm.speedy.eps.soap.model;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "EPSProviderService", targetNamespace = "http://ver01.eps.speedy.sirma.com/", wsdlLocation = "https://www.speedy.bg/eps/main01.wsdl")
public class EPSProviderService
    extends Service
{

    private final static URL EPSPROVIDERSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.omgm.speedy.eps.soap.model.EPSProviderService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.omgm.speedy.eps.soap.model.EPSProviderService.class.getResource(".");
            url = new URL(baseUrl, "https://www.speedy.bg/eps/main01.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'https://www.speedy.bg/eps/main01.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        EPSPROVIDERSERVICE_WSDL_LOCATION = url;
    }

    public EPSProviderService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EPSProviderService() {
        super(EPSPROVIDERSERVICE_WSDL_LOCATION, new QName("http://ver01.eps.speedy.sirma.com/", "EPSProviderService"));
    }
    
    public EPSProviderService(URL wsdlLocation) {
        super(wsdlLocation, new QName("http://ver01.eps.speedy.sirma.com/", "EPSProviderService"));
    }

    /**
     * 
     * @return
     *     returns EPSProvider
     */
    @WebEndpoint(name = "EPSProviderPort")
    public EPSProvider getEPSProviderPort() {
        return super.getPort(new QName("http://ver01.eps.speedy.sirma.com/", "EPSProviderPort"), EPSProvider.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EPSProvider
     */
    @WebEndpoint(name = "EPSProviderPort")
    public EPSProvider getEPSProviderPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ver01.eps.speedy.sirma.com/", "EPSProviderPort"), EPSProvider.class, features);
    }

}
