# Readme voor week 2
![alt text](assets/images/kopje.png)

## Assignment 1
The diagram below shows how the classes in the code i wrote functions. 
It's a simple class of a car with some values. 
It has a constructer so all values have to be filled in, 
and has 2 functions Print() which prints some information about the car, 
and Honk() which prints out a string of a honk
## Car Diagram
```plantuml
@startuml

!theme plain
top to bottom direction
skinparam linetype ortho

class Auto {
+ Auto(String, String, int):
  ~ eigenaar: String
  ~ merk: String
  ~ gewicht: int
+ Print(): void
+ Honk(): void
  }
  class week5.singleton.Main {
+ week5.singleton.Main():
+ main(String[]): void
  }

@enduml
```
## Assignment 2
Below here you can see the relation between all the classes.
They are all subclasses of the class pet and inherit the 'name' string and 
the makeSound() function. Some classes split into more subclasses 
which then in turn inherit more values from those classes 
for example Poodle inherits the value for sound used 
in the function makeSound() being "Woof".

These are all used in the code to display a sort of mini show for pets. 
Where they all get called out with their names 
and make their respective makeSound() sound
## Pet Diagram
```plantuml

@startuml

!theme plain
top to bottom direction
skinparam linetype ortho

class Cat {
+ Cat(String):
  }
  class Chihuahua {
+ Chihuahua(String):
+ makeSound(): void
  }
  class Dog {
+ Dog(String):
  }
  class Pet {
+ Pet(String):
+ makeSound(): void
  name: String
  }
  class Poodle {
+ Poodle(String):
  }
  class Tiger {
+ Tiger(String):
  }

Cat        -[#000082,plain]-^  Pet       
Chihuahua  -[#000082,plain]-^  Dog       
Dog        -[#000082,plain]-^  Pet       
Poodle     -[#000082,plain]-^  Dog       
Tiger      -[#000082,plain]-^  Cat       
@enduml
```

## Object Oriented Programming
Objecten (dingen uit de werkelijkheid)
* Eigenschappen
* Functionaliteit

Objecten hebben interactie met elkaar om problemen op te lossen

Voordelen:
* Zorgt voor **structuur** in je programma wat helpt met het onderhouden van je applicatie
* Gelijkenis met werkelijkheid
* Hergebruik van objecten in andere programma's

Nadelen:
* OOP programma's kunnen trager zijn en gebruiken meer geheugen
* Te diep kunnen gaan in abstractie
* Het bouwen van OOP applicaties kan langer duren

OOB is geen programeertaal maar een programmeerparadigma
Een class is eigenlijk de groepering objecten.
![alt text](assets/images/classobject.png)
3 Componenten maken een class:
* Naam "Wat is het?" (Een waterfles)
* Eigenschappen "Wat zijn kenmerken?" (Kleur, merk, inhoud, ...)
* Gedrag "Wat kan je ermee?" (Drinken, vullen, recyclen, ...)