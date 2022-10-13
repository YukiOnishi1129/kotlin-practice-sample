fun main() {
    println("Hello Kotlin.")

//    // val: 変更不可
//    val id = 100
//    //    var: 変更可能
//    var name = "takenaka"
//
//    println(id)
//    println(name)

//    val id: Int = 100
//    var name: String = "takenaka"
//    println(id)
//    println(name)

    println(countLength("yyyy"))

    displayMessage("メッセージ")
}

// 関数
fun countLength(str:String): Int {
    return str.length
}

//　Unit: 「何もない」といいうことを表す型
// 戻り値の型は省略可能
fun displayMessage(message: String): Unit {
    println(message)
}