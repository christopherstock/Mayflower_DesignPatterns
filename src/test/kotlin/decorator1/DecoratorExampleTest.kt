package decorator1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DecoratorExampleTest
{
    @Test
    fun testDecorator()
    {
        val example = DecoratorExample()
        example.news = "Breaking News"

        assertEquals("Breaking News", example.news)
    }
}
