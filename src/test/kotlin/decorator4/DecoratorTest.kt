package decorator4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DecoratorTest
{
    @Test
    fun testDecorator()
    {
        val tree1: Pizza = DecorationMushroom(PizzaPan())
        assertEquals(
            "Pan Pizza with Mushroom",
            tree1.decorate()
        )
        val tree2: Pizza = DecorationSalami(
            DecorationMushroom(
                DecorationMushroom(PizzaPan())
            )
        )
        assertEquals(
            "Pan Pizza with Mushroom with Mushroom with Salami",
            tree2.decorate()
        )
    }
}
