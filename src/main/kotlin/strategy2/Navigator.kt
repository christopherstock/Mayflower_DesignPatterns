package strategy2

class Route
class Point
enum class TransportType { PRIVATE_VEHICLE, BICYCLE, PUBLIC_TRANSPORT }

class Navigator
{
    // class context
    // ...

    fun buildRoute( type: TransportType, A: Point, B: Point): Route
    {
        when ( type )
        {
            TransportType.PRIVATE_VEHICLE ->
            {
                val route: Route = Route()

                // many lines of code + API invocations
                // ...

                return route
            }

            TransportType.BICYCLE ->
            {
                val route: Route = Route()

                // many lines of code + API invocations
                // ...

                return route
            }

            TransportType.PUBLIC_TRANSPORT ->
            {
                val route: Route = Route()

                // many lines of code + API invocations
                // ...

                return route
            }
        }
    }
}
