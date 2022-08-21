
package br.edu.ifms.clientsoap2.servico;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifms.clientsoap2.servico package. 
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

    private final static QName _Adicionar_QNAME = new QName("http://servico.clientsoap.ifms.edu.br/", "adicionar");
    private final static QName _AdicionarResponse_QNAME = new QName("http://servico.clientsoap.ifms.edu.br/", "adicionarResponse");
    private final static QName _Listar_QNAME = new QName("http://servico.clientsoap.ifms.edu.br/", "listar");
    private final static QName _ListarResponse_QNAME = new QName("http://servico.clientsoap.ifms.edu.br/", "listarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifms.clientsoap2.servico
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Adicionar }
     * 
     */
    public Adicionar createAdicionar() {
        return new Adicionar();
    }

    /**
     * Create an instance of {@link AdicionarResponse }
     * 
     */
    public AdicionarResponse createAdicionarResponse() {
        return new AdicionarResponse();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Adicionar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Adicionar }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.clientsoap.ifms.edu.br/", name = "adicionar")
    public JAXBElement<Adicionar> createAdicionar(Adicionar value) {
        return new JAXBElement<Adicionar>(_Adicionar_QNAME, Adicionar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdicionarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.clientsoap.ifms.edu.br/", name = "adicionarResponse")
    public JAXBElement<AdicionarResponse> createAdicionarResponse(AdicionarResponse value) {
        return new JAXBElement<AdicionarResponse>(_AdicionarResponse_QNAME, AdicionarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.clientsoap.ifms.edu.br/", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.clientsoap.ifms.edu.br/", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

}
