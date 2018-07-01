package com.pluralsight;

import java.net.URL;
import java.net.URLClassLoader;

public class CustomClassLoaderDemo {

	public static void main(String[] args) {
		try {
		      URL url = new URL("file:////home/rajkumar/eclipse-workspace/PluralsightClassLoadingReflect/custom-classloader/lib/helper.jar");
		      URLClassLoader ucl1 = new URLClassLoader(new URL[]{url});
		      URLClassLoader ucl2 = new URLClassLoader(new URL[]{url});
		      Class clazz1 = Class.forName("chapter1.com.mantiso.Helper", false, ucl1);
		      Class clazz2 = Class.forName("chapter1.com.mantiso.Helper", false, ucl2);
		      System.out.println(clazz1 == clazz2);
		      System.out.println(clazz1.getName() == clazz2.getName());
		      ucl1.close();
		      ucl2.close();
		     // System.out.println(o);
		    } catch(Exception e) {
		      e.printStackTrace();
		    }

	}

}
