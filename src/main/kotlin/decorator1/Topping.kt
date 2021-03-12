package decorator1

abstract class Topping(private val decoTop: DecoratorTopping) : DecoratorTopping
{
    override fun decorate(): String
    {
        return decoTop.decorate()
    }
}
