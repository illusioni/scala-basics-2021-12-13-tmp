package de.illusioni

object HOF {

  def main(args: Array[String]): Unit = {
    val names = List("Stefan", "Markus", "Thomas", "Klaus")

    val theStrFunc = (n: String) => { println(s"In der Liste ist $n enthalten.") }
    names.foreach(theStrFunc)



  }

}
