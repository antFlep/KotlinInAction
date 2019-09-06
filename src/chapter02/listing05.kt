package chapter02

// Listing 2.5 Declaring a mutable property in a class

class Person1 (
        val name: String,
        var isMarried: Boolean
)
// val -> Read-only property generates a field and a trivial getter
// var -> Writable property: a field, a getter, and a setter
