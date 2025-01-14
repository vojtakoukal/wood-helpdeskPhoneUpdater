
package com.cisco.axlapiservice;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "AXLAPIService", targetNamespace = "http://www.cisco.com/AXLAPIService/", wsdlLocation = "classpath:AXLAPI.wsdl")
public class AXLAPIService
    extends Service
{

    private final static URL AXLAPISERVICE_WSDL_LOCATION;
    private final static WebServiceException AXLAPISERVICE_EXCEPTION;
    private final static QName AXLAPISERVICE_QNAME = new QName("http://www.cisco.com/AXLAPIService/", "AXLAPIService");

    static {
        URL url = null;
        WebServiceException e = null;
        url = AXLAPIService.class.getClassLoader().getResource("AXLAPI.wsdl");
        AXLAPISERVICE_WSDL_LOCATION = url;
        AXLAPISERVICE_EXCEPTION = e;
    }

    public AXLAPIService() {
        super(__getWsdlLocation(), AXLAPISERVICE_QNAME);
    }

    public AXLAPIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns AXLPort
     */
    @WebEndpoint(name = "AXLPort")
    public AXLPort getAXLPort() {
        return super.getPort(new QName("http://www.cisco.com/AXLAPIService/", "AXLPort"), AXLPort.class);
    }

    private static URL __getWsdlLocation() {
        if (AXLAPISERVICE_EXCEPTION!= null) {
            throw AXLAPISERVICE_EXCEPTION;
        }
        return AXLAPISERVICE_WSDL_LOCATION;
    }

}
