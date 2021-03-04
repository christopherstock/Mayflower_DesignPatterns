package observer1

class NewsAgency
{
    var news = ""

    val channelCNN = NewsChannelCNN()

    fun updateNews(news: String) {
        this.news = news

        channelCNN.update(news)
    }
}
