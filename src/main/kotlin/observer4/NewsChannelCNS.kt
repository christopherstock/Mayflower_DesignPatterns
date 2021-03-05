package observer4

import java.util.*

class NewsChannelCNS : Observer
{
    // context
    // ...

    var news: String = ""

    override fun update(o: Observable?, arg: Any?)
    {
        this.news = (arg as String)
    }
}
