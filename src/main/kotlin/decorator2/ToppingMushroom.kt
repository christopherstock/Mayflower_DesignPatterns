package decorator2

class ToppingMushroom(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithMushroom()
    }

    override fun cashAmount(): Double
    {
        return (super.cashAmount() + 0.75)
    }

    private fun decorateWithMushroom(): String
    {
        return " with Mushroom"
    }
}
