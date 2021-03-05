package observer3

class NewsChannelBloomberg : NewsChannel
{
    // context
    // ...

    var news: String = ""

    override fun update(news: String)
    {
        this.news = news
    }
}
