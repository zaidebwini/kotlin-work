fun isValidTriangle(triangle: Triangle): Boolean {
    val (a, b, c) = triangle

    return a > 0 && b > 0 && c > 0 &&
        a + b > c &&
        a + c > b &&
        b + c > a
}

fun triangleArea(triangle: Triangle): Double {
    val (a, b, c) = triangle
    val s = (a + b + c) / 2.0

    return sqrt(s * (s - a) * (s - b) * (s - c))
}
