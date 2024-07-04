
package com.ticket.services;

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
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TicketWebService", targetNamespace = "http://services.ticket.com/", wsdlLocation = "http://localhost:8080/TicketService/TicketWebService?wsdl")
public class TicketWebService_Service
    extends Service
{

    private final static URL TICKETWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException TICKETWEBSERVICE_EXCEPTION;
    private final static QName TICKETWEBSERVICE_QNAME = new QName("http://services.ticket.com/", "TicketWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/TicketService/TicketWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TICKETWEBSERVICE_WSDL_LOCATION = url;
        TICKETWEBSERVICE_EXCEPTION = e;
    }

    public TicketWebService_Service() {
        super(__getWsdlLocation(), TICKETWEBSERVICE_QNAME);
    }

    public TicketWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TICKETWEBSERVICE_QNAME, features);
    }

    public TicketWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, TICKETWEBSERVICE_QNAME);
    }

    public TicketWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TICKETWEBSERVICE_QNAME, features);
    }

    public TicketWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TicketWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TicketWebService
     */
    @WebEndpoint(name = "TicketWebServicePort")
    public TicketWebService getTicketWebServicePort() {
        return super.getPort(new QName("http://services.ticket.com/", "TicketWebServicePort"), TicketWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TicketWebService
     */
    @WebEndpoint(name = "TicketWebServicePort")
    public TicketWebService getTicketWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.ticket.com/", "TicketWebServicePort"), TicketWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TICKETWEBSERVICE_EXCEPTION!= null) {
            throw TICKETWEBSERVICE_EXCEPTION;
        }
        return TICKETWEBSERVICE_WSDL_LOCATION;
    }

}
