compile the gradle java files using the commands below 
`javac -d build -sourcepath src src/main/javachapter1/com/mantiso/Helper.java`
`javac -d build -sourcepath src src/main/javachapter1/com/pluralsight/Main.java`

`export CLASSPATH = build`

-- Setting global classpath. However, this is not recommended as it is going to after the other classpath that been already set and other java application.

run the main application using the below command

`java chapter1.com.pluralsight.Main`

Better way to set classpath is to set the classpath option locally for the application. This is achieved using -cp option.

`export CLASSPATH =`
`java -cp build chapter1.com.pluralsight.Main`

If we have multiple classpath we can separate the classpath using `;` in windows and `:` in unix systems.

Now we move the Helper class into a jar file and move it into a folder called `lib` which is at same hierarchy of build directory.

`jar cvf helper.jar chapter1/com/mantiso/Helper.class`

`mkdir -p lib`
`mv helper.jar ../`


Now delete the Helper.class

`rm -f build/chapter1/com/mantiso/Helper.class`

If you execute Main class by `java -cp build chapter1.com.pluralsight.Main` you should get CNFE.

`java -cp build:lib/helper.jar chapter1.com.pluralsight.Main`

This inclused classes from both build directory and helper.jar file

