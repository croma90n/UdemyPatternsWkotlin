package creational.factorymethod

// es un Concrete Product del Factory Method

class PayPal: IPayment {
    override fun doPayment() {
        println("forma de pago: PayPal")
    }
}