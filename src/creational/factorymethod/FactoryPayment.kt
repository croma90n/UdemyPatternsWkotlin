package creational.factorymethod

// esto es el Creator del patron Factory Method

class FactoryPayment {

    companion object {
        fun buildPayment(typePayment: PaymentType): IPayment{

            when(typePayment){
                PaymentType.PAYPAL -> return PayPal()
                PaymentType.GOOGLEPAY -> return GooglePay()
                else -> return PayPal()

            }
        }

    }
}