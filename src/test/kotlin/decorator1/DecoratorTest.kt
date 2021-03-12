package decorator1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DecoratorTest
{
    @Test
    fun testDecoratorPanPizza()
    {
        val pizza :DecoratorTopping = PizzaPan()
        val actual = pizza.decorate()
        assertEquals(
            "Pan Pizza",
            actual
        )
    }

    @Test
    fun testDecoratorPanPizzaWithMushroom()
    {
        val pizza :DecoratorTopping = ToppingMushroom(
            PizzaPan()
        )
        val actual = pizza.decorate()
        assertEquals(
            "Pan Pizza with Mushroom",
            actual
        )
    }

    @Test
    fun testDecoratorPanPizzaWithMushroomMushroomSalami()
    {
        val pizza: DecoratorTopping = ToppingSalami(
            ToppingMushroom(
                ToppingMushroom(
                    PizzaNewYork()
                )
            )
        )
        val actual = pizza.decorate()
        assertEquals(
            "New York Pizza with Mushroom with Mushroom with Salami",
            actual
        )
    }

    @Test
    fun testDecoratorCheesyCrustPizzaWithMushroomPeperoniMushroomSalami()
    {
        val pizza: DecoratorTopping = ToppingSalami(
            ToppingMushroom(
                ToppingPeperoni(
                    ToppingMushroom(
                        ToppingMushroom(
                            PizzaCheesyCrust()
                        )
                    )
                )
            )
        )
        val actual = pizza.decorate()
        assertEquals(
            "Pizza Cheesy Crust with Mushroom with Mushroom with Peperoni with Mushroom with Salami",
            actual
        )
    }
}
