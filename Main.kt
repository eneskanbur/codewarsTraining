fun main() {

    val a = Bouncing()
    println(a.bouncingBall(30.0, 0.66, 1.5))
}

fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {

    var negative = 0
    var positive = 0

    if (input != null) {

        for (it in input) {
            if (it > 0) {
                positive++
            } else {
                negative += it
            }
        }
    }
    return arrayOf(positive, negative)

    /*
    fun countPositivesSumNegativesOptimized(input: Array<Int>?): Array<Int> {
    // Giriş null veya boşsa boş bir dizi döndür
    if (input.isNullOrEmpty()) {
        return emptyArray() // Kotlin'de boş Array<Int> döndürmenin daha temiz yolu
    }

    // Diziyi pozitif ve negatif/sıfır olarak filtrele
    val positives = input.filter { it > 0 }
    val negatives = input.filter { it < 0 }

    // Sonuç dizisini oluştur
    return arrayOf(positives.count(), negatives.sum())
    }

     */

}