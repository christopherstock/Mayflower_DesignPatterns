package strategy3

class Route
class Point
enum class TransportType { PRIVATE_VEHICLE, BICYCLE, PUBLIC_TRANSPORT }

class Navigator
{
    // class context
    // ...

    fun buildRoute(type: TransportType, a: Point, b: Point): Route {

        when ( type ) {
            TransportType.PRIVATE_VEHICLE -> {
                return this.buildRoutePrivateVehicle( a, b )
            }

            TransportType.BICYCLE -> {
                return this.buildRouteBicycle( a, b )
            }

            TransportType.PUBLIC_TRANSPORT -> {
                return this.buildRoutePublicTransport( a, b )
            }
        }
    }

    fun buildRoutePrivateVehicle(a: Point, b: Point): Route
    {
        val route: Route = Route()

        // many lines of code + API invocations
        // ...

        return route;
    }

    fun buildRouteBicycle(a: Point, b: Point): Route
    {
        val route: Route = Route()

        // many lines of code + API invocations
        // ...

        return route;
    }

    fun buildRoutePublicTransport(a: Point, b: Point): Route
    {
        val route: Route = Route()

        // many lines of code + API invocations
        // ...

        return route
    }
}
