package observer4

import java.util.*

class NewsChannelBloomberg : Observer
{
    // context
    // ...

    var news: String = ""

    override fun update(o: Observable?, arg: Any?)
    {
        this.news = (arg as String)
    }
}
