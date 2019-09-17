package chapter03

// Listing 3.12 Extracting a local function to avoid repetition

//class User(val id: Int, val name: String, val address: String)

fun saveUser2(user: User) {
    fun validate(user: User,
                 value: String,
                 fieldName: String){
        if ((value.isEmpty())) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

fun main() = saveUser2(User(2, "Random", ""))