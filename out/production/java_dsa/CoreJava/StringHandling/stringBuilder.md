StringBuilder

Before I even show you the syntax, I want you to understand why Java created it.

Imagine this code
String s = "";

for (int i = 1; i <= 5; i++) {
s = s + i;
}

Looks innocent, right?

Most beginners think this happens:

"" → "1" → "12" → "123" → "1234" → "12345"

Like the same string keeps growing.

❌ Wrong.

Because...

Strings are immutable.

Every time you do

s = s + i;

Java creates a completely new String object.

Let's visualize it.

Initially
s
│
▼
""
First iteration (i = 1)

Java creates

"1"

Now

s
│
▼
"1"

""

The empty string is no longer used.

Second iteration (i = 2)

Java creates

"12"

Now

s
│
▼
"12"

"1"
Third iteration

Creates

"123"
Fourth

Creates

"1234"
Fifth

Creates

"12345"
Total objects created
""
"1"
"12"
"123"
"1234"
"12345"

👉 6 different String objects!

For just 5 numbers.

Now imagine this:

for(int i = 1; i <= 100000; i++)

😬 Java creates around 100,001 String objects.

Most of them become garbage immediately.

That means:

More memory
More garbage collection
Slower execution
Java engineers thought...

"Why keep creating new objects when all we want is to keep adding characters?"

So they introduced...

⭐ StringBuilder ⭐

Instead of creating new objects every time,

it has one mutable object.

Think of it as a whiteboard.

With a String, every change means throwing away the old paper and writing on a new sheet.

With a StringBuilder, you're just erasing and writing on the same whiteboard.

Creating a StringBuilder
StringBuilder sb = new StringBuilder();

Initially

sb
│
▼
""
Adding text
sb.append("Java");

Now

sb
│
▼
"Java"

Again

sb.append(" Programming");

Now

sb
│
▼
"Java Programming"

Notice...

It didn't create another object.

It modified the same one.

That's why it's called mutable.

Converting back to String

Eventually, you'll want a regular String.

String s = sb.toString();

Now

StringBuilder
│
▼
"Java Programming"

↓

String

"Java Programming"
Your first StringBuilder example
StringBuilder sb = new StringBuilder();

sb.append("Hello");
sb.append(" ");
sb.append("World");

System.out.println(sb);

Output:

Hello World