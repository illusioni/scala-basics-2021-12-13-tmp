package de.illusioni

object EqIdent {
  def main(args: Array[String]): Unit = {
    val firstString = new String("AnyRef")
    val secondString = new String("AnyRef")
    val thirdString = null
    val fourthString = null
    println(firstString == secondString)
    // Unlike in java, the following lines of code do not cause NullPointerExceptions
    println(thirdString == secondString)
    println(fourthString == thirdString)
  }
}
