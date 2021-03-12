package decorator1

class PizzaPan : Pizza()
{
    override fun decorate(): String
    {
        return "Pan Pizza"
    }
}
