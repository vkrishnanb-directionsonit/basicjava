package edu.lessons.day96.jpa.empEntity;

import javax.persistence.PersistenceContext;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmpDAO
{
   public EmpDAO()
	{
		System.out.println("EmpDAO Loaded");
	}
private EntityManager getEntityManager()
{
	EntityManagerFactory factory = Persistence.createEntityManagerFactory (null);
	EntityManager em = factory.createEntityManager ();
	return em;
}
	public void addNewEmp(Emp e1)
	{
		EntityManager em=getEntityManager();
		EntityTransaction tx = em.getTransaction ();
		try{
			tx.begin ();
			em.persist(e1);//insert
			tx.commit ();
			System.out.println("New Emp Added "+e1.getNo());
		}catch(Exception err)
		{
			System.out.println("  Error "+err.getMessage());
		}
		finally{	cleanUp(em);}
	}
	public void addManyEmp(List<Emp> elist)
	{
		EntityManager em=getEntityManager();
		EntityTransaction tx = em.getTransaction ();
		int count=elist.size();
		try{
			tx.begin ();
			for(int i=0;i<count;i++)
			{
				em.persist(elist.get(i));//insert
			}
			tx.commit ();
			System.out.println("New Emp Added ");
		}catch(Exception err)
		{
			System.out.println("  Error "+err.getMessage());
		}
		finally{	cleanUp(em);}
	}

	public void updateEmp(Emp e1)
	{
		EntityManager em=getEntityManager();
		EntityTransaction tx = em.getTransaction ();
		try
		{
			tx.begin ();
			Emp emp=(Emp)em.find(Emp.class, e1.getNo()); //find();
			emp.setName(e1.getName());
			emp.setSalary(e1.getSalary());
			emp.setCv(emp.getCv()+1);
			tx.commit();
			System.out.println("Updated Emp "+e1.getNo());
		}catch(Exception err)
		{
			System.out.println("Failed to Update "+e1.getNo());
			System.out.println("Error "+err.getMessage());
		}finally
		{
			cleanUp(em);
		}
	}
	public void removeEmp(int eno)
	{
		EntityManager em=getEntityManager();
		EntityTransaction tx = em.getTransaction ();
		try
		{
			tx.begin ();
			Emp e1=(Emp)em.find(Emp.class, eno);
			em.remove(e1);// delete
			tx.commit();
			System.out.println("Removed Emp "+eno);
		}catch(Exception err)
		{
			System.out.println("Failed to Remove "+eno);
			System.out.println("Error "+err.getMessage());
		}finally
		{
			cleanUp(em);
		}
	}
	public Emp find(int eno)
	{
		Emp e1=null;
		EntityManager em=getEntityManager();
		try
		{
        e1=(Emp)em.find(Emp.class, eno);//select
       
	   }catch(Exception err)
		{
			System.out.println("Emp not Found "+eno);
			System.out.println("Error "+err.getMessage());
		}
		finally{		cleanUp(em);		}
		return e1;
    }

 	private void cleanUp(EntityManager em)
 	{
 		if(em.isOpen())
 		{
 			em.close();
 			System.out.println("EM Closed");
 		}
	}
}