* Itinera

** Introduction

This is a Spring Data JPA project used to create the api used for the Itinera project

Itinera is a website used to interact with other people in a world map.
It gives you the ability to look up for you next journey and to ask for interesting informations about the place

** Specificities

To import this project from eclipse, use the import existing maven projects

This application will create at launch :
- The models in JPA with an implementation of a class managing the ids (Entite)
- The models and its associated repository
- The controllers with its associated repository
- A class to makes the controllers easily manage the responses (RestResponse)

From the pom.xml, you can :
- Add, modify, remove dependencies
- Add, modify, remove plugins

You can find and modify in the application.properties :
- the configuration of the database connection
- different other informations
