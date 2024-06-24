# Final Proyect


### University
ULPGC





### Subject
DACD



## Resources 
-  IntelliJ IDEA
-  Git and GitHub
-  Maven
- Weather API: [OpenWeather 5 Day / 3 Hour Forecast API](https://openweathermap.org/forecast5)
- [SQLite Documentation](https://www.sqlite.org/docs.html)
-  README.md
- [Documentation ActiveMQ Broker](https://activemq.apache.org/using-activemq)
- [Postman](https://www.postman.com/) for API testing


 

## Architecture

![Organized project modules](/images/Archetype-removebg-preview.png)

**DataLake**: Stores all relevant data, creating separate files for weather predictions and hotel data. 

**DataMart**: Processes and refines data for user queries. 

**BusinessUnit**: Accesses historical data from the DataLake. In this project, when no specific parameters or locations are provided, it displays stored DataLake information. So the businessUnit is connected to datalake. 


## API Implementation: 

### OpenAPI Schema

```openapi: 3.0.0
info:
  title: Vacation Recommendation API
  version: 1.0.0
  description: An API for vacation recommendations based on hotels and weather predictions
paths:
  # Define your API paths here
components:
  schemas:
    Hotel:
      type: object
      properties:
        name:
          type: string
        location:
          type: string
        platformName:
          type: string
        price:
          type: number
        checkIn:
          type: string
        checkOut:
          type: string
    Weather:
      type: object
      properties:
        location:
          type: string
        date:
          type: string
        precipitation:
          type: number
        clouds:
          type: number
        temperature:
          type: number
        windSpeed:
          type: number
```

### Filter by Location
_________________________________________
Get all generalized information about hotels in the input location.

GET ```/api/vacation-recommendations?location=Gran_Canaria```
 
![Location](/images/Location.png)


### Filter by Temperature
_________________________________________
Get all hotels where the temperature of the Weather predictions of any location fulfill the criteria

GET ``` /api//vacation-recommendations?temperature=23```

![byTemperature](/images/byTemperature.jpg)

 

**Publisher/Subscriber Implementation:**
![Publisher/Subscriber](/images/publish-subscribe.png)
This application incorporates the Publisher/Subscriber pattern for working with events.



## Important Libraries
 - com.google.gson.JsonObject



## Important Plugin
### Apache Copy-Dependencies


```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-dependency-plugin</artifactId>
            <version>3.1.2</version>
            <executions>
                <execution>
                    <id>copy-dependencies</id>
                    <phase>package</phase>
                    <goals>
                        <goal>copy-dependencies</goal>
                    </goals>
                    <configuration>
                        <outputDirectory>${project.build.directory}/dependencies</outputDirectory>
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

# Design

## Class Diagram eventStoreBuilder:
![class_diagram_DatalakeBuilder](/images/datalakeBuilder.png)

## Class Diagram predictionProvider:
![class_diagram_PredictionProvider](/images/predictionProvider.png)

## Class Diagram hotelProvider:
![class_diagram_HotelProvider](/images/HOTELPROVIDER.png)

## Class Diagram businessUnit:
![class_diagram_businessUnit](/images/businessUnit.png)









### GitHub repositories that have been used as a reference:


[buckpal by thombergs](https://github.com/thombergs/buckpal): This repository is an example application for implementing Clean Architecture in Java. It demonstrates how to structure a Java application following Clean Architecture principles.


## Design Principles

 -Single Responsibility

-Interface Segregation


