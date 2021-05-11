fun operaciones(primerN: Int, segunN: Int): Int {


    val suma =primerN + segunN
    val resta =primerN - segunN

    println(resta)

    return suma


}
fun operaciones2(primerNum: Int, segunNum: Int): Boolean{

    val mebooleano = true

    if(primerNum > segunNum){

        println("El primer numero: "+ primerNum+" es mayor que el segundo numero: "+segunNum)
        return mebooleano

    }else if (primerNum % 2 == 0 && segunNum % 2 == 0){

        println(primerNum)
        println(segunNum)
        println("ambos son pares")

        return mebooleano

    }
    return mebooleano

}
val tabla2 =Array(

    size = 11,
    init = {2 * it}
)
val tabla3 =Array(

    size = 11,
    init = {3 * it}
)
val tabla4 =Array(

    size = 11,
    init = {4 * it}
)
fun array(length: Int){

    val names = arrayListOf("Adam", "Andrew", "Chike", "Kechi")

    val filterResult = names.filter {
        it.length == length
    }
    println(filterResult)
}

fun main(args: Array<String>) {

    //println(operaciones(5,10))
    //operaciones2(6,2)
    array(5)
}