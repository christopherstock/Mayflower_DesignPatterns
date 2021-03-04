package observer3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NewsAgencyTest
{
    @Test
    fun testObserver1() {
        val observable = NewsAgency()
        val observer = NewsChannel()

        observable.addObserver(observer)
        observable.setNews("news")
        assertEquals(observer.getNews(), "news")
    }
}
