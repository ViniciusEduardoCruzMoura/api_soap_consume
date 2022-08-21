package br.edu.ifms.clientsoap2;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import br.edu.ifms.clientsoap2.servico.Client;
import br.edu.ifms.clientsoap2.servico.SEIClient;
import jakarta.xml.ws.Service;

public class App {
    public static void main( String[] args ) throws Exception {
    	URL url = new URL("http://localhost:8088/clientsoap?wsdl");
    	  
        QName qname = new QName("http://servico.clientsoap.ifms.edu.br/", 
        		"SIBClientService");
                 
        Service service = Service.create(url, qname);        
        
        System.out.println("App iniciado \n");
        
        
        SEIClient clientService = service.getPort(SEIClient.class);
        
        List<Client> list = clientService.listar();
        for(Client n: list) {
        	System.out.println(n.getId());
        	System.out.println(n.getFirstName());
        	System.out.println(n.getLastName());
        	System.out.println(n.getEmail());
        	System.out.println(n.getPhone());
        	System.out.println("----------------------------");
        }
        
        /**
        Client client = new Client();
        client.setFirstName("Cesar");
        client.setLastName("Augustus");
        client.setEmail("cesar.augustus@senatus.populusque.romanus");
        client.setPhone("992925181");
        
        boolean retorno = clientService.adicionar(client);  
        System.out.println(retorno);
        */
    }
    
}
