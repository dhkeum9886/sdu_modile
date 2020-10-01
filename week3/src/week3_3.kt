package week3

/*
//람다식
fun inlinelambda(a: Int, b: Int, out:(Int, Int)-> Unit){
    out(a,b);
}

fun readFunc(){
    println("start a readfun")

    inlinelambda(13,3) lit@{ a,b ->
        var result = a+b
        if (result > 10)
            return@lit
        println("result:$result")
    }
    println("end a readfun")
}

fun main(){
    readFunc();   //람다식
}
*/

/*
fun main(){
    //람다식방법
    val getMessage = lambda@ { num: Int ->
        if(num !in 1..100) {
            return@lambda "Error" // 레이블을 통한 반환
        }
        "Sucess 람다식방법" // 마지막 식이 반환
    }

    //익명함수방법
    val getMessage2 = fun(num: Int): String {
        if(num !in 1..100) {
            return "Error"
        }
        return "Sucess 익명함수방법"
    }


    println(getMessage(99))
    println(getMessage2(99))
}
*/


fun main(){
    fun labelBreak() {
        println("labelBreak")
        for(i in 1..5) {
            second@ for (j in 1..5) {
                if (j == 3) break
                println("i:$i, j:$j")
            }
            println("after for j")
            fun labelBreak() {
                println("labelBreak")
                first@ for(i in 1..5) {
                    second@ for (j in 1..5) {
                        if (j == 3) break@first
                        println("i:$i, j:$j")
                    }
                    println("after for j")
                }
                println("after for i")
            }
            println("after for j")
        }
        println("after for i")
    }
}