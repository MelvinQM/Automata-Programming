# Automata & Programming 2023
![alt text](assets/images/kopje.png)
## Week 1 fsaExec Method & Regex | Melvin Moes 500905603

## De 2D Array and the fsaExec Method
What the code does is it receives an input in the form of a string then it takes the ASCII
values of each char and uses these to go through the states starting at default state 0 the boolean array basically says
that if you end on state 3 you are provided with a true.

The code: [FSAexec code](./FSAexec.java)

To call a 2D array you need to fill in both indexes [a][b]
'a' stands for which group you want to select from 'b'
stands for which value you want from this group.

### State diagram fsaExec code
![alt text](assets/images/week1states.png)

### Regex
Reguliere expressies also known as Regex is a way of finding patterns. You can use this to for example see if a string
has a certained letter or an email ands with '@hva.nl'

A regex that recognizes 1 or more letter a's:
"aa*" or "a{1,}" or "a+"

The kleene star *: 0 or more
The ?: 0 or 1
The plus (+):
Accolades { } :a range
Period: . : elk willekeurig teken.
Test it here https://regexr.com/

The pattern here is how i was able to check if a list of emails were valid.

```java
// First part says all characters except some special chars like '@' and '.'. Second part says end
// with @hva.nl the final condition says that casing doesn't matter
Pattern pattern = Pattern.compile("^\\w+@hva\\.nl$", Pattern.CASE_INSENSITIVE);
```
the rest of the code: [Regex Code](./MailChecker.java)
### Regex Cheatsheets
![alt text](assets/images/regexcheatsheet.png)
![alt text](assets/images/regexcheatsheet2.png)
![alt text](assets/images/regexcheatsheet3.png)

### State diagram Regex code


### Aantekeningen
- **CPU** = State machine
- **Memory/Registers** = State
- **Instruction/Cycle** = Transition

Complex applications can be designed and documented with
- UML state diagrams
- Java object has a value (state)
- Java method....

DEA = In every state all inputs are defined (deterministic)  
NEA = Not defined or double transitions allowed. (NEA usually costs less work.)