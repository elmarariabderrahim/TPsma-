
package webService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webService package. 
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

    private final static QName _GetMajorantResponse_QNAME = new QName("http://webService/", "getMajorantResponse");
    private final static QName _GetValidantResponse_QNAME = new QName("http://webService/", "getValidantResponse");
    private final static QName _AjouterEtudResponse_QNAME = new QName("http://webService/", "AjouterEtudResponse");
    private final static QName _GetNoteResponse_QNAME = new QName("http://webService/", "getNoteResponse");
    private final static QName _AjouterEtud_QNAME = new QName("http://webService/", "AjouterEtud");
    private final static QName _GetValidant_QNAME = new QName("http://webService/", "getValidant");
    private final static QName _GetMajorant_QNAME = new QName("http://webService/", "getMajorant");
    private final static QName _GetNote_QNAME = new QName("http://webService/", "getNote");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AjouterEtudResponse }
     * 
     */
    public AjouterEtudResponse createAjouterEtudResponse() {
        return new AjouterEtudResponse();
    }

    /**
     * Create an instance of {@link GetNoteResponse }
     * 
     */
    public GetNoteResponse createGetNoteResponse() {
        return new GetNoteResponse();
    }

    /**
     * Create an instance of {@link GetValidant }
     * 
     */
    public GetValidant createGetValidant() {
        return new GetValidant();
    }

    /**
     * Create an instance of {@link AjouterEtud }
     * 
     */
    public AjouterEtud createAjouterEtud() {
        return new AjouterEtud();
    }

    /**
     * Create an instance of {@link GetMajorantResponse }
     * 
     */
    public GetMajorantResponse createGetMajorantResponse() {
        return new GetMajorantResponse();
    }

    /**
     * Create an instance of {@link GetValidantResponse }
     * 
     */
    public GetValidantResponse createGetValidantResponse() {
        return new GetValidantResponse();
    }

    /**
     * Create an instance of {@link GetNote }
     * 
     */
    public GetNote createGetNote() {
        return new GetNote();
    }

    /**
     * Create an instance of {@link GetMajorant }
     * 
     */
    public GetMajorant createGetMajorant() {
        return new GetMajorant();
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMajorantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getMajorantResponse")
    public JAXBElement<GetMajorantResponse> createGetMajorantResponse(GetMajorantResponse value) {
        return new JAXBElement<GetMajorantResponse>(_GetMajorantResponse_QNAME, GetMajorantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getValidantResponse")
    public JAXBElement<GetValidantResponse> createGetValidantResponse(GetValidantResponse value) {
        return new JAXBElement<GetValidantResponse>(_GetValidantResponse_QNAME, GetValidantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterEtudResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "AjouterEtudResponse")
    public JAXBElement<AjouterEtudResponse> createAjouterEtudResponse(AjouterEtudResponse value) {
        return new JAXBElement<AjouterEtudResponse>(_AjouterEtudResponse_QNAME, AjouterEtudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getNoteResponse")
    public JAXBElement<GetNoteResponse> createGetNoteResponse(GetNoteResponse value) {
        return new JAXBElement<GetNoteResponse>(_GetNoteResponse_QNAME, GetNoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterEtud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "AjouterEtud")
    public JAXBElement<AjouterEtud> createAjouterEtud(AjouterEtud value) {
        return new JAXBElement<AjouterEtud>(_AjouterEtud_QNAME, AjouterEtud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValidant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getValidant")
    public JAXBElement<GetValidant> createGetValidant(GetValidant value) {
        return new JAXBElement<GetValidant>(_GetValidant_QNAME, GetValidant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMajorant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getMajorant")
    public JAXBElement<GetMajorant> createGetMajorant(GetMajorant value) {
        return new JAXBElement<GetMajorant>(_GetMajorant_QNAME, GetMajorant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "getNote")
    public JAXBElement<GetNote> createGetNote(GetNote value) {
        return new JAXBElement<GetNote>(_GetNote_QNAME, GetNote.class, null, value);
    }

}
