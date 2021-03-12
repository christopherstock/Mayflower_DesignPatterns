package decorator1

class PizzaNewYork : Pizza()
{
    override fun decorate(): String
    {
        return "New York Pizza"
    }
}
