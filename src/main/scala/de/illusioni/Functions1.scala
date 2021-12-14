package de.illusioni

object Functions1 {

  def add(a: Int, b: Int) = { a + b }
  def sub(a: Int, b: Int) = { a - b }

  type intFunc2 = (Int, Int) => Int


  def main(args: Array[String]): Unit = {

    val a: Int = 5

    val f1: Function2[Int, Int, Int]     = null
    val f2: (Int, Int) => Int            = add

    val f3 = (a: Int, b: Int) => a * b

    println( f3(5, 3) )
  }
}
