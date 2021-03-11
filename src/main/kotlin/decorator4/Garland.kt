package decorator4

class Garland(tree: ChristmasTree?) : TreeDecorator(tree)
{
    override fun decorate(): String
    {
        return super.decorate() + decorateWithGarland()
    }

    private fun decorateWithGarland(): String
    {
        return " with Garland"
    }
}
