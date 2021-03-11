package decorator1

class PizzaCheesyCrust : Pizza
{
    override fun decorate(): String
    {
        return "Cheesy Crust Pizza"
    }
}
