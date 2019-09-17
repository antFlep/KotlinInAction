package chapter04

interface User{
    val nickname: String
}

// Listing 4.14 Implementing an interface property

class PrivateUser(override val nickname: String): User

class SubscribingUser(val email: String): User {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)

    fun getFacebookName(accountId: Int) = when(accountId % 2) {
        0 ->        "Good Guy"
        1 ->        "Bad Guy"
        else ->     "This guy should not exist"
    }
}

fun main() {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
    println(FacebookUser(124563).nickname)
    println(FacebookUser(87589494).nickname)
}