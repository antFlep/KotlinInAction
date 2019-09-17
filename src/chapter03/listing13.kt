package chapter03

// Listing 3.13 Accessing outer function parameters in a local function

fun saveUser3(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")
}

fun main() = saveUser3(User(3, "Alice", ""))