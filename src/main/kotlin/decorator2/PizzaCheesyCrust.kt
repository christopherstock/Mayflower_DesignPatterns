package decorator2

class PizzaCheesyCrust : Pizza()
{
    override fun decorate(): String
    {
        return "Pizza Cheesy Crust"
    }

    override fun cashAmount(): Int
    {
        return 850
    }
}
