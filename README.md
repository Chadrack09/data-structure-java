# Data Structures Notes
## Commonly Used Data Structures
### 1. Linked List
Linked List are collections of data items "linked up in a chain",  insertion and deletion can be made anywhere in a linked list. Linked List are linear collection of self-referential class objects, called nodes, connected through reference links.  Typically a program accesses a linked list via a reference to its first node. The program accesses each subsequent node via the link reference stored in the previous node. 
Data in a Linked List is stored and removed dynamically, the program creates and deletes nodes as necessary. 

>**Note:** Stacks and Queues are linear data structures as well.  Trees are non-linear data structures.  Insertion in a Linked List is fast.
Linked List can be maintained in sorted order simply by inserting each new elements at the proper point in the list.✍🏾

**Role:** Linked Lists are appropriate when the number of data elements to be represented in the data structure is unpredictable.  Linked List are dynamic compared to conventional Java arrays, so they can increase and decrease as necessary. 

There are three types of Linked Lists, which are:

#### 1.1. Singly Linked List
Linked List nodes normally are not stored contiguously in memory.  Navigation in a singly Linked List is forward only. There is no way of back-tracking.


#### 1.2. Doubly Linked List
In a doubly linked list navigation is both ways (forward and backward).

#### 1.3. Circular Linked List
In a circular Linked List the last element is linked to the first element. 

### 2. Stacks
A Stack is a constrained version of a list. New nodes can be added to or removed from a stack only at the top; for this reason the Stack is referred to as Last-In and First-Out data structure. Primary methods for manipulating a stack are push and pop; which add a new node to the top of the stack and remove a node from the top of the stack.

Stack are important in compilers and operating systems; insertion and deletion are made only at one-end of a stack, its top.  Stack data structure is used to implement redo and undo feature. Good example will be of Microsoft Word Undo and redo operations.

### 3. Queues 
Queues are typically a first-in, first-out collection that models a waiting lines, other orders can also be specified. Notice a queue is a collection that represents a waiting line, insertion are made at the back and deletions are made at the front of the queue. Queues have a concept of head and tail (front and back); The insert is known as enqueue and the remove operation is known as dequeue. 

### 4. Trees

### 5. Graph