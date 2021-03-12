package decorator1

class ToppingPeperoni(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithPeperoni()
    }

    private fun decorateWithPeperoni(): String
    {
        return " with Peperoni"
    }
}
