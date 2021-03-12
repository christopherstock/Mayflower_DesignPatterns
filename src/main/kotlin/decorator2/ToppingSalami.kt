package decorator2

class ToppingSalami(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithSalami()
    }

    override fun cashAmount(): Int
    {
        return super.cashAmount() + 125
    }

    private fun decorateWithSalami(): String
    {
        return " with Salami"
    }
}
