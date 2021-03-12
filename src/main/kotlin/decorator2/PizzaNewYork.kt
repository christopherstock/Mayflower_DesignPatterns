package decorator2

class PizzaNewYork : Pizza()
{
    override fun decorate(): String
    {
        return "New York Pizza"
    }

    override fun cashAmount(): Int
    {
        return 770
    }
}
