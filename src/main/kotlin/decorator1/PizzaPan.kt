package decorator1

class PizzaPan : DecoratorTopping
{
    override fun decorate(): String
    {
        return "Pan Pizza"
    }
}
