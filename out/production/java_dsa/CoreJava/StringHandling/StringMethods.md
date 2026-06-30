
# Part 1 — Important String Methods

There are around 60+ methods in `String`, but companies repeatedly ask only about 15–20.

Let's start with the most useful ones.

---

## 1. length()

Returns the number of characters.

```java
String s = "Hello";

System.out.println(s.length());
```

Output

```
5
```

---

## 2. charAt(index)

Returns the character at the given index.

```java
String s = "Hello";

System.out.println(s.charAt(0));
System.out.println(s.charAt(4));
```

Output

```
H
o
```

Remember

```
Index starts from 0.
```

```
H e l l o
0 1 2 3 4
```

---

### What if index is invalid?

```java
String s = "Hello";

System.out.println(s.charAt(10));
```

Output

```
StringIndexOutOfBoundsException
```

---

## 3. substring()

Probably the most used String method.

### Syntax

```java
substring(beginIndex)
```

Example

```java
String s = "Programming";

System.out.println(s.substring(3));
```

Output

```
gramming
```

Because

```
Programming
0123456789...
   ^
```

Starts from index 3 till the end.

---

### Another version

```java
substring(begin, end)
```

Notice:

```
end is excluded.
```

Example

```java
String s = "Programming";

System.out.println(s.substring(0,7));
```

Output

```
Program
```

Not

```
Programm
```

Because

```
0 included
7 excluded
```

Very important.

---

## 4. equals()

Checks contents.

```java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b));
```

Output

```
true
```

---

## 5. equalsIgnoreCase()

Ignores uppercase/lowercase.

```java
String a = "JAVA";
String b = "java";

System.out.println(a.equalsIgnoreCase(b));
```

Output

```
true
```

---

## 6. compareTo()

This one confuses everyone initially.

It compares alphabetically (lexicographical order).

Example

```java
System.out.println("Apple".compareTo("Banana"));
```

Output

```
negative number
```

Because

```
Apple comes before Banana
```

---

Example

```java
System.out.println("Dog".compareTo("Cat"));
```

Output

```
positive number
```

Because

```
Dog comes after Cat
```

---

Example

```java
System.out.println("Java".compareTo("Java"));
```

Output

```
0
```

---

### Easy rule

```
Same strings → 0

First string smaller → Negative

First string larger → Positive
```

---

## 7. contains()

Checks if a string exists inside another.

```java
String s = "Java Programming";

System.out.println(s.contains("Program"));
```

Output

```
true
```

---

```java
System.out.println(s.contains("Python"));
```

Output

```
false
```

---

## 8. startsWith()

```java
String s = "Java Programming";

System.out.println(s.startsWith("Java"));
```

Output

```
true
```

---

## 9. endsWith()

```java
System.out.println(s.endsWith("ing"));
```

Output

```
true
```

---

## 10. indexOf()

Returns first occurrence.

```java
String s = "banana";

System.out.println(s.indexOf('a'));
```

Output

```
1
```

Because

```
b a n a n a
0 1 2 3 4 5
```

Stops at the first match.

---

If not found

```java
System.out.println(s.indexOf('z'));
```

Output

```
-1
```

---

## 11. lastIndexOf()

Searches from the end.

```java
String s = "banana";

System.out.println(s.lastIndexOf('a'));
```

Output

```
5
```

---

## 12. toUpperCase()

```java
String s = "java";

System.out.println(s.toUpperCase());
```

Output

```
JAVA
```

Original string?

Still

```
java
```

Remember:

Strings are immutable.

---

## 13. toLowerCase()

```java
String s = "JAVA";

System.out.println(s.toLowerCase());
```

Output

```
java
```

---

## 14. trim()

Removes spaces only from the beginning and end.

```java
String s = "   Java   ";

System.out.println(s.trim());
```

Output

```
Java
```

Not

```
J a v a
```

Internal spaces remain.

---

## 15. replace()

```java
String s = "Java";

System.out.println(s.replace('a','o'));
```

Output

```
Jovo
```

Original?

Still

```
Java
```

---

## 16. split()

Very useful in interviews.

```java
String s = "Apple,Mango,Banana";

String[] arr = s.split(",");
```

Now

```
arr[0] -> Apple

arr[1] -> Mango

arr[2] -> Banana
```

---

## 17. isEmpty()

```java
String s = "";

System.out.println(s.isEmpty());
```

Output

```
true
```

---

Difference:

```java
String s = " ";

System.out.println(s.isEmpty());
```

Output

```
false
```

Because it contains one space.


