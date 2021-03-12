package decorator2

class ToppingPeperoni(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithPeperoni()
    }

    override fun cashAmount(): Int
    {
        return super.cashAmount() + 65
    }

    private fun decorateWithPeperoni(): String
    {
        return " with Peperoni"
    }
}
