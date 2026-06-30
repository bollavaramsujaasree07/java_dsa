
# Important StringBuilder Methods

Think of `StringBuilder` as a **mutable String**. Almost every method modifies the existing object.

---

# 1. append()

Adds data to the end.

```java
StringBuilder sb = new StringBuilder();

sb.append("Hello");
sb.append(" ");
sb.append("World");

System.out.println(sb);
```

Output

```text
Hello World
```

The object changes like this:

```text
""
↓

"Hello"

↓

"Hello "

↓

"Hello World"
```

---

It even accepts different data types.

```java
StringBuilder sb = new StringBuilder();

sb.append("Age: ");
sb.append(20);
sb.append(" Marks: ");
sb.append(95.5);

System.out.println(sb);
```

Output

```text
Age: 20 Marks: 95.5
```

No need to convert integers or doubles into Strings.

---

# 2. insert()

Adds something at a particular index.

Syntax

```java
insert(index, value)
```

Example

```java
StringBuilder sb = new StringBuilder("Java");

sb.insert(4, " Programming");

System.out.println(sb);
```

Output

```text
Java Programming
```

Why?

```text
Java
0123

Insert at index 4

Java Programming
```

---

Another example

```java
StringBuilder sb = new StringBuilder("Jva");

sb.insert(1, "a");

System.out.println(sb);
```

Output

```text
Java
```

---

# 3. delete()

Deletes a range of characters.

Syntax

```java
delete(start, end)
```

⚠️ Just like `substring()`

**End index is excluded.**

Example

```java
StringBuilder sb = new StringBuilder("Java Programming");

sb.delete(4, 16);

System.out.println(sb);
```

Output

```text
Java
```

Because

```text
Java Programming
0123456789......

delete(4,16)

starts at 4

ends before 16
```

---

# 4. deleteCharAt()

Deletes only one character.

```java
StringBuilder sb = new StringBuilder("Java");

sb.deleteCharAt(2);

System.out.println(sb);
```

Output

```text
Jaa
```

Because

```text
Java

Delete 'v'
```

---

# 5. replace()

Unlike String's `replace()`, this modifies the same object.

Syntax

```java
replace(start, end, text)
```

Example

```java
StringBuilder sb = new StringBuilder("Java");

sb.replace(1, 3, "OO");

System.out.println(sb);
```

Output

```text
JOOa
```

Explanation

```text
Java

Replace characters at

1 → a

2 → v

with

OO

Result

JOOa
```

Again,

End index is excluded.

---

# 6. reverse()

One of the easiest methods.

```java
StringBuilder sb = new StringBuilder("Java");

sb.reverse();

System.out.println(sb);
```

Output

```text
avaJ
```

---

# 7. setCharAt()

Changes one character.

```java
StringBuilder sb = new StringBuilder("Java");

sb.setCharAt(0, 'K');

System.out.println(sb);
```

Output

```text
Kava
```

Notice

This modifies the existing object.

No new object.

---

# 8. length()

Same as String.

```java
StringBuilder sb = new StringBuilder("Programming");

System.out.println(sb.length());
```

Output

```text
11
```

---

# ⭐ 9. capacity() (Interview Favorite)

This is where interviews often catch people.

When you create:

```java
StringBuilder sb = new StringBuilder();
```

Most people think:

Capacity = 0

❌ Wrong.

Let's check.

```java
StringBuilder sb = new StringBuilder();

System.out.println(sb.capacity());
```

Output

```text
16
```

### Wait... why 16?

Java automatically reserves space for **16 characters**.

Think of it as:

```text
□□□□□□□□□□□□□□□□

16 empty boxes
```

Initially

```text
Length = 0

Capacity = 16
```

---

Now

```java
sb.append("Hello");
```

Length

```text
5
```

Capacity

```text
Still 16
```

---

Suppose you keep adding characters.

Eventually

```text
Length = 16

Capacity = 16
```

Everything fits.

---

Now you add **one more character**.

Java automatically increases the capacity.

It doesn't become 17.

It becomes

```text
(newCapacity = oldCapacity × 2) + 2
```

For 16,

```text
(16 × 2) + 2

34
```

Now

```text
Capacity = 34
```

This reduces the number of memory reallocations, making `StringBuilder` efficient.

---
