package business;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;
public class AppConfig extends Application{
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<Class<?>>();
		resources.add(Resources.class);
		return resources;
	}
}
