package strategy4

class Route
class Point
enum class TransportType { PRIVATE_VEHICLE, BICYCLE, PUBLIC_TRANSPORT }

class Navigator
{
    // class context
    // ...

    fun buildRoute(type: TransportType, a: Point, b: Point): Route {

        val routeStrategy = when ( type ) {
            TransportType.PRIVATE_VEHICLE -> {
                RouteStrategyPrivateVehicle()
            }

            TransportType.BICYCLE -> {
                RouteStrategyBicycle()
            }

            TransportType.PUBLIC_TRANSPORT -> {
                RouteStrategyPublicTransport()
            }
        }

        return routeStrategy.buildRoute(a, b)
    }
}
