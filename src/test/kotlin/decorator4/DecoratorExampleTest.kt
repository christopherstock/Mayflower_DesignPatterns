package decorator4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DecoratorExampleTest
{
    @Test
    fun whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
        val tree1: ChristmasTree = Garland(ChristmasTreeImpl())
        assertEquals(
            tree1.decorate(),
            "Christmas tree with Garland"
        )
        val tree2: ChristmasTree = BubbleLights(
            Garland(Garland(ChristmasTreeImpl()))
        )
        assertEquals(
            tree2.decorate(),
            "Christmas tree with Garland with Garland with Bubble Lights"
        )
    }
}
