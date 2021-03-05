package observer3

class NewsChannelReuters : NewsChannel
{
    // context
    // ...

    var news: String = ""

    override fun update(news: String)
    {
        this.news = news
    }
}
