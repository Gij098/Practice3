import java.util.Random
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    /*Задание 1
    * Создали 2 костанты, сравнили возраст в промежутке от 13 до 19*/

    val myAge : Int = 18
    val isTeenager = myAge >= 13 && myAge <= 19


    /*Задание 2
    * Создали две константы.
    * тот же промежуток с добавлением подроска */

    val theirAge = 30
    val bothTeenager = theirAge >= 13 && theirAge <=19 && isTeenager

    /*Задание 3
    *сравнение двух строк */

    val reader = "Ida"
    val author = "Richard Lucas"
    val authorlsReader = reader == author

    /*Задание 4
    *сравнение строк по алфавиту */

    val readerBeforeAuthor = reader < author

    /*Задание 5
    *сравнение с помощью if */

    val myAge2 = 18
    if( myAge2 >= 13 && myAge2 <= 19)
        println("Подросток")
        else
            println("Не подросток")

    /*Задание 6
    *все тоже самое через константу */

    val  answer = if( myAge2 >= 13 && myAge2 <= 19)
        println("Подросток")
    else
        println("Не подросток")
    println(answer)

    /*Задание 7
    * цикл с увеличением на 1*/

    var counter = 0
    while(counter < 10){
        println(counter)
        counter +=1

    }

    /*Задание 8
    *  выбор случайного числа между 0 и 5.
    * увеличение на 1
    * цикл заканчиваеться при выпаде первого 0*/

    counter = 0
    var roll = 0
    do
    {
        roll = Random().nextInt(6)
        counter +=1
        println(" После $counter бросков, roll равен\n" + "$roll")

    }

    while (roll != 0)

    /*Задание 9
    *  выводит квадрат каждого числа */

    val range = 1..10
    for(i in range ){
        println("${i.toDouble().pow(2.0)}")
    }

    /*Задание 10
    *  выводит квадратный корень из каждого числа*/

    val range1 = 1..10
    for(i in range1){
        println("${sqrt(i.toDouble())}")
    }

    /*Задание 11
    *  используем шаг step с циклом for, чтобы пропускать четные строки
    *  вместо использования continue.*/

    var sum = 0
    for(row in 1 until 8 step 2)
            for (column in 0 until 8) {
                sum += row * column

            }
        println(sum)
    }
