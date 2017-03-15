package org.vandenbos.foo

import org.web3j.protocol.Web3j
import org.web3j.protocol.http.HttpService

fun main(args: Array<String>) {
    val web3 = Web3j.build(HttpService())  // defaults to http://localhost:8545/
    val web3ClientVersion = web3.web3ClientVersion().send()
    val clientVersion = web3ClientVersion.web3ClientVersion
    val web3Foo = web3.ethAccounts().send()
    val accounts = web3Foo.accounts.joinToString(", ")
    println(clientVersion + " Accounts: " + accounts) // Display the string.
}
