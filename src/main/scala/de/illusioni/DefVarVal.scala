package de.illusioni

object DefVarVal {

  def main(args: Array[String]): Unit = {

    def a = "a: " + System.currentTimeMillis()

//    val aFunc = () => { "a: " + System.currentTimeMillis() }

    Thread.sleep(50)

    def b = "b: " + System.currentTimeMillis()

    println(b)
    Thread.sleep(50)
    println(a)
    Thread.sleep(50)
    println(b)
    Thread.sleep(50)
    println(a)
    Thread.sleep(50)
    println(b)

  }
}
