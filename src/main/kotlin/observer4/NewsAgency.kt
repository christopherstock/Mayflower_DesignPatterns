package observer4

import java.util.*

class NewsAgency : Observable() {
    private var news: String? = null
    fun setNews(news: String?) {
        this.news = news
        setChanged()
        notifyObservers(news)
    }
}
