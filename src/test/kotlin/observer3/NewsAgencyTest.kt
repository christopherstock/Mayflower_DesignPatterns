package observer3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NewsAgencyTest
{
    @Test
    fun testObserver() {
        val observable = observer3.NewsAgency()
        val observer = observer3.NewsChannel()

        observable.addObserver(observer)
        observable.setNews("news")
        assertEquals(observer.news, "news")
    }
}
