package de.illusioni

object HOF {

  def main(args: Array[String]): Unit = {
    val names = List("Stefan", "Markus", "Thomas", "Klaus")
    val theStrFunc = (n: String) => { println(s"In der Liste ist $n enthalten.") }
    val capitalize = (n: String) => { n.toUpperCase() }

//    names.foreach(theStrFunc)
    val upperCaseNames = names.map(capitalize)
//    println(upperCaseNames.mkString(", "))

    val motorbikes = List(1, 2, 15)

    val bikesTotal = motorbikes.reduce((a, b) => a*b)

    var sum = 0

    for (b <- motorbikes) { sum = sum + b }

    println(bikesTotal)
  }

}
