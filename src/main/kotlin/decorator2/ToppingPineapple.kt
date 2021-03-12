package decorator2

class ToppingPineapple(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithPineapple()
    }

    override fun cashAmount(): Int
    {
        return super.cashAmount() + 110
    }

    private fun decorateWithPineapple(): String
    {
        return " with Pineapple"
    }
}
