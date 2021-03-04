package observer3

class NewsChannel : Channel {
    var news: String? = null
    override fun update(news: Any?) {
        this.news = news as String?
    }
}
