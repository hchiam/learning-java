# myJavaSandbox
My Java sandbox.

## How to compile and run code in Terminal/Command-Line:
http://stackoverflow.com/questions/2360995/how-do-i-compile-and-run-a-program-in-java-on-my-mac

javac HelloWorld.java

java HelloWorld

## How to compile a package:

https://www.tutorialspoint.com/java/java_packages.htm

(Create a folder MyFolder with MyFile.java in it, go into that folder and type inside the MyFile.java file:)

    package MyPackage;

(Also type this code in MyFile.java:)

    class MyFile {
        public static void main(String args[]) {
            System.out.println("Hello, World!");
        }
    }

(Terminal: stay in that same folder as MyFile.java and type:)

javac -d . MyFile.java

(A folder named MyPackage should be created next to it, containing a MyFile.class.)

http://stackoverflow.com/questions/9234488/running-java-class-from-terminal

(Terminal: go up one directory, i.e. outside the folder containing MyFile.java, and type:)

java -cp MyFolder MyPackage.MyFile

