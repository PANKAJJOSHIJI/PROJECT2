	package business;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import persistence.Tentity;
import persistence.TravellerDAOImpl;
import persistence.TravellerEntity;
import persistence.classname;
import persistence.count1;
import persistence.countstar;

@Path("Traveller")
public class Resources {
   



	@POST
	@Path("signup")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String registerTraveller(SignUpDTO signUpDTO) {

		
		TravellerDAOImpl travellerDAOImpl = new TravellerDAOImpl();
		boolean status = travellerDAOImpl.registerNewTraveller(signUpDTO);
		return status ? "success" : "failure";
	}
	@POST
	@Path("star/{radio}")
	@Produces(MediaType.TEXT_PLAIN)
	public String star(@PathParam("radio") Integer radio) {
		TravellerDAOImpl travellerDAOImpl = new TravellerDAOImpl();
		starc st= new starc();
		//System.out.println(radio);
		st.setStar(radio);
		boolean status = travellerDAOImpl.countstar(st);
		System.out.println(status);
		return status ? "success" : "failure";
		}
	@POST
	@Path("signin/{email}/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String loginTraveller(@PathParam("email") String email ,@PathParam("name") String name) {
		TravellerDAOImpl travellerDAOImpl = new TravellerDAOImpl();
		SignUpDTO signUpDTO = new SignUpDTO();
		signUpDTO.setDoubt(email);
		signUpDTO.setName(name);
		System.out.println("EAFQFQWEF");
		//System.out.println(signInDTO.getEmail());
		boolean status = travellerDAOImpl.registerNewTraveller(signUpDTO);
		System.out.println(status);
		return status ? "success" : "failure";	
	}
	@POST
	@Path("addTrainee/{name}/{clsname}")
	@Produces(MediaType.TEXT_PLAIN)
	public String Trainee(@PathParam("name") String name,@PathParam("clsname") String clsname) {
		TravellerDAOImpl travellerDAOImpl = new TravellerDAOImpl();
		SignUpDTO signUpDTO = new SignUpDTO();
		signUpDTO.setName(name);
		classname cls=new classname();
		cls.setName(clsname);
		
		
		boolean status = travellerDAOImpl.addTrainee(signUpDTO,cls);
		System.out.println(status);
		return status ? "success" : "failure";	
	}

	@POST
	@Path("delete/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String DeleteTraveller(@PathParam("id") Integer id) {
		TravellerDAOImpl travellerDAOImpl = new TravellerDAOImpl();
		SignUpDTO signUpDTO = new SignUpDTO();
		signUpDTO.setId(id);
		
		//System.out.println("EAFQFQWEF");
		//System.out.println(signInDTO.getEmail());
		boolean status = travellerDAOImpl.delete(signUpDTO);
		System.out.println(status);
		return status ? "success" : "failure";	
	}
	
	
	
	
	
	@GET
	@Path("getall/{value}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<SignUpDTO> getAllDetails(@PathParam("value") String str){
		TravellerDAOImpl travellerDAOImpl=new TravellerDAOImpl();
		classname cls = new classname();
		System.out.println(str);
		List dtoList=new ArrayList<SignUpDTO>(); 
		if(str.equals("TL2"))
		{
			cls.setName(str);
		List<TravellerEntity> entityList=travellerDAOImpl.getAllEmployees(cls);
		//note syntax
		System.out.println("djisajd");
		
		for(TravellerEntity entity:entityList){
			SignUpDTO signUpDTO =new SignUpDTO();
			
			signUpDTO.setDoubt(entity.getDoubt());
			signUpDTO.setId(entity.getId());
			
			dtoList.add(signUpDTO);
		}
		}
		if(str.equals("SR3")){
			cls.setName(str);
			System.out.println("djisajjhfjksdhifded");
			List<Tentity> entityList=travellerDAOImpl.getAlllEmployees(cls);
			//note syntax
			
			for(Tentity entity:entityList){
				SignUpDTO signUpDTO =new SignUpDTO();
				
				signUpDTO.setDoubt(entity.getDoubt());
				signUpDTO.setId(entity.getId());
				
				dtoList.add(signUpDTO);
			}
		}
		return dtoList;
	}

