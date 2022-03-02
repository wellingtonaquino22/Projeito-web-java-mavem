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

@WebServlet("/ClienteEditarServlet")
public class ClienteEditarServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void  doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	
    	
    	
    	
    	try {
    		long id = Integer.parseInt(req.getParameter("id"));
            
            System.out.println("ID :" + id);
            ClienteServico clienteServico=new ClienteServico();
            Cliente cliente=new  Cliente();
            cliente=clienteServico.listarClientePorCodigo(id);
            System.out.println("Nome :" + cliente.getNome());
            resp.setContentType("text/html");
            PrintWriter out=resp.getWriter();  
	        out.println("<h1>Editar Cliente</h1>");
            out.print("<form action='ClienteSalvarEditarServlet' method='get'>");  
	        out.print("<table>");  
	        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+cliente.getId()+"'/></td></tr>");  
	        out.print("<tr><td>Name:</td><td><input type='text' name='nome' value='"+cliente.getNome()+"'/></td></tr>");  
	        out.print("<tr><td>CPF:</td><td><input type='text' name='cpf' value='"+cliente.getCpf()+"'/>  	                </td></tr>");  
	        out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+cliente.getEmail()+"'/></td></tr>");  
	        
	        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
	        out.print("</table>");  
	        out.print("</form>");  
	          
	        out.close();  
        	 /*
    		
        	
        	Endereco enderecoCliente=new Endereco("Av 1","1","1","1","1","1"); 
			ArrayList<Animal> animaisCliente=new ArrayList<Animal>();
			
			Animal doguinho=new Animal("Pit","Cachorro","sdfsdf446545",AnimalPorteEnum.GRANDE,3,"MATADOR");
			animaisCliente.add(doguinho);
			clienteServico.cadastrarCliente(nome, dataNascimento, cpf, telefone, email, whatapp, enderecoCliente,   animaisCliente);*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        

        
    }
 } 
    
    
 
