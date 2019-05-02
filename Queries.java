package persistence;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


// DONT MODIFY THIS CODE

public class Queries {
	
//	public static void createTable() {
//		try {
//			SessionFactory sf = HibernateUtility.createSessionFactory();
//			Session session = sf.openSession();
//			session.createSQLQuery("create table  TravellerDetails1(email varchar2(255) )").executeUpdate();
//			session.close();
//			sf.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}		
//	}
	 
	public static void insertQuery(){
		try {
			SessionFactory sf = HibernateUtility.createSessionFactory();
			Session session = sf.openSession();
			session.getTransaction().begin();

			session.createSQLQuery("Insert into TravellerDetails1 values('john123')").executeUpdate();
			session.getTransaction().commit();

			session.close();
			sf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}				
	}
	
//	
//	public static void selectQuery(){
//		try {
//			SessionFactory sf = HibernateUtility.createSessionFactory();
//			Session session = sf.openSession();
//			
//			//String hql = "Select td.userName, td.password, td.email, td.contactNumber from TravellerDetails td";
//			String hql="from TravellerEntity1";
//			Query query = session.createQuery(hql);
//			List<TravellerEntity> nameList = query.list();
//		
//			
//			for(TravellerEntity each:nameList){
//				System.out.println("Email:" + each.getEmail());
//				System.out.println("------------");
//			}
//			
//			session.close();
//			sf.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}				
//	}
	
	public static void main(String[] args) {
		//createTable();		
		insertQuery();		
		//selectQuery();

	}

}
