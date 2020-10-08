#Invoke other application's specific page (Activity) - Android
Why open other application's page?
We need not build all the features in our application when we can use the other application's feature. For example :
If We want to read a pdf file in our application, we don't actually need to create an activity to read the file and show it on the View. rather we can call the application which is capable of displaying the pdf file.
Why a Specific page?
The targeted application may have many features that we not needed. All we need is just to view the file. So we can specify the particular page/class to invoke and get our job done.
How to do it?
To achieve this, we have three simple steps.
Step 1: Change the visibility of the targeted Activity/class
We need to make sure that the targeted activity is visible to the other application, so that when our source application tries to open the class, we may not end up with an exception.



Step 2: Invoking the targeted Application's page
It is just a regular starting activity with few extra properties.



Step 3: Handling the Exception
It is always good to handle the exception because if the targeted application is not installed then we may end up in a crash. So we need to handle the ActivityNotFoundException to make sure the crash doesn't happen.



The sample application is available on GitHub
simonchius/InvokeOtherAndroidApp
You can't perform that action at this time. You signed in with another tab or window. You signed out in another tab or…github.com
