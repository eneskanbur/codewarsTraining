package kyu6

class Bouncing {

    fun bouncingBall(h: Double, bounce: Double, window: Double): Int {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1
        }

        var result = 1
        var high = h * bounce

        if (h == window) {
            return result.toInt()
        }

        while (high > window) {
            result += 2
            high *= bounce
        }

        return result.toInt()
    }

}