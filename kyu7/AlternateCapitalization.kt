package kyu7

class AlternateCapitalization {

    fun capitalize(text: String): List<String> {
        var evenTextArray = text.toCharArray()
        var oddTextArray = text.toCharArray()
        for (capitalization in 0..<text.length) {
            if(capitalization % 2 ==0 || capitalization == 0) {
                evenTextArray[capitalization] = (evenTextArray[capitalization].toString().uppercase()).toCharArray().first()
            }else{
                oddTextArray[capitalization] = (oddTextArray[capitalization].toString().uppercase()).toCharArray().first()
            }
        }

        return listOf(evenTextArray.joinToString(""), oddTextArray.joinToString(""))
    }

    /*fun capitalize(text: String): List<String> {

    // 1. Çift İndeksleri Büyüt (AbCdEf)
    // mapIndexed: Her karakteri indeksi (index) ve karakterin kendisi (char) ile birlikte gezer.
    val evenCaps = text.mapIndexed { index, char ->
        if (index % 2 == 0) {
            // Char.uppercase() karakteri büyük harfe çevirir.
            char.uppercase()
        } else {
            char
        }
    }.joinToString("") // joinToString(""): ["A", "b", "C", "d", "E", "f"] listesini "AbCdEf" olarak birleştirir.

    // 2. Tek İndeksleri Büyüt (aBcDeF)
    val oddCaps = text.mapIndexed { index, char ->
        if (index % 2 != 0) { // Koşulu !='e çevirmen yeterli
            char.uppercase()
        } else {
            char
        }
    }.joinToString("")

    // 3. İki sonucu liste olarak döndür.
    return listOf(evenCaps, oddCaps)
}*/

}