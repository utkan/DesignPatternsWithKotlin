package creational.com.iluwatar.monostate

import org.apache.log4j.BasicConfigurator

fun main(args: Array<String>) {
    BasicConfigurator.configure()
    val loadBalancer1 = LoadBalancer()
    val loadBalancer2 = LoadBalancer()
    loadBalancer1.serverRequest(Request("Hello"))
    loadBalancer2.serverRequest(Request("Hello World"))
}
