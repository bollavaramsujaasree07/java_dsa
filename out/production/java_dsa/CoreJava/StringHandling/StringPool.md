**What is the String Pool?**

The String Pool is a special area inside the JVM where Java stores string literals.

Whenever Java sees:

"Java"

it first checks:

"Does a String with the value "Java" already exist in the pool?"

If yes → reuse the existing object.
If no → create a new object and put it in the pool.

**Example** 

String s1 = "Java";
String s2 = new String("Java");

This is different.

Memory:

        String Pool

       +-----------+
       |  "Java"   |
       +-----------+
            ▲
            |
        (used to initialize)

Heap

      +-----------+
      |  "Java"   |
      +-----------+
            ▲
            |
           s2

s1 ─────────► Pool Object

Here:

s1 points to the pooled object.
new String("Java") always creates a new object on the heap.

So now there are two different objects with the same content.

**_Why does new behave differently?_**

Remember:

new Student();

always creates a new object.

Similarly,

new String("Java");

also says:

"I don't want to reuse an existing object. Create a brand-new one."

That's why Java makes a new String object.