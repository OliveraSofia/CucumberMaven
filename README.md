# CucumberMaven


This project is to have several ways and different tools as examples to be reused on my daily QA Automation practices or by others.

##The Features

There are two features, each of them are for different ways or needs. Some methods are reused between them and in other cases I have made new ones to adapt to the feature need.

## Amazon feature

On this feature I use properties from a file to configure which browser will be used. Amazon page is dynamic so I have to adapt the test cases to continue changing objects.
On this feature I have made on setup a method to detect the Operative system where it is running and the browser is set in the properties file. I have used switch for multiple item selections

## Wikipedia feature

This is a feature with static components but with a lot of scenarios. On this feature, I have made a setup where it is able to select on test cases which browser or browsers will be run. (or can be tested on different browsers on the same run)
I have used hashmaps for multiple item selections.


##Next Steps checklist

Next steps to cuntinue creating this template:

* Use a xls file to take sensitive data (usernames and passwords).
* Reserch Language reconigtion tools. 
* Implement appium to test on mobile platforms
