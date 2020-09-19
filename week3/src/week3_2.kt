package week3

fun main(){

    var sum = 0;

    for (x in 1..10)
        sum += x;

    print("sum:$sum");

    print("\r\n");

    for ( i in 5 downTo  1)
        print (i);
    print("\r\n");

    for (i in 5..1)
        print(i);
    print("\r\n");

    for (i in 1..5 step 2)
        print(i);
    print("\r\n");

    for (i in 5 downTo 1 step 2)
        print (i);

    var i = 1;
    while (i <= 5)
    {
        print("\r\n");
        print (i);
        i++;
    }
}