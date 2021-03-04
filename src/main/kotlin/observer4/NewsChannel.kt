package observer4

import java.util.*

class NewsChannel : Observer {
    var news: String? = null
    override fun update(o: Observable, news: Any) {
        this.news = news as String
    }
}