package persistence;


import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import business.SignUpDTO;
import business.SignInDTO;
import business.centity;
import business.count2;
import business.starc;

public class TravellerDAOImpl implements ITravellerDAO {

	public boolean registerNewTraveller(SignUpDTO signUpDTO) {

		try {
			
			TravellerEntity TravellerEntity = new TravellerEntity();
			TravellerEntity.setDoubt(signUpDTO.getDoubt());
			TravellerEntity.setName(signUpDTO.getName());
			
				SessionFactory sf = HibernateUtility.createSessionFactory();
				Session session = sf.openSession();
		session.getTransaction().begin();
//			session.save(TravellerEntity);
		
		List<hashmapp> list = session.createQuery("from hashmapp").list();
		System.out.println(list.size());
	            System.out.println("resultset:"+list);
	            boolean ans = list.contains("'+signUpDTO.getName()+'"); 
	           String str =signUpDTO.getName();
	            for(int i=0;i<list.size();i++){
	            	String name =list.get(i).getK();
	            	System.out.println(list.get(i).getK());
System.out.println(list.get(i).getV());
	            	if(name.equals(str)){
	            		session.createSQLQuery("insert into "+list.get(i).getV()+" values(sq.nextval,'"+signUpDTO.getName()+"','"+signUpDTO.getDoubt()+"')").executeUpdate();
	            		
	            	}
	            }
//	            Iterator iterator = list.iterator();
//	            while(iterator.hasNext()){
//	              String name = (String) iterator.next();
//	            
//				}
	        	session.getTransaction().commit();
				 session.close();
				 sf.close();	
		
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}




	public List<TravellerEntity>  getAllEmployees(classname cls) {
		SessionFactory sf = HibernateUtility.createSessionFactory();
	Session session = sf.openSession();
//	System.out.println(cls.getName());
//		String hql = "SELECT c.id,c.name FROM  "+cls.getName()+" c";
//		Query query = session.createQuery(hql);
		
		//List<TravellerEntity> list =query.list();

	List<TravellerEntity> list = session.createQuery("from TravellerEntity").list();
	System.out.println(list.size());
		//System.out.println(list.size());

		session.close();
		sf.close();
		return list ;
	}
	public List<Tentity>  getAlllEmployees(classname cls) {
		SessionFactory sf = HibernateUtility.createSessionFactory();
	Session session = sf.openSession();

	List<Tentity> list = session.createQuery("from Tentity").list();
	System.out.println(list.size());
		

		session.close();
		sf.close();
		return list ;
	}
	public List<TravellerEntity>  getEmployees() {
		SessionFactory sf = HibernateUtility.createSessionFactory();
	Session session = sf.openSession();
//	System.out.println(cls.getName());
//		String hql = "SELECT c.id,c.name FROM  "+cls.getName()+" c";
//		Query query = session.createQuery(hql);
		
		//List<TravellerEntity> list =query.list();

	List<TravellerEntity> list = session.createQuery("from TravellerEntity").list();
	System.out.println(list.size());
		//System.out.println(list.size());

		session.close();
		sf.close();
		return list ;
	}
	public List<classname> get() {
		SessionFactory sf = HibernateUtility.createSessionFactory();
		Session session = sf.openSession();

		List<classname> list = session.createQuery("from classname").list();
		System.out.println(list.size());

		session.close();
		sf.close();
		return list;
	}
public boolean addTrainee(SignUpDTO signUpDTO,classname clsname){
	try{
	SessionFactory sf = HibernateUtility.createSessionFactory();
	Session session = sf.openSession();
	
	HashMap<String, String> student = new HashMap<>();
	student.put(signUpDTO.getName(),clsname.getName());
	session.createSQLQuery("insert into hashmap_map values('"+signUpDTO.getName()+"','"+clsname.getName()+"')").executeUpdate();
	 System.out.println("Initial Mappings are: " + student); 
	 session.close();
		sf.close();
		
} catch (Exception e) {
	e.printStackTrace();
	return false;
}
return true;
	}
	public boolean addClass(classname cls){
		try {
			
			SessionFactory sf = HibernateUtility.createSessionFactory();
		Session session = sf.openSession();
		System.out.println(cls.getName());
		session.createSQLQuery("create table  "+cls.getName()+"(id number(10),name varchar2(25),doubt varchar2(255) )").executeUpdate();
		session.createSQLQuery("insert into list1 values('" +cls.getName()+"')").executeUpdate();
		
		session.close();
			sf.close();
			
				
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean delete(SignUpDTO signUpDTO) {
		try {
			
			TravellerEntity tEntity= new TravellerEntity();
			System.out.println(signUpDTO.getId());
			

			
			tEntity.setId(signUpDTO.getId());
			if (signUpDTO != null) {
				SessionFactory sf = HibernateUtility.createSessionFactory();
				Session session = sf.openSession();
				session.getTransaction().begin();
				session.delete(tEntity);
				session.getTransaction().commit();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean upload(Character i) {
		try {
			SessionFactory sf = HibernateUtility.createSessionFactory();
				Session session = sf.openSession();
				session.getTransaction().begin();
				session.createSQLQuery("insert into filename values('i')").executeUpdate();
				session.getTransaction().commit();
				
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}


	
	public boolean countstar(starc st) {

		try {
			countstar n = new countstar();

			//System.out.println(st.getStar());
			n.setStar(st.getStar());
			if (st != null) {
				SessionFactory sf = HibernateUtility.createSessionFactory();
				Session session = sf.openSession();
				session.getTransaction().begin();
				session.createSQLQuery("insert into starcountt values("+st.getStar()+")").executeUpdate();
				session.getTransaction().commit();
				// session.close();
				// sf.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public List<count1> getdetails(){
		
		
		SessionFactory sf = HibernateUtility.createSessionFactory();
		Session session = sf.openSession();
		List<count1> list1 =  session.createQuery("from count1").list();
		
		session.close();
		sf.close();
		return list1;
		
	}
public List<countstar> getstardetails(){


SessionFactory sf = HibernateUtility.createSessionFactory();
Session session = sf.openSession();
List<countstar> list1 =  session.createQuery("from countstar").list();

session.close();
sf.close();
return list1;

}
public Boolean fast(count2 cs){
	
	try {
		// System.out.println(signUpDTO.getEmail());
		
        count1 cs1=new count1();  
        System.out.println(cs);
		System.out.println(cs.getCountFast());
		cs1.setCountFast(cs.getCountFast());
		cs1.setCountSlow(cs.getCountSlow());
	
			SessionFactory sf = HibernateUtility.createSessionFactory();
			Session session = sf.openSession();
			session.getTransaction().begin();
		//session.save(cs1);
		session.createSQLQuery("insert into css values(sqp.nextval,"+cs.getCountFast()+","+cs.getCountSlow()+")").executeUpdate();
		
			//session.getTransaction().commit();
			session.close();
			 sf.close();
		
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
	return true;
	
}
public Boolean slow(count2 cs2){
	try {
		// System.out.println(signUpDTO.getEmail());
		
		 count1 cs1=new count1();  
		//System.out.println(SignUpDTO.getCountFast());
		cs1.setCountSlow(cs2.getCountSlow());
		
			SessionFactory sf = HibernateUtility.createSessionFactory();
			Session session = sf.openSession();
			session.getTransaction().begin();
			session.createSQLQuery("insert into css values(sqp.nextval,"+cs2.getCountFast()+","+cs2.getCountSlow()+")").executeUpdate();
			session.getTransaction().commit();
			// session.close();
			// sf.close();
		
	} 
	catch (Exception e)
	                 {
	
	                        e.printStackTrace();
		                   return false;
	}
	return true;
	
}
	}
	