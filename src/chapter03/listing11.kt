package chapter03

// Listing 11 A function with repetitive code

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException( "Can't save user ${user.id}: empty Name")
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException("Can't save ${user.id}: empty Address")
    }

    // save user to database
}

fun main() {
    saveUser(User(1, "", ""))
}