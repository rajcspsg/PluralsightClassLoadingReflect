package com.pluralsight;

import java.net.URL;
import java.net.URLClassLoader;

public class Main {
  public static void main(String[] args) {
    try {
      URL url = new URL("file:////home/rajkumar/eclipse-workspace/PluralsightClassLoadingReflect/custom-classloader/lib/helper.jar");
      URLClassLoader ucl = new URLClassLoader(new URL[]{url});
      Class clazz = ucl.loadClass("chapter1.com.mantiso.Helper");
      Object o = clazz.newInstance();
      ucl.close();
      System.out.println(o);
    } catch(Exception e) {
      e.printStackTrace();
    }

  }
}
