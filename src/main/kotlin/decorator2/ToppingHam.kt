package decorator2

class ToppingHam(decoTop: DecoratorTopping) : Topping(decoTop)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithHam()
    }

    override fun cashAmount(): Double
    {
        return (super.cashAmount() + 1.20)
    }

    private fun decorateWithHam(): String
    {
        return " with Ham"
    }
}
