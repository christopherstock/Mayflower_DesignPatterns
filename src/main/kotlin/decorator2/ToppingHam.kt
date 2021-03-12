package decorator2

class ToppingHam(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithHam()
    }

    override fun cashAmount(): Int
    {
        return super.cashAmount() + 120
    }

    private fun decorateWithHam(): String
    {
        return " with Ham"
    }
}
