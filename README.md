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
 
- This ability should be at a route like POST /tasks/{id}/images. 
(This means it only needs to work for existing tasks, not as part of the
 initial creation of a task.)
- Your server should programmatically upload this image to S3.
- Your server should store the image URL (on S3) somewhere in its database, associated with the task.
- Fetching a single task (at GET /tasks/{id}) should also include the image URLs associated with that image.

 # Link to deployed application on S3
 http://demodev.us-west-2.elasticbeanstalk.com/taskmaster/tasks
 
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

