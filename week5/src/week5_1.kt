package week5

class Bird2 {
    // 프로퍼티들
    var name: String
    var wing: Int
    var beak: String
    var color: String


    // 첫 번째 부 생성자
    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    };
    // 두 번째 부 생성자
    constructor(_name: String, _beak: String) {
        name = _name
        wing = 2
        beak = _beak
        color = "grey"
    };
};


class Bird(var name: String="noname", var wing: Int=2, var beak: String, var color: String){
    init{
        println("----------초기화블록 시작----------")
        println("이름은$name, 부리는 $beak")
        this.sing(3)
        println("----------초기화 블록 끝 ----------")
    }

    fun fly() = println("Flywing: $wing")
    fun sing(vol:Int) = println("Singvol: $vol")

};

fun main(){

    // 주 생성자 사용
    val coco = Bird(beak= "long",color = "red") // 기본값이 있는 것은 생략하고 없는 것만 전달 가능
    println("coco.name:${coco.name}, coco.wing ${coco.wing}")
    println("coco.color:${coco.color}, coco.beak ${coco.beak}")

    // 부 생성자 사용용
    val bird1 = Bird2("mybird",2, "short", "blue")// 첫번째 부 생성자 호출
    val bird2 = Bird2("mybird2","long")// 두번째 부 생성자 호출
}