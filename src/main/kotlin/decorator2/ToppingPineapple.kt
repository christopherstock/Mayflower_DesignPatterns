package decorator2

class ToppingPineapple(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithPineapple()
    }

    override fun cashAmount(): Double
    {
        return (super.cashAmount() + 1.10)
    }

    private fun decorateWithPineapple(): String
    {
        return " with Pineapple"
    }
}
