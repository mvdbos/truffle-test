package org.vandenbos.foo;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.EthAccounts;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!"); // Display the string.
        Web3j web3 = Web3j.build(new HttpService());  // defaults to http://localhost:8545/
        Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().send();
        String clientVersion = web3ClientVersion.getWeb3ClientVersion();
        EthAccounts web3Foo = web3.ethAccounts().send();
        String accounts = web3Foo.getAccounts().get(0);
        System.out.println("Account: " + accounts); // Display the string.
    }
}
