package br.unifacol.farmacia.view.servlet.cliente;

 
	import java.io.IOException;  
	import java.io.PrintWriter;  
	  
	import javax.servlet.ServletException;  
	import javax.servlet.annotation.WebServlet;  
	import javax.servlet.http.HttpServlet;  
	import javax.servlet.http.HttpServletRequest;  
	import javax.servlet.http.HttpServletResponse;

import br.unifacol.petshop.entidade.Animal;
import br.unifacol.petshop.entidade.Cliente;
import br.unifacol.petshop.servicos.ClienteServico;  
	@WebServlet("/ClienteEditServlet")  
	public class ClienteEditServlet extends HttpServlet {  
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
	    
	           throws ServletException, IOException {  
	        response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        out.println("<h1>Editar Cliente</h1>");  
	        String sid=request.getParameter("id");  
	        int id=Integer.parseInt(sid);  
	        System.out.println("EDITAR");
	        ClienteServico clienteServico=new ClienteServico();
	        Cliente cliente=clienteServico.listarClientePorCodigo(id);  
	          
	        out.print("<form action='EditServlet2' method='post'>");  
	        out.print("<table>");  
	        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+cliente.getId()+"'/></td></tr>");  
	        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+cliente.getNome()+"'/></td></tr>");  
	        out.print("<tr><td>CPF:</td><td><input type='text' name='text' value='"+cliente.getCpf()+"'/>  	                </td></tr>");  
	        out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+cliente.getEmail()+"'/></td></tr>");  
	        out.print("<tr><td>Animais:</td><td>");  
	        out.print("<select name='animais' style='width:150px'>");  
	      /*  for (Animal ani : cliente.getAnimais()) {
	        	  out.print("<option value='"+ani.getId()+"'>"+ani.getNome()+"</option>");
			}	*/       
	        out.print("</select>");  
	        out.print("</td></tr>");  
	        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
	        out.print("</table>");  
	        out.print("</form>");  
	          
	        out.close();  
	    }  
	}  