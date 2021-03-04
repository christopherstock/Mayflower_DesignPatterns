package observer4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ONewsAgencyTest
{
    @Test
    fun testObserver() {
        val observable = ONewsAgency()
        val observer = ONewsChannel()

        observable.addObserver(observer)
        observable.setNews("news")
        assertEquals(observer.news, "news")
    }
}
