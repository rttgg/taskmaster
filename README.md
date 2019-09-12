# Overview
Build a new application called TaskMaster. 
It’s a task-tracking application with the same basic goal as Trello: allow
 users to keep track of tasks to be done and their status. While we’ll start
  today with a basic feature set, we will continue building out the capabilities
   of this application over time.

 - Build will have the added task of deployment using the cloud.
 - get to use a remote NoSQL database as the data store for your application. As we continue to build out our skill 
with NoSQL

-Using DynamoDB With Java resource
-Verify your endpoints with Postman (or similar) 
 to ensure they are working as expected
 
 # Link to deployed application on S3
 http://demodev.us-west-2.elasticbeanstalk.com/taskmaster/tasks
 
 
Get All tasks
 GET http://demodev.us-west-2.elasticbeanstalk.com/taskmaster/tasks
 
 ## Links to Back End Routes
  - GET route: /taskmaster/tasks - returns task data in JSON format
  - POST route: /taskmaster/tasks
  - PUT route: /taskmaster/tasks/{taskid}/state
 
 
# Screenshot

 ![screenshot for the application](../taskmaster/assets/screenshot.png)
 
 
 # To Run:
 clone repo
 download intellij
 update application.properties
 run 'build project'
 
# Resources
AWS
The AWS Java SDK
Integrating DynamoDB and Spring
Using DynamoDB With Java

The AWS Java SDK
Integrating DynamoDB and Spring

The AWS Java SDK
Configure S3 for Static Sites

# Class Resources
Nhu, Jackie, Fabian, Joachen

