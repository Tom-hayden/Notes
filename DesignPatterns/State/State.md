#State Pattern

Notes taken from "Design pattens" by Gamma et Al.

## Intent
To allow an object to alter its behaviour when its internal state changes. The object will appear to change its class.

Click [here](https://en.wikipedia.org/wiki/State_pattern) for the wiki page (which includes a diagram).

##Applicability
Think about using the state pattern when:
 - An objects behaviorr depends on its state, and it must change its behavior at run-time depending on that state.
 - Operations have large, multipart conditional statements that depend on the object's state. This state is usually represented by one or more enumerated constants. Often, several operations will contain this same conditional structre. The state pattern puts each branch of the conditional in a seperate class. THis lets you treat the objects state as an object in its own right that can vary independently from other objects. 
 
 
 
