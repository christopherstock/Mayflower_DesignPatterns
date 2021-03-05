package observer3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NewsAgencyTest
{
    @Test
    fun testObserver()
    {
        val observable = NewsAgency()

        val observerBloomberg = NewsChannelBloomberg()
        val observerCNA = NewsChannelCNS()
        val observerReuters = NewsChannelBloomberg()

        observable.addObserver(observerBloomberg)
        observable.addObserver(observerCNA)
        observable.addObserver(observerReuters)

        observable.updateNews("Breaking News")

        assertEquals("Breaking News", observerBloomberg.news)
        assertEquals("Breaking News", observerCNA.news)
        assertEquals("Breaking News", observerReuters.news)
    }
}
