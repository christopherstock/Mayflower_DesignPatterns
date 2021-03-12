package decorator2

class ToppingGarlic(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithGarlic()
    }

    override fun cashAmount(): Double
    {
        return (super.cashAmount() + 0.25)
    }

    private fun decorateWithGarlic(): String
    {
        return " with Garlic"
    }
}
