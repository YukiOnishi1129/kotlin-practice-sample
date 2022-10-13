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

//    val android = AndroidPlatform
//    android.showName()
//    val ios = IosPlatform
//    ios.showName()

//    val greeter = GreeterImpl()
//    greeter.hello()

//    listExample()

    mapExample()
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

// インターフェース
interface Greeter {
    fun hello()
}

class GreeterImpl: Greeter {
    override fun hello() {
        println("hello")
    }
}


// コレクション
// List
// Map
// Set


//List
fun listExample() {
    // listOf関数に型を指定することで、List型のインスタンスが生成できる
    val intList: List<Int> = listOf<Int>(1,2,3)
    println(intList)
    println(intList[1])

    val stringList: List<String> = listOf<String>("one", "two", "three")
    println(stringList)
    println(stringList[1])

    // 要素を追加したい場合
    // 「MutableList」型のインスタンスを作成する
    // 「mutableListOf」を使用する
    val immutableList:List<Int> = listOf(1,2,3)
//    immutableList.add(4) コンパイルエラーになる
    val mutableList:MutableList<Int> = mutableListOf(1,2,3)
    mutableList.add(4)
    println(mutableList)
}

// Map
fun mapExample() {
    // 「mapOf」関数を使用して、key to value の形式で指定する
//    　Map型のインスタンスを生成できる
    val map: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map)
    println(map[2])

    // containsKey: keyの値を引数に指定することで、keyに該当する要素が存在するか？をbooleanの値で返却する
    println(map.containsKey(3))
    println(map.containsKey(4))

    // Mapは不可変のオブジェクトになる
//    要素を追加するには
    // 「mutableMapOf」関数を使用して、MutableMap型のインスタンスを生成する
    val immutableMap: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
//    immutableMap[4] = "four" コンパイルエラー
    val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    mutableMap[4] = "four"
    println(mutableMap)
}


// Set
fun setExample() {
    val set = setOf("one", "two", "three")
    println(set)
}