package de.illusioni


case class Banana(length: Int)

case class PeeledBanana(length: Int, completelyPeeled: Boolean)



object Implicits {
  implicit def peel(b: Banana) = PeeledBanana(b.length, true)

  def eat(b: PeeledBanana) = {
    println(s"${b.length} centimeters of juicy fruit - yummy!")
  }

  def main(args: Array[String]): Unit = {
    val banana = Banana(11)
    eat(banana)
  }

}
