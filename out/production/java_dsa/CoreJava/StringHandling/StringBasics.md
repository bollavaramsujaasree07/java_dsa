**A String is a sequence of characters.**

String name = "Sujji";
Here,
S
u
j
j
i
is stored as one object.
Unlike C, Java doesn't use character arrays to represent strings. Instead, it provides a built-in class called String.
String city = "Hyderabad";
String is actually a class.

**Why is String a Class and not a Primitive?**

Because strings need many operations like

length()
substring()
equals()
contains()
replace()
toUpperCase()

If String were primitive like int, none of these methods would exist.
Strings are Objects

When you write

String name = "Java";

you're creating an object.

That means String has

methods
properties
memory
references

**The Most Important Property of Strings
Strings are Immutable**



Immutable means:

Once a String object is created, it cannot be changed.

Example

String s = "Hello";

s.concat(" World");

System.out.println(s);