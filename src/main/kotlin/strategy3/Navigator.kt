package strategy3

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
                return this.buildRoutePrivateVehicle( A, B )
            }

            TransportType.BICYCLE ->
            {
                return this.buildRouteBicycle( A, B )
            }

            TransportType.PUBLIC_TRANSPORT ->
            {
                return this.buildRoutePublicTransport( A, B )
            }
        }
    }

    fun buildRoutePrivateVehicle(A: Point, B: Point): Route
    {
        val route: Route = Route()

        // many lines of code + API invocations
        // ...

        return route;
    }

    fun buildRouteBicycle(A: Point, B: Point): Route
    {
        val route: Route = Route()

        // many lines of code + API invocations
        // ...

        return route;
    }

    fun buildRoutePublicTransport(A: Point, B: Point): Route
    {
        val route: Route = Route()

        // many lines of code + API invocations
        // ...

        return route
    }
}
