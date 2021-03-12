package decorator2

class ToppingPeperoni(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithPeperoni()
    }

    override fun cashAmount(): Double
    {
        return (super.cashAmount() + 0.65)
    }

    private fun decorateWithPeperoni(): String
    {
        return " with Peperoni"
    }
}
