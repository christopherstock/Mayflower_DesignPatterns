package decorator1

class DecorationMushroom(pizza: Pizza) : Decoration(pizza)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithMushroom()
    }

    private fun decorateWithMushroom(): String
    {
        return " with Mushroom"
    }
}
