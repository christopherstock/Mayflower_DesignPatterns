package decorator4

import decorator4.ChristmasTree

class ChristmasTreeImpl : ChristmasTree {
    override fun decorate(): String? {
        return "Christmas tree"
    }
}
