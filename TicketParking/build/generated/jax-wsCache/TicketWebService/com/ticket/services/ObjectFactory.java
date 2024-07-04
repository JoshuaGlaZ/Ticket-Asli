
package com.ticket.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ticket.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckUser_QNAME = new QName("http://services.ticket.com/", "checkUser");
    private final static QName _CheckUserResponse_QNAME = new QName("http://services.ticket.com/", "checkUserResponse");
    private final static QName _Hello_QNAME = new QName("http://services.ticket.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://services.ticket.com/", "helloResponse");
    private final static QName _InsertUser_QNAME = new QName("http://services.ticket.com/", "insertUser");
    private final static QName _ViewListUser_QNAME = new QName("http://services.ticket.com/", "viewListUser");
    private final static QName _ViewListUserResponse_QNAME = new QName("http://services.ticket.com/", "viewListUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ticket.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckUser }
     * 
     */
    public CheckUser createCheckUser() {
        return new CheckUser();
    }

    /**
     * Create an instance of {@link CheckUserResponse }
     * 
     */
    public CheckUserResponse createCheckUserResponse() {
        return new CheckUserResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link InsertUser }
     * 
     */
    public InsertUser createInsertUser() {
        return new InsertUser();
    }

    /**
     * Create an instance of {@link ViewListUser }
     * 
     */
    public ViewListUser createViewListUser() {
        return new ViewListUser();
    }

    /**
     * Create an instance of {@link ViewListUserResponse }
     * 
     */
    public ViewListUserResponse createViewListUserResponse() {
        return new ViewListUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticket.com/", name = "checkUser")
    public JAXBElement<CheckUser> createCheckUser(CheckUser value) {
        return new JAXBElement<CheckUser>(_CheckUser_QNAME, CheckUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticket.com/", name = "checkUserResponse")
    public JAXBElement<CheckUserResponse> createCheckUserResponse(CheckUserResponse value) {
        return new JAXBElement<CheckUserResponse>(_CheckUserResponse_QNAME, CheckUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticket.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticket.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticket.com/", name = "insertUser")
    public JAXBElement<InsertUser> createInsertUser(InsertUser value) {
        return new JAXBElement<InsertUser>(_InsertUser_QNAME, InsertUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewListUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViewListUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticket.com/", name = "viewListUser")
    public JAXBElement<ViewListUser> createViewListUser(ViewListUser value) {
        return new JAXBElement<ViewListUser>(_ViewListUser_QNAME, ViewListUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewListUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViewListUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ticket.com/", name = "viewListUserResponse")
    public JAXBElement<ViewListUserResponse> createViewListUserResponse(ViewListUserResponse value) {
        return new JAXBElement<ViewListUserResponse>(_ViewListUserResponse_QNAME, ViewListUserResponse.class, null, value);
    }

}
