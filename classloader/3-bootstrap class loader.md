If we create a file String.java in java.lang package in classloader project and compile it using the below command

```
	package java.lang;

	public class String {
	
	}
```
Then add `	String s = new String("My String");	` into Main.java.

`javac -sourcepath src src/main/java/chapter1/com/pluralsight/Main.java -d build`

This should fail.

Then add this function into string class.

`public int getValue() {	return 42;	}`

Add the below logic into main.

```
		String s = new String();
		System.out.println(s.getValue());
```

Build main file using below command

javac -sourcepath src/main/java  src/main/java/chapter1/com/pluralsight/Main.java -d build 

Running the Main will result in below error

```
java -cp build  chapter1.com.pluralsight.Main
Hello From Helper
Exception in thread "main" java.lang.NoSuchMethodError: java.lang.String.getValue()I
        at chapter1.com.pluralsight.Main.main(Main.java:12)
```

This is because the bootstrap classloader loads the classes from rt.jar file during runtime.

bootsrap classloader path can't be overridden

`java -x ` provides the flags that we can pass to the runtime environment.

