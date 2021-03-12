package decorator2

class PizzaNewYork : Pizza()
{
    override fun decorate(): String
    {
        return "New York Pizza"
    }


    override fun cashAmount(): Double
    {
        return 7.70
    }
}
