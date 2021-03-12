package decorator2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DecoratorTest
{
    @Test
    fun testDecoratorCheesyCrustPizzaWithMushroomPeperoniMushroomSalami()
    {
        val pizza: Pizza = DecorationSalami(
            DecorationMushroom(
                DecorationPeperoni(
                    DecorationMushroom(
                        PizzaCheesyCrust()
                    )
                )
            )
        )
        val actual = pizza.decorate()
        assertEquals("Pizza Cheesy Crust with Mushroom with Peperoni with Mushroom with Salami", actual)
    }
}
