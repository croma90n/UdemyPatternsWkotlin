import creational.factorymethod.FactoryPayment
import creational.factorymethod.IPayment
import creational.factorymethod.PaymentType

fun main(){
    println("dp")

    fun testFactoryMethod(){
        val pago: IPayment

        pago = FactoryPayment.buildPayment(PaymentType.PAYPAL)

        pago.doPayment()
    }

    testFactoryMethod()
}