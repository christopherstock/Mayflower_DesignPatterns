package observer4

import java.util.*

class NewsAgency : Observable()
{
    // context
    // ...

    private var news: String? = null

    fun setNews(news: String?)
    {
        this.news = news
        setChanged()
        notifyObservers(news)
    }
}
