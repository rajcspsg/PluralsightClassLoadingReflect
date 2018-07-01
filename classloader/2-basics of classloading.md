There are basically four types of classes in java

1. Core/base/bootstrap classes
2. extension classes
3. Delegate classes
4. Display of Delgation

files in JAVA_HOME/jre/lib/* are called base or core classes.
files in JAVA_HOME/jre/lib/ext/* are called extension classes.

In the chapter 1 example we run app using `java -cp build:lib/helper.jar chapter1.com.pluralsight.Main`.

If we move the helper.jar to extension directory we could run using below command.
`java -cp build chapter1.com.pluralsight.Main`


There are 2 different extensions directory possible based on type of JDK installed.

We could set our own extension using dynamic property as below.
`java -cp build -Djava.ext.dirs=lib chapter1.com.pluralsight.Main`

Since helper class in not present in above extension path above will fail. But below command will run successfully.

`java -cp build -Djava.ext.dirs=$JAVA_HOME/jre/lib/ext chapter1.com.pluralsight.Main`





