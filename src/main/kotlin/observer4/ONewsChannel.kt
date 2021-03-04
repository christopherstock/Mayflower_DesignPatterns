package observer4

import java.util.*

class ONewsChannel : Observer {
    var news: String? = null
    override fun update(o: Observable, news: Any) {
        this.news = news as String
    }
}
