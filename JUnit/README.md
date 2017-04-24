1) Download junit.jar and hamcrest-core.jar by clicking their names/links at:  
https://github.com/junit-team/junit4/wiki/Download-and-Install

2) Save them in a directory.

3) If you're using Eclipse like me (instead of Terminal/Commandline), then go through settings to put these two .jar files into the build path for this project.  This is what I had to do:  

* Right-click on the project folder ('myjunittest') displayed inside Eclipse, in the Project Explorer.
* Select 'Properties'.
* Select 'Java Build Path' on the left side of the menu that appears.
* Click 'Add External JARs'.
* Navigate the folders to each of the .jar files above, and select them.
* Make sure to hit 'Apply' and then 'OK' in that same earlier menu that appeared to confirm the things added to the Java Build Path.

4) Make sure to include a line like this in your code:
import org.junit.*;

5) You can run the .java file itself where unit test methods marked with "@Test" (and see a progress bar), or you can use another .java file to run all the other unit test files (and use a Result variable to get a printout of success):



Example tutorials to learn from:

http://www.mkyong.com/unittest/junit-4-tutorial-1-basic-usage/

https://www.tutorialspoint.com/junit
https://www.tutorialspoint.com/junit/junit_environment_setup.htm
https://www.tutorialspoint.com/junit/junit_basic_usage.htm