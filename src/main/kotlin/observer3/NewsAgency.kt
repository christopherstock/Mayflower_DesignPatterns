package observer3

import java.util.ArrayList

class NewsAgency {
    private var news: String? = null
    private val channels: MutableList<Channel> = ArrayList()
    fun addObserver(channel: Channel) {
        channels.add(channel)
    }

    fun removeObserver(channel: Channel) {
        channels.remove(channel)
    }

    fun setNews(news: String?) {
        this.news = news
        for (channel in channels) {
            channel.update(this.news)
        }
    }
}
