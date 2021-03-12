package decorator2

class PizzaPan : Pizza()
{
    override fun decorate(): String
    {
        return "Pan Pizza"
    }

    override fun cashAmount(): Int
    {
        return 660
    }
}
