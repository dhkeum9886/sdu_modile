package week3;

fun main(){
    var score = 90;

    if (score in 80.0..89.00){
        print ('a');
    } else {
        print ('b');
    }

    when (score){
        90 -> {
            print('a')
        }
        89 -> {
            print('b')
        }
        else -> {
            print ('c')
        }
    }
}

