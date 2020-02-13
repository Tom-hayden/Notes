# State Pattern

Notes taken from "Design pattens" by Gamma et Al.

## Intent
To allow an object to alter its behaviour when its internal state changes. The object will appear to change its class.

Click [here](https://en.wikipedia.org/wiki/State_pattern) for the wiki page (which includes a diagram).

## Applicability
Think about using the state pattern when:
 - An objects behaviorr depends on its state, and it must change its behavior at run-time depending on that state.
 - Operations have large, multipart conditional statements that depend on the object's state. This state is usually represented by one or more enumerated constants. Often, several operations will contain this same conditional structre. The state pattern puts each branch of the conditional in a seperate class. THis lets you treat the objects state as an object in its own right that can vary independently from other objects. 
 
![State of mind](https://github.com/Tom-hayden/Notes/blob/master/DesignPatterns/State/state.gif)
 
- Conext 
 - defines the interface of interest to client
 - maintains an instance of a ConcreteState subclass that defines the current state.
 
- State
 -defines an interfave for encapsulating the behavior associated with a particular state of the context

- ConcreteState subclasses
 - each subclass implements a behavior associated with a state of the context.
 
Notes:
 - Context delegates state-specific requests to the current concrete state object.
 - A context may pass itself as an argument to the state object handling the request. This lets the state object access the context if necessary.
 - Context is the primary interface for clients. Clents can configure a context with state objects. Once the context is configured, clients do not need to deal with state directly.
 - Either cintext if the concreteState subclasses can decide which state succeeds another and under what circumstances.
 
Consequences:
 - It localises state-specific behavior and partitions behavior for different states.
 - It makes state transitions explicit.
 - State objects can be shared.
 
Things to think about:
 - Who should define the state transition? 
   -It might be an idea to allow the states themselves to do this by adding an interface to the context that lets the state set the contexts current state explicitly. This will introduce dependencies between subclasses however.
 - Creating and destroying state objects.
  - A common implentation consideration is whether to create all of the states upfront or to only instanitate them when they are required and destroy them after afterwards.


Known uses 
- TCP connection protocols apparently.
