package persistence;

import java.util.List;






import business.SignUpDTO;
import business.centity;
import business.count2;

public interface ITravellerDAO {
	
	public boolean registerNewTraveller(SignUpDTO signUpDTO);
	public boolean addClass(classname cls);
	public List<TravellerEntity> getAllEmployees(classname cls);
	public List<Tentity> getAlllEmployees(classname cls);
	public List<TravellerEntity> getEmployees();
	public boolean delete(SignUpDTO signUpDTO);
	public Boolean fast(count2 cs);
	public Boolean slow(count2 cs2);
	public  List<count1> getdetails();
	public  List<countstar> getstardetails();
	public boolean addTrainee(SignUpDTO signUpDTO,classname clsname);
	public boolean upload(Character i);
	public List<classname> get();
}
