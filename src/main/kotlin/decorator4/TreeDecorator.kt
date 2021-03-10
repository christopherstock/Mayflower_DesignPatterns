package decorator4

abstract class TreeDecorator(tree: ChristmasTree?) : ChristmasTree {
    private val tree: ChristmasTree? = tree
    override fun decorate(): String? {
        return tree!!.decorate()
    }
}
