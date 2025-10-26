package kyu5

class DirectionsReduction {

    fun dirReduc(arr: Array<String>): Array<String> {
        var mutableArr = mutableListOf<String>()

        if (arr.isEmpty()) {
            return arr
        }

        arr.forEach {
            if (mutableArr.isEmpty()) {
                mutableArr.add(it)
            } else if ((it == "NORTH" && mutableArr.last() == "SOUTH") || (it == "EAST" && mutableArr.last() == "WEST") || (it == "SOUTH" && mutableArr.last() == "NORTH") || (it == "WEST" && mutableArr.last() == "EAST")) {
                mutableArr.removeLast()
            } else {
                mutableArr.add(it)
            }
        }

        return mutableArr.toTypedArray()
    }

  /*  class DirectionsReduction {

        // Yardımcı fonksiyon: İki yönün zıt olup olmadığını kontrol eder
        private fun areOpposites(dir1: String, dir2: String): Boolean {
            return (dir1 == "NORTH" && dir2 == "SOUTH") ||
                    (dir1 == "SOUTH" && dir2 == "NORTH") ||
                    (dir1 == "EAST" && dir2 == "WEST") ||
                    (dir1 == "WEST" && dir2 == "EAST")
        }

        // Sizin tarif ettiğiniz "bul, sil, baştan başla" mantığı
        fun dirReduc(arr: Array<String>): Array<String> {

            // Diziyi daha kolay işlem yapmak için List'e çevirelim
            val list = arr.toMutableList()

            // Liste üzerinde gezerken zıt bir çift arayacağız
            for (i in 0 until list.size - 1) {
                val currentDir = list[i]
                val nextDir = list[i + 1]

                if (areOpposites(currentDir, nextDir)) {
                    // Zıt bir çift bulduk! (örn: NORTH ve SOUTH)

                    // Bu iki elemanı listeden çıkar
                    // Önce (i+1)'dekini sileriz ki (i)'nin indeksi kaymasın
                    list.removeAt(i + 1)
                    list.removeAt(i)

                    // Listeyi Array'e çevirip fonksiyonu EN BAŞTAN tekrar çağır
                    // Geri kalanları aramaya devam etmesi için.
                    return dirReduc(list.toTypedArray())
                }
            }

            // Eğer 'for' döngüsü hiç zıt yön bulamadan biterse,
            // bu, listenin sadeleşmiş son halidir.
            return list.toTypedArray()
        }
    }

    fun main() {
        val a = DirectionsReduction()
        val testArray = arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST")

        // Test edelim
        println(a.dirReduc(testArray).contentToString())
        // Çıktı: [WEST]
    }*/
}