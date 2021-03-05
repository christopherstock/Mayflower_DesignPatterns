package observer3

class NewsAgency
{
    // context
    // ...

    private var news = ""
    private val channels = mutableListOf<NewsChannel>()

    fun addObserver(channel: NewsChannel)
    {
        channels.add(channel)
    }

    fun removeObserver(channel: NewsChannel)
    {
        channels.remove(channel)
    }

    fun updateNews(news: String)
    {
        this.news = news
        for (channel in channels) {
            channel.update(this.news)
        }
    }
}
