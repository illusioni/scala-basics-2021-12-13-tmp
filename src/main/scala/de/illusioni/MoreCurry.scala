package de.illusioni

object MoreCurry {

  def getMapFunc: Int => Int = a => a*a

  def getMapFunc2: Int => Int = a => a+2
  def getMapFunc3: Int => Int = a => a+3

//  def getMapFuncCurry(n: Int): (Int => Int) = { a => a+n }

  def getMapFuncCurry(n: Int)(a: Int) = a + n


//  def getMapFuncCurry: Int => Int => Int = ???



  def main(args: Array[String]): Unit = {

    val v: Int = getMapFuncCurry(3)(4)
    val w: Int=>Int = getMapFuncCurry(3)

    val numbers = Seq(2, 4, 7)

    val mapFunc: Int=>Int = getMapFuncCurry(3)

    println(numbers.map(mapFunc))

  }





//  def main(args: Array[String]): Unit = {
//
//    val v: Int = getMapFuncCurry(3)(4)
//    val w: Int=>Int = getMapFuncCurry(3)
//
//    val numbers = Seq(2, 4, 7)
//
//    val mapFunc: Int=>Int = getMapFuncCurry(3)
//
//    println(numbers.map(mapFunc))
//
//  }













//  def getMapFuncCurry: Int => Int => Int = (n: Int) => a => a+n


}
