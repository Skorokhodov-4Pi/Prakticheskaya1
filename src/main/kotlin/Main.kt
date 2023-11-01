fun main(args: Array<String>) {
  /* var amount = 50000
    var sum = (0.75/100)*amount
    if(sum<35)
    {
        println("Комиссия: " + 35)
    }
    else
    {
        println("Комиссия: " + sum)
    }
   */

    /* var likes = 1251
    if(likes % 2 == 0)
    {
        println("Понравилось " + likes + " людям")
    }
    else
    {
        println("Понравилось " + likes + " человеку")
    }
     */
    val sum = 1001
    val amount = 100
    val proc: Double = 0.05
    if(sum <= 1000){
        println("Сумма: $sum")}
    else if (sum > 100 && sum <= 10000)
    {
        val cost = sum - amount
        println("Сумма: $cost")
    }
    else{
        val cost = sum -(sum * proc)
        println("Сумма: $cost")
    }
}

