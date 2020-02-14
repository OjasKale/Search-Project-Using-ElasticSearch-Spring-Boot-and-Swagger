# Search-Project-Using-ElasticSearch-Spring-Boot-and-Swagger
Search any property in large JSON files, Technologies used: Spring Boot, ElasticSearch, Swagger
Steps to run this application:  
# Pre-requisites 
1. Elasticsearch 7.5.2
2. Maven.
3. Java8 and above.
4. Spring Boot Version 2.2.4 and above.

# Steps to run the application
#STEP 1. Download Elastic search (This is using elasticsearch 7.5.2) from https://www.elastic.co/downloads/elasticsearch
Once download is completed unzip in desired folder. 

#STEP 2. Go to Config folder inside Elasticsearch and edit “elasticsearch.yml” go to line 17 and remove the # (uncomment the line) and edit with following line
cluster.name: Ojas-Project 
Now in the same file go to line 33 and edit the path.data line to following 

path.data: "< Exact Location of the place where this project is downloaded >"

e.g path.data: /Users/ojaskale/workspace/Spring-boot-elasticsearch-Example

#STEP 3. Now we need to start the elasticsearch engine, for this, go to elasticsearch folder (Unzipped folder in step 1) and run bin/elasticsearch file Windows: bin\elasticsearch.bat
Macos / Linux : bin/elasticsearch
(Further help on how to run elasticsearch enginer can be found at 
https://www.elastic.co/downloads/elasticsearch

#STEP 4. This step we run our application,
there are 2 ways
1. Open the project in your favorite IDE (I have used Eclipse) and run the ZendeskSearchProjectApplication.java file as Java application.
Or 
2. Go to the code directory and run following command:  
mvn install 
Once it runs completely it will create a snapshot in your target file. 
go to the target folder and run following command.
java -jar demo-0.0.1-SNAPSHOT.jar

#STEP 5. Now go onto the Browser and type  http://localhost:8080/swagger-ui.html#/
This will open a Swagger UI where you can search everything.   


