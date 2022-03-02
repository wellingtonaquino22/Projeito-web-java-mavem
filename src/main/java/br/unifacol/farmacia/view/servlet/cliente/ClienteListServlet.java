package br.unifacol.farmacia.view.servlet.cliente;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unifacol.petshop.entidade.Cliente;
import br.unifacol.petshop.exceptions.ClienteException;
import br.unifacol.petshop.servicos.ClienteServico;

@WebServlet("/ClienteListServlet")
public class ClienteListServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
            throws ServletException, IOException {  
	     response.setContentType("text/html");  
	     PrintWriter out=response.getWriter(); 
	     try {
		     ClienteServico clienteServico=new ClienteServico();
		     ArrayList<Cliente> clientes=new ArrayList<Cliente>();
		     clientes=clienteServico.listarClientes();
		     out.println("<a href='http://localhost:8080/PethospWeb/cliente/cliente_cadastrar.jsp'>Add Novo Cliente</a>");  
		     out.println("<h1>Lista de Clientes</h1>");  
		       
		     
		       
		     out.print("<table border='1' width='100%'");  
		     out.print("<tr><th>Id</th><th>NOME</th><th>CPF</th><th>Email</th><th>Edit Cliente</th><th>Delete Cliente</th><th>ANIMAL</th></tr>");  
		     System.out.println("nome :: " + clientes.size());
		     for(Cliente e:clientes){  
		      out.print("<tr><td>"+e.getId()+"</td><td>"+e.getNome()+"</td><td>"+e.getCpf()+"</td> <td>"+e.getEmail()+"</td><td><a href='ClienteEditarServlet?id="+e.getId()+
		    		  "'>edit</a></td><td><a href='DeleteServlet?id="+e.getId()+"'>delete</a></td><td><a href='AnimalAddServlet?id="+e.getId()+"'>ADD</a></td></tr>");  
		     }  
		     out.print("</table>");  
		       
		     out.close(); 
	     } catch (Exception e) {
				System.out.println("Error - Conversao indisponivel:"+e.getMessage());
		}
		finally {
		      System.out.println("OPERACAO FINALIZADA");
	    }
 } 
    
    
}
