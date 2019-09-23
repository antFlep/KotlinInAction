package chapter04

// Listing 2.25 Defining a class with multiple secondary constructors

class User25 {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        nickname = FacebookUser(facebookAccountId).getFacebookName(facebookAccountId)
    }
}