package chapter04

// Listing 4.18 Implementing toString() for Client

class Client18(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=$name, postalCode=$postalCode"
}

fun main(){
    println(Client18("Boris Johnson", 522323))
}