package observer2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NewsAgencyTest
{
    @Test
    fun testObserver() {
        val agency = NewsAgency()
        agency.updateNews("Breaking News")

        assertEquals(agency.channelBloomberg.news, "Breaking News")
        assertEquals(agency.channelCNS.news, "Breaking News")
        assertEquals(agency.channelReuters.news, "Breaking News")
    }
}
