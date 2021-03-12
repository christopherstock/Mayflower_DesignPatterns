package decorator2

class ToppingMushroom(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithMushroom()
    }

    override fun cashAmount(): Int
    {
        return super.cashAmount() + 75
    }

    private fun decorateWithMushroom(): String
    {
        return " with Mushroom"
    }
}
