package decorator1

class PizzaNewYork : DecoratorTopping
{
    override fun decorate(): String
    {
        return "New York Pizza"
    }
}
