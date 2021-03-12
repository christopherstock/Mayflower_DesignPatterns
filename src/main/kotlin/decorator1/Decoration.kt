package decorator1

abstract class Decoration(private val pizza: Pizza) : Pizza
{
    override fun decorate(): String
    {
        return pizza.decorate()
    }
}
