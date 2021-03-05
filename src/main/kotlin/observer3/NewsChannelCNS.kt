package observer3

class NewsChannelCNS : NewsChannel
{
    // context
    // ...

    var news: String = ""

    override fun update(news: String)
    {
        this.news = news
    }
}
