package observer1

class NewsAgency
{
    // context
    // ...

    var news = ""

    val channelBloomberg = NewsChannelBloomberg()

    fun updateNews(news: String)
    {
        this.news = news

        channelBloomberg.update(news)
    }
}
