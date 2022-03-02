package br.unifacol.farmacia.view.servlet.cliente;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.unifacol.farmacia.entidade.Cliente;
import br.unifacol.farmacia.exceptions.ClienteException;
import br.unifacol.farmacia.servicos.ClienteServico;

@WebServlet("/ClienteAddServlet")
public class ClienteAddServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	
    	
    	String nome = req.getParameter("nome");
    	String Dtnasc=req.getParameter("Data de Nascimento");
    	String sexo =req.getParameter("sexo");
        String cpf = req.getParameter("cpf");
        String email = req.getParameter("email");
        //String dataNascimento = req.getParameter("dataNascimento");
        String telefone = req.getParameter("telefone");
        String whatapp = req.getParameter("whatapp");
    	
        System.out.println("nome : " + nome);
        System.out.println("Data de nascimento : " + Dtnasc);
        System.out.println("sexo : " + sexo);
        System.out.println("cpf : " + cpf);
        System.out.println("email : " + email);
        System.out.println("telefone : " + telefone);
        System.out.println("whatsaap : " + whatapp);
    	 
    	
    	try {
    		ClienteServico clienteServico=new ClienteServico();
        	List<Cliente> cliente = null;
			Cliente novoCliente=new  Cliente(nome,Dtnasc,sexo,cpf,telefone,email,cliente);
			byte[] array = new byte[7]; // length is bounded by 7
		    
		    

			String cpfLong=String.valueOf(new Random().nextLong());
			clienteServico.cadastrarCliente(nome, Dtnasc,sexo,cpfLong , cpfLong+"@gmail.com", whatapp);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>Cliente Salvo</h1>");
        printWriter.print("<p> nome :: " + nome + "</p>");
        printWriter.print("<p> data Nascimento :: " + Dtnasc + "</p>");
        printWriter.print("<p> Sexo :: " + sexo + "</p>");
        printWriter.print("<p> cpf :: " + cpf + "</p>");
        printWriter.print("<p> email :: " + email + "</p>");
        printWriter.print("<p> telefone :: " + telefone + "</p>");
        printWriter.print("<p> Whatsapp :: " + whatapp + "</p>");
        
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();

        
    }
    
    
}
