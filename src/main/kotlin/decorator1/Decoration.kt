package decorator1

abstract class Decoration(private val tree: Pizza) : Pizza
{
    override fun decorate(): String
    {
        return tree.decorate()
    }
}
