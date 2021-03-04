package observer1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NewsAgencyTest
{
    @Test
    fun testObserver() {
        val agency = NewsAgency()
        agency.updateNews("The latest News")

        assertEquals(agency.channelCNN.news, "The latest News")
    }
}
