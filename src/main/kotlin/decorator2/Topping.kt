package decorator2

abstract class Topping(private val decoTop: DecoratorTopping) : DecoratorTopping
{
    override fun decorate(): String
    {
        return decoTop.decorate()
    }

    override fun cashAmount(): Int
    {
        return decoTop.cashAmount()
    }
}
