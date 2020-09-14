package creational.factorymethod

// es un Concrete Product del Factory Method

class GooglePay: IPayment {
    override fun doPayment() {
        println("forma de pago: Google Payment")
    }
}