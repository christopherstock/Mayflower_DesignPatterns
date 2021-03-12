package decorator1

class ToppingSalami(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithSalami()
    }

    private fun decorateWithSalami(): String
    {
        return " with Salami"
    }
}
