package decorator2

class PizzaCheesyCrust : Pizza()
{
    override fun decorate(): String
    {
        return "Pizza Cheesy Crust"
    }

    override fun cashAmount(): Double
    {
        return 8.50
    }
}
