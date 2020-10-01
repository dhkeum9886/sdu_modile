package week5


// ① 상속 가능한 클래스를 위해 open 사용
open class Bird3(var name: String, var wing: Int, var beak: String, var color: String) {
    // 메서드
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol") // 오버라이딩 가능한 메서드
}

// ② 주 생성자를 사용하는 상속
class Lark(name: String, wing: Int, beak: String, color: String) : Bird3(name, wing, beak,
    color) {
    fun singHitone() = println("Happy Song!") // 새로 추가된 메서드
}

// ③ 부 생성자를 사용하는 상속
class Parrot(name: String, wing: Int = 2, beak: String, color: String,
            // 마지막 인자만 var로 선언되어 프로퍼티가 추가됨
             var language: String = "natural") : Bird3(name, wing, beak, color)
{
    fun speak() = println("Speak! $language") // Parrot에 추가된 메서드
    override fun sing(vol: Int) { // 오버라이딩된 메서드
        println("I'm a parrot! The volume level is $vol")
        speak() // 달라진 내용!
    }
}


fun main(){

}