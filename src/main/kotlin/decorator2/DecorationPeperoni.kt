package decorator2

class DecorationPeperoni(pizza: Pizza) : Decoration(pizza)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithPeperoni()
    }

    private fun decorateWithPeperoni(): String
    {
        return " with Peperoni"
    }
}
