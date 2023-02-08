
## Dit is de readme voor week 1

Geef hier antwoord op de vragen van week 1 en leg uit hoe je programma werkt.

### Aantekeningen
- **CPU** = State machine
- **Memory/Registers** = State
- **Instruction/Cycle** = Transition

Complex applications can be designed and documented with
- UML state diagrams
- Java object has a value (state)
- Java method....

DEA = In elke staat alle inputs gedefinieerd (deterministic)    
NEA = Niet gedefineerde of dubbele overgangen toegestaan

NEA kost meestal minder werk.

## De 2D Array en de fsaExec Method
```java
public static void fsaExec(String input) {
    boolean[] acceptState = {false, false, false, true};
    
    // Two dimensional array
    int[][] followUpAlphabetStates = {
        {0, 1} //state [0] (fStates[[0]['a'] = 0 en [0]['b']=1 enz
        {0, 2} //state [1]
        {0, 3} //state [2]
        {3, 3} //state [3]
    } 
    /*  To call this variabel you need to fill in both indexes [a][b]
        a stands for which group you want to select from b 
        stands for which value you want from this group.    */
}
```