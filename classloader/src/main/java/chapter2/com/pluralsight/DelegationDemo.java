package chapter2.com.pluralsight;

import java.net.URL;
import java.net.URLClassLoader;

public class DelegationDemo {
	
	public static void main(String []args) {
		URLClassLoader classLoader = (URLClassLoader)ClassLoader.getSystemClassLoader();
		do {
			System.out.println("classloader : "+ classLoader);
			for(URL url : classLoader.getURLs()) {
				System.out.printf("\t %s\n", url.getPath());
			}
		} while((classLoader = (URLClassLoader)classLoader.getParent()) != null);
		System.out.println("Bootstrap Classloader: " + classLoader);
		//classLoader.close();
	}

}
