package bkmg.bookmanager

import org.springframework.stereotype.Component

@Component
class GreeterImpl: Greeter {
    override fun sayHello(name: String) = "Hello $name"
}
