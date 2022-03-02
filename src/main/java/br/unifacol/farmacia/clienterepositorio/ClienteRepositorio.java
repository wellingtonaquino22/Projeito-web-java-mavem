package br.unifacol.farmacia.clienterepositorio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.unifacol.farmacia.entidade.Cliente;

public class ClienteRepositorio {

	public void salvar(Cliente novoCliente) {
		// TODO Auto-generated method stub
		EntityTransaction transacao = null;
		 EntityManagerFactory entityManagerFactory = null;
		 EntityManager entityManager=null;
			try {
					entityManagerFactory = Persistence.createEntityManagerFactory("farmaciapersistencia");
					entityManager = entityManagerFactory.createEntityManager();				  
					
					transacao = entityManager.getTransaction();
					transacao.begin();
					Object cliente = null;
					entityManager.persist(cliente);
					System.out.println("PASSANDO NO salvar -INIsdsdd");	
					
					transacao.commit();				
					
					System.out.println("PASSANDO NO salvar-FIN");
				
				 
			} catch (RuntimeException e) {
				System.out.println("GerericRepository.salvar"+e.toString());
				// TODO: handle exception
				//if (transacao != null)
					//transacao.rollback();
				throw e;
			} finally {
				//sessao.close();
			 if(entityManager!=null) {
				entityManager.close();
				entityManagerFactory.close();
				}
			}
		
	}

}
