
try {
System.out.println("A");
int x = 10 / 0;
}
catch (Exception e) {
System.out.println("B");
}
catch (ArithmeticException e) {
System.out.println("C");
}

The answer is:

3. Compilation Error

Why?

Because:

ArithmeticException

is a subclass of

Exception

So when Java sees:

catch (Exception e)

it will already catch all exceptions that inherit from Exception, including ArithmeticException.

That means the next block:

catch (ArithmeticException e)

can never be reached.

Java detects this at compile time and gives an error similar to:

Exception ArithmeticException has already been caught

Think of it like inheritance:

Exception
↑
ArithmeticException

If you put the parent first:

catch(Exception e)

the child never gets a chance.

Correct order:

try {
int x = 10 / 0;
}
catch (ArithmeticException e) {
System.out.println("Arithmetic Error");
}
catch (Exception e) {
System.out.println("Some Other Error");
}

Rule:

Always catch more specific exceptions before more general exceptions.
Exception hierarchy (simplified):

Throwable
├── Error
└── Exception
├── ArithmeticException
├── NullPointerException
├── ArrayIndexOutOfBoundsException
├── IOException
└── ...