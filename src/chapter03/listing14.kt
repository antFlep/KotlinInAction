package chapter03

// Listing 3.14 Extracting the logic into an extension function

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser4(user: User) {
    user.validateBeforeSave()

    // Save user to the database
}

fun main() = saveUser4(User(4, "", ""))