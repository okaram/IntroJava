Boxed Values
===

In Java, we distinguish between *primitives*, like int and double, and *objects* like Strings and the ones we create. For primitives, Java stores and passes around the actual values, whereas for objects we store *references* to them in variables, and the actual object is stored in another location in memory.

Sometimes, we want to store and pass around a reference to a primitive value; we could create our own classes, but Java provides its own, which we in general call 'boxed' primitives. They usually have the same name as the primitive, but starting with an upper case letter (but for some primitives, the spell the whole word :)

|Primitive | Class |
|---    | --- |
| int       | Integer |
| double    | Double |
| char      | Character|