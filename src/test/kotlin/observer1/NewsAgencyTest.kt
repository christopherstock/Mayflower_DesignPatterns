package observer1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NewsAgencyTest
{
    @Test
    fun testObserver() {
        val agency = NewsAgency()
        agency.updateNews("Breaking News")

        assertEquals(agency.channelCNN.news, "Breaking News")
    }
}
