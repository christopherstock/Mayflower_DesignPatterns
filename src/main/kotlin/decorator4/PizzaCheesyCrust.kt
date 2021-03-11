package decorator4

class PizzaCheesyCrust : Pizza
{
    override fun decorate(): String
    {
        return "Cheesy Crust Pizza"
    }
}
