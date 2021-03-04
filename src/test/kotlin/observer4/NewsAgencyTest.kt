package observer4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NewsAgencyTest
{
    @Test
    fun testObserver() {
        val observable = NewsAgency()
        val observer = NewsChannel()

        observable.addObserver(observer)
        observable.setNews("news")
        assertEquals(observer.news, "news")
    }
}
