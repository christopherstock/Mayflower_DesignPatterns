package decorator2

class PizzaPan : Pizza()
{
    override fun decorate(): String
    {
        return "Pan Pizza"
    }


    override fun cashAmount(): Double
    {
        return 6.60
    }
}
