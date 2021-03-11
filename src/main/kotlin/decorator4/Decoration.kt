package decorator4

abstract class Decoration(private val tree: Pizza) : Pizza
{
    override fun decorate(): String
    {
        return tree.decorate()
    }
}
