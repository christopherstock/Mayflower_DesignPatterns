package decorator2

class ToppingSalami(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithSalami()
    }

    override fun cashAmount(): Double
    {
        return (super.cashAmount() + 1.25)
    }

    private fun decorateWithSalami(): String
    {
        return " with Salami"
    }
}
