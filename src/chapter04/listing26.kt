package chapter04

// Listing 4.26 Replacing secondary constructors with factory methods

class User26 private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
                User26(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
                User26(FacebookUser(accountId).getFacebookName(accountId))
    }
}

fun main() {
    val subscribingUser = User26.newSubscribingUser("bob@gmail.com")
    val facebookUser = User26.newFacebookUser(4)

    println(subscribingUser.nickname)
    println(facebookUser.nickname)

}