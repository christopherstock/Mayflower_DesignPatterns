package strategy5

class Route
class Point

class Navigator
{
    // class context
    // ...

    fun buildRoute(routeStrategy: RouteStrategy, a: Point, b: Point): Route {
        return routeStrategy.buildRoute(a, b)
    }
}
