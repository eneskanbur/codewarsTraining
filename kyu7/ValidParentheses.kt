package kyu7

class ValidParentheses {

    fun validParentheses(str: String): Boolean {

        var balance = 0

        if (str.isEmpty()) return true

        if (str.length == 1 || str.length < 0 || str.length > 100 || str.first() == ')')
            return false
        else {
            for (char in str) {
                if (char == '(') {
                    balance++
                } else {
                    balance--
                }

                if (balance < 0) {
                    return false
                }
            }
        }
        return balance == 0
    }
}

