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

//    println(countLength("yyyy"))
//
//    displayMessage("メッセージ")

//    ifExample(100)
//
//    whenExample(200)

    forExample()
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

// if分岐
fun ifExample(num: Int) {
    if(num == 100) {
        println("num is 100")
    }
}

// when文: switch文、case文といったようなもの
fun whenExample(num: Int) {
    when(num) {
        100 -> {
            println("Equal to 100")
        }
        200 -> {
            println("Equal to 200")
        }
        else -> {
            println("Undefined value")
        }
    }
}

fun whileExample() {
    var i = 1
    while(i < 10) {
        println("i is $i")
        i++
    }
}

fun forExample( ) {
//    var i = 1
//    for (i in 1..10){
//        println("i is $i")
//    }
    // stepで指定した数ごと数値を増やす
//    for (i in 1 until 10 step 2) {
//        println("i is $i")
//    }

    val list = listOf<Int>(1,2,5,6,10)
    // コレクションを展開する方法
    for (i in list) {
        println("i is $i")
    }
}