package decorator2

class ToppingGarlic(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithGarlic()
    }

    override fun cashAmount(): Int
    {
        return super.cashAmount() + 25
    }

    private fun decorateWithGarlic(): String
    {
        return " with Garlic"
    }
}
