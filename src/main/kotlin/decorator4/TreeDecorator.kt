package decorator4

abstract class TreeDecorator(private val tree: ChristmasTree?) : ChristmasTree
{
    override fun decorate(): String
    {
        return tree!!.decorate()
    }
}
