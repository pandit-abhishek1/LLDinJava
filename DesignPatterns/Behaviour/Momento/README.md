- undo last write 
- redo last undo
## Problem 
##### How to provid  undo/redo functionality or state restoration without exploring the objects internal state and breaking encapsulation.

## Solution
##### the Memento Patern capture the internal state of an object in a *memento*, allowing the object to restore its state later on without revealing internal details.