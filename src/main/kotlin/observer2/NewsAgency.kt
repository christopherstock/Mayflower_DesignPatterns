package observer2

class NewsAgency
{
    // context
    // ...

    var news = ""

    val channelBloomberg = NewsChannelBloomberg()
    val channelCNS = NewsChannelCNS()
    val channelReuters = NewsChannelReuters()

    fun updateNews(news: String)
    {
        this.news = news

        channelBloomberg.update(news)
        channelCNS.update(news)
        channelReuters.update(news)
    }
}
