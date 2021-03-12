package decorator1

class ToppingMushroom(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithMushroom()
    }

    private fun decorateWithMushroom(): String
    {
        return " with Mushroom"
    }
}
