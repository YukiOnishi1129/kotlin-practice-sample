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

//    forExample()


//    val human = Human("Takenaka")
//    human.showName()

//    val dog = Dog("ぽち")
//    dog.cries()

    val android = AndroidPlatform
    android.showName()
    val ios = IosPlatform
    ios.showName()
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


//クラス
//class Human {
//    fun showName(name: String) {
//        println(name)
//    }
//}

// コンストラクタつきのクラス
class Human(private val name: String) {
    fun showName() {
        println(name)
    }
}

//継承
// 継承させたいクラスには「open」修飾子をつける
// これがないと継承させようとした際にコンパイルエラーになる
open class Animal(private val name: String) {
    fun showName() = println("name is $name")

    // オーバーライドさせたい関数にも「open」をつけておく
    open fun cries() = println("")
}

// 継承する際はクラスの後ろに「:クラス名」の記述にする
class Dog(name: String) : Animal(name) {

    // オーバーライドする関数は「override」修飾子をつける
    override fun cries() = println("bowwow")
}


// シールドクラス: 継承する対象が制限されたクラス
// クラス名に「sealed」をつける
sealed class Platform {
    abstract fun showName()
}

object AndroidPlatform : Platform() {
    override fun showName() {
        println("Android")
    }
}

object IosPlatform : Platform() {
    override fun showName() {
        println("iOS")
    }
}