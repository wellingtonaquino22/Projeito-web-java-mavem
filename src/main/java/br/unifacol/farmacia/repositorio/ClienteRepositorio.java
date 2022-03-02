package br.unifacol.farmacia.repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.unifacol.farmacia.entidade.Cliente;
import br.unifacol.farmacia.interfaces.repositorio.IClienteRepositorio;

public class ClienteRepositorio extends GenericRepository<Cliente> implements IClienteRepositorio  {

	 @Override
	 public void salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		// Session sessao = HibernateUtil.getSessionFactory().openSession();
		 
		 EntityTransaction transacao = null;
		 EntityManagerFactory entityManagerFactory = null;
		 EntityManager entityManager=null;
			try {
					entityManagerFactory = Persistence.createEntityManagerFactory("farmaciapersistencia");
					entityManager = entityManagerFactory.createEntityManager();				  
					
					transacao = entityManager.getTransaction();
					transacao.begin();
					
					entityManager.persist(cliente);
					System.out.println("cliente CPF=" + cliente.getCpf());
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
 
	 
	public Cliente consultarPorCPF(String cpf) {

		 
			
		return null;
	}

	 
	public ArrayList<Cliente> consultarPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	 
	 

	 
	public void remover(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	 
	 


	@Override
	public boolean alterar(Cliente cliente) {
		 EntityTransaction transacao = null;
		 EntityManagerFactory entityManagerFactory = null;
		 EntityManager entityManager=null;
			try {
				  entityManagerFactory = Persistence.createEntityManagerFactory("petshoppersistencia");
				  entityManager = entityManagerFactory.createEntityManager();
				  
					
				transacao = entityManager.getTransaction();
				transacao.begin();
				entityManager.merge(cliente);
				System.out.println("cliente cpf=" + cliente.getCpf());
				System.out.println("PASSANDO NO salvar EDITAR CLIENTE");
				 				 
				transacao.commit();				
				
				System.out.println("PASSANDO NO salvar EDITAR CLIENTE salvar-FIN");
				
				 
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
		return false;
	}


	@Override
	public ArrayList<Cliente> listarTodos() {
		 EntityTransaction transacao = null;
		 EntityManagerFactory entityManagerFactory = null;
		 EntityManager entityManager=null;
			try {
				  entityManagerFactory = Persistence.createEntityManagerFactory("petshoppersistencia");
				  entityManager = entityManagerFactory.createEntityManager();
				  CriteriaBuilder cb = entityManager.getCriteriaBuilder();
			        CriteriaQuery<Cliente> cq = cb.createQuery(Cliente.class);
			        Root<Cliente> rootEntry = cq.from(Cliente.class);
			        CriteriaQuery<Cliente> all = cq.select(rootEntry);
			        TypedQuery<Cliente> allQuery = entityManager.createQuery(all);
			        System.out.println("PASSANDO NO LISTAR");
			        return new ArrayList<Cliente>( allQuery.getResultList());
					
				 
				
				 
				 
			} catch (RuntimeException e) {
				System.out.println("GerericRepository.salvar"+e.toString());
				 
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
