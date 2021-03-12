package decorator2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DecoratorTest
{
    @Test
    fun testDecoratorMonsterPizza()
    {
        val pizza: DecoratorTopping = ToppingSalami(
            ToppingMushroom(
                ToppingGarlic(
                    ToppingPeperoni(
                        ToppingHam(
                            ToppingPineapple(
                                ToppingGarlic(
                                    ToppingMushroom(
                                        ToppingPineapple(
                                            ToppingMushroom(
                                                PizzaCheesyCrust()
                                            )
                                        )
                                    )
                                )
                            )
                        )
                    )
                )
            )
        )

        val actualDecoration = pizza.decorate()
        assertEquals(
            "Pizza Cheesy Crust with Mushroom with Pineapple with Mushroom with Garlic with Pineapple with Ham "
            + "with Peperoni with Garlic with Mushroom with Salami",
            actualDecoration
        )

        val actualCashAmount = pizza.cashAmount()
        assertEquals(
            actualCashAmount,
            1655
        )
    }
}
