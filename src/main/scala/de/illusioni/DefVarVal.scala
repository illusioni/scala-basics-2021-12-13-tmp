package de.illusioni

object DefVarVal {

  def main(args: Array[String]): Unit = {

//    def a = "a: " + System.currentTimeMillis()

    val aFunc = () => { "a: " + System.currentTimeMillis() }

    def useTheFunc(f: String): Unit = {
      println(f)
    }

    println("vor dem Call")
    useTheFunc { "a: " + System.currentTimeMillis() }
    println("nach dem Call")


//    Thread.sleep(50)

//    def b = "b: " + System.currentTimeMillis()

//    println(b)
//    Thread.sleep(50)
//    println(a)
//    Thread.sleep(50)
//    println(b)
//    Thread.sleep(50)
//    println(a)
//    Thread.sleep(50)
//    println(b)

  }
}
