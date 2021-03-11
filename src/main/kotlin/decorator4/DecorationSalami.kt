package decorator4

class DecorationSalami(pizza: Pizza) : Decoration(pizza)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithSalami()
    }

    private fun decorateWithSalami(): String
    {
        return " with Salami"
    }
}
