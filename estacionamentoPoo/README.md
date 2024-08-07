# Project Parking

You were hired to develop a simple parking control system. The system must manage vehicles and parking spaces.

## Diagram UML

```mermaid
classDriagram 
   class Vehicle {
    +String getPlate()
    +String getModel()
   }

   class Space {
    +int getNumber()
    +boolean isBusy()
    +void occupy(String plate)
    +void vacate()
   }

   class Parking {
    +void park(String plate, String model)
    +void remove(String plate)
    +boolean checkAvailability()
   }