# SeleniumJava
Web Automation using Scripts:
Eclipse IDE with Java and Selenium

Selenium is one of the most widely used open source Web UI (User Interface) automation testing suite.It was originally developed by Jason Huggins in 2004 as an internal tool at Thought Works. Selenium supports automation across different browsers, platforms and programming languages.
Selenium can be easily deployed on platforms such as Windows, Linux, Solaris and Macintosh. Moreover, it supports OS (Operating System) for mobile applications like iOS, windows mobile and android.
Selenium supports a variety of programming languages through the use of drivers specific to each language. Languages supported by Selenium include C#, Java, Perl, Javascript, PHP, Python and Ruby.Currently, Selenium Web driver is most popular with Java and C#. Selenium test scripts can be coded in any of the supported programming languages and can be run directly in most modern web browsers. Browsers supported by Selenium include Internet Explorer, Mozilla Firefox, Google Chrome and Safari.

Cloning From GIT Repository:
 These are the steps to import GIT files into Eclipse. First, you have to add the git repository to Eclipse. To do so, first make the git repository view visible in Eclipse from the menu 'Window > Show views > Other > Git > Git Repositories'.
 
Eclipse will show the view somewhere. Click on 'Clone a Git repository' to begin the process.
 
Make sure to select Clone URL as repository source.
 
Enter the Git remote url under the URL path and all the remaining items will get auto populated.
 
Click Next.
 
Select branch as Master and click next.
Now, select the local path on your computer where Eclipse will store the project. In my case, I'm OK with the default path. Please, make sure to check the box 'Import all existing Eclipse project after clone finishes'. This is very important if the project on GitHub is not empty. Then, press 'Finish'.

 
Click on Finish and ensure the below folder structure is populated in the project explorer tree.

 
Now that we have imported all the java files and folder from Git repository. Its time to add all the supporting files as this is system dependent, we have to manually ensure all this files as associated to our java files. It is nothing but Java JRE environment variables and JAR files.
Below are the expected error message at this stage.
 

Add Jar files, follow the below steps.
1)	Right click on Demo and choose Build path and select Configure build path.
 
2)	Choose JRE environment, add selenium server and remove the below mentioned missing selenium server.
 
 
 
Install TestNG for Eclipse
Step 1:
•	Launch Eclipse.
•	On the menu bar, click Help.
•	Choose the "Eclipse Marketplace..." option.
 
Step 2: In the Eclipse Marketplace dialog box, type TestNG in the search box and press the search button( magnifying glass) or press enter key
 
Step 3: Click Install
 
Step 4: A new window for feature selection will open, Do not change anything andClick on confirm button
 
Step 5:
•	Click Next again on the succeeding dialog box until you reach the License Agreement dialog.
•	Click "I accept the terms of the license agreement" then click Finish.
 
Step 6: If you encounter a Security warning, just click OK
 
Wait for the installation to finish
 
Step 7: When Eclipse prompts you for a restart, just click Yes.
 
Step 8: After the restart, verify if TestNG was indeed successfully installed. Click Window > Preferences and see if TestNG is included on the Preferences list.
 
Download Chrome Driver 
1)	Go to “https://chromedriver.storage.googleapis.com/index.html?path=76.0.3809.68/” and download chromedriver_win32.zip and unzip the file and place it in Downloads folder. Now we are done with setup for supporting files.
