package br.unifacol.farmacia.view.servlet.cliente;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unifacol.petshop.entidade.Animal;
import br.unifacol.petshop.entidade.Cliente;
import br.unifacol.petshop.entidade.Endereco;
import br.unifacol.petshop.entidade.enum_.AnimalPorteEnum;
import br.unifacol.petshop.exceptions.ClienteException;
import br.unifacol.petshop.servicos.ClienteServico;

@WebServlet("/ClienteSalvarEditarServlet")
public class ClienteSalvarEditarServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void  doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	try {
    		
    		
    		String nome = req.getParameter("nome");    		 
            String cpf = req.getParameter("cpf");
            String email = req.getParameter("email");
             
            
    		long id = Integer.parseInt(req.getParameter("id"));
    		
            ClienteServico clienteServico=new ClienteServico();
            Cliente cliente=clienteServico.listarClientePorCodigo(id);
            cliente.setNome(nome);
            cliente.setCpf(cpf);
            cliente.setEmail(email);
           
                
            System.out.println("ID :" + id);
   		 	System.out.println("nome" + nome);
            System.out.println("email :" + email);
            System.out.println("cpf :" + cpf);
            System.out.println("Telefone :" + cliente.getTelefone());
            clienteServico.alterarCliente(cliente);
           
            resp.setContentType("text/html");
            PrintWriter out=resp.getWriter();  
	         
            
	     
	       
        	 
    		
        	
         
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        

        
    }
 } 
    
    
 