	@GET
	@Path("getall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<SignUpDTO> getDetails(){
		TravellerDAOImpl travellerDAOImpl=new TravellerDAOImpl();
		
		
		List<TravellerEntity> entityList=travellerDAOImpl.getEmployees();
		List dtoList=new ArrayList<SignUpDTO>(); //note syntax
		
		for(TravellerEntity entity:entityList){
			SignUpDTO signUpDTO =new SignUpDTO();
			
			
			signUpDTO.setId(entity.getId());
			
			dtoList.add(signUpDTO);
		}
		
		return dtoList;
	}
	@GET
	@Path("GetData")
	@Produces(MediaType.APPLICATION_JSON)
	public List<classname> getAll(){
		TravellerDAOImpl travellerDAOImpl=new TravellerDAOImpl();
		List<classname> entityList=travellerDAOImpl.get();
		List dtoList=new ArrayList<SignUpDTO>(); //note syntax
		
		for(classname entity:entityList){
			classname cls = new classname();
			cls.setName(entity.getName());
			
			dtoList.add(cls);
		}
		
		return dtoList;
	}
	
	@POST
	@Path("add/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String Class(@PathParam("name")String name){
			TravellerDAOImpl travellerDAOImpl = new TravellerDAOImpl();
			classname cls = new classname();
			cls.setName(name);
			
			
		boolean status = travellerDAOImpl.addClass(cls);
		return status ? "success" : "failure";	}
	
	@POST
	@Path("fast/{count}")
	@Produces(MediaType.TEXT_PLAIN)
	public String fast(@PathParam("count") Integer count) {
		TravellerDAOImpl travellerDAOImpl = new TravellerDAOImpl();
		count2 cs=new count2();
		Integer c=0;
		cs.setCountFast(count);
		cs.setCountSlow(c);
	
		System.out.println("count incremented in fast");
		boolean status = travellerDAOImpl.fast(cs);
     
		return status ? "success" : "failure";	}
		
	@POST
	@Path("slow/{count}")
	@Produces(MediaType.TEXT_PLAIN)
	public String slow(@PathParam("count") Integer count) {
		TravellerDAOImpl travellerDAOImpl = new TravellerDAOImpl();
		count2 cs1=new count2();
		cs1.setCountSlow(count);
		Integer c=0;
		cs1.setCountFast(c);
		System.out.println("count incremented in slow");
		boolean status = travellerDAOImpl.slow(cs1);
		System.out.println(cs1.getCountSlow());
		return status ? "success" : "failure";
		}

	@GET
	@Path("getfs")
	@Produces(MediaType.APPLICATION_JSON)
		public List<count1> getfs(){
		TravellerDAOImpl travellerDAOImpl=new TravellerDAOImpl();
	Integer count=0,count2=0;
	String str="go Slow!!!!";
	String str1="go Fast!!!!!!";
		List<count1> get=travellerDAOImpl.getdetails();
		//System.out.println(get);
		List dtoList=new ArrayList<SignUpDTO>(); //note syntax
		
		
		for(int i=0;i<get.size();i++)
		{
			if(get.get(i).getCountFast()==1)
			count++;
			if(get.get(i).getCountSlow()==1)
				count2++;
		}
		
		if(count>=count2)
			dtoList.add(str);
		else
			dtoList.add(str1);
		
		
		return dtoList;
	}

		@GET
		@Path("getstar")
		@Produces(MediaType.APPLICATION_JSON)
			public List<countstar> getstar(){
			TravellerDAOImpl travellerDAOImpl=new TravellerDAOImpl();
		Integer count=0,count2=0,count3=0;
		
			List<countstar> get=travellerDAOImpl.getstardetails();
			//System.out.println(get);
			List dtoList=new ArrayList<SignUpDTO>(); //note syntax
			System.out.println(get.size());
			for(int i=0;i<get.size();i++){
				if(get.get(i).getStar()!=0)
				{
					
					count+=get.get(i).getStar();
					
				}
			}
			System.out.println(count);
			System.out.println(count2);
			count3=count/get.size();
			System.out.println(count3);
			dtoList.add(count3);
			System.out.println(dtoList);
			
			return dtoList;
		}
}
