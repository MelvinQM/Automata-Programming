![alt text](assets/images/kopje.png)
# Dit is de readme voor week 4

Schrijf je verslag voor week 4 (en week 3 roostervrij)
Hier is de plantuml te zien van mijn statemachine ik heb meteen
een interface gebruikt met daarnaast nog een super klasse die functie mee kan geven
dit zorgt voor minder herhaling van code in de verschillende states. Ik vind dit persoonlijk
ook overzichtelijker
```plantuml
@startuml

!theme plain
top to bottom direction
skinparam linetype ortho

interface IState << interface >> {
  + b(): State
  + a(): State
}
class Machine {
  + Machine(): 
  + processB(): void
  + toString(): String
  + processA(): void
}
class State {
  + State(Machine): 
  + a(): State
  + b(): State
}
class StateF {
  + StateF(Machine): 
  + toString(): String
  + a(): State
  + b(): State
}
class StateQ {
  + StateQ(Machine): 
  + a(): State
  + b(): State
  + toString(): String
}
class StateR {
  + StateR(Machine): 
  + a(): State
  + toString(): String
  + b(): State
}
class StateS {
  + StateS(Machine): 
  + a(): State
  + b(): State
  + toString(): String
}
class TestMachine {
  + TestMachine(): 
  + main(String[]): void
}

State        -[#008200,dashed]-^  IState      
StateF       -[#000082,plain]-^  State       
StateQ       -[#000082,plain]-^  State       
StateR       -[#000082,plain]-^  State       
StateS       -[#000082,plain]-^  State       
@enduml

```

Hier zie je de plantuml van mijn statemachine met state T toegevoegd ik heb gekozen om hem tussen
state R en S te stoppen zodat er minder code veranderd moest worden
```plantuml
@startuml

!theme plain
top to bottom direction
skinparam linetype ortho

interface IState << interface >> {
  + b(): State
  + a(): State
}
class Machine {
  + Machine(): 
  + processB(): void
  + toString(): String
  + processA(): void
}
class State {
  + State(Machine): 
  + a(): State
  + b(): State
}
class StateF {
  + StateF(Machine): 
  + toString(): String
  + a(): State
  + b(): State
}
class StateQ {
  + StateQ(Machine): 
  + a(): State
  + b(): State
  + toString(): String
}
class StateR {
  + StateR(Machine): 
  + a(): State
  + toString(): String
  + b(): State
}
class StateS {
  + StateS(Machine): 
  + a(): State
  + b(): State
  + toString(): String
}
class StateT {
  + StateT(Machine): 
  + a(): State
  + toString(): String
  + b(): State
}
class TestMachine {
  + TestMachine(): 
  + main(String[]): void
}

State        -[#008200,dashed]-^  IState      
StateF       -[#000082,plain]-^  State       
StateQ       -[#000082,plain]-^  State       
StateR       -[#000082,plain]-^  State       
StateS       -[#000082,plain]-^  State       
StateT       -[#000082,plain]-^  State       
@enduml
```
State T toevoegen was aardig simpel naast een paar kleine veranderingen