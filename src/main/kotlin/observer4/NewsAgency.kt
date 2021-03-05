package observer4

import java.util.*

class NewsAgency : Observable()
{
    // context
    // ...

    private var news: String = ""

    fun updateNews(news: String)
    {
        this.news = news

        this.setChanged()
        this.notifyObservers(news)
    }
}
