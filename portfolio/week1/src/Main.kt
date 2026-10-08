// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess
import the Kotlin sqrt function

main receives command-line arguments

    if there are fewer than 3 arguments:
        print:
        Error: values for a, b, c required on command line3
        terminate with exit status 1

    otherwise:
        convert argument 0 to Double → a
        convert argument 1 to Double → b
        convert argument 2 to Double → c

        calculate:
            s = (a + b + c) / 2

        calculate:
            area = sqrt(s * (s - a) * (s - b) * (s - c))

        print:
            Area = [area formatted to 5 decimal places]
