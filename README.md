# java_poetry_webapp

## Overview:
This app will take a folder full of text files (poems in this case) and display a random one every time the page reloads.  
This is a continuation of my first app (https://github.com/IgnatioFerreira/java_poetry_app)  
This app was deployed on google app engine and was visitable, but I discontinued it shortly after creating it. So no demonstration is available unfortunately. 

## Basic instsruction:
You will need to setup a google cloud account and configure a basic app engine instance.  
The configuration to be deployed to app engine is completed in this app and functional, so don't worry about that.  
mvn clean compile package && java -jar ./target/poetry-web-app-0.0.1-SNAPSHOT.jar  
mvn package appengine:deploy -Dapp.deploy.projectId=java-poetry-webapp  

