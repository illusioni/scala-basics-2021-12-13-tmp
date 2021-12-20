package de.illusioni

object Functions1 {

  def add(a: Int, b: Int) = { a + b }
  def sub(a: Int, b: Int) = { a - b }

  type IntFunc2 = (Int, Int) => Int


  def myJob(f: IntFunc2) = f(2, 4)

  def main(args: Array[String]): Unit = {

    val a: Int = 5

    val f1: Function2[Int, Int, Int]     = null
    val f2: (Int, Int) => Int            = add

    val f3 = (a: Int, b: Int) => a * b

    println( f3(5, 3) )
  }
}
