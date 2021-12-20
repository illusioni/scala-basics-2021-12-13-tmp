package de.illusioni

import scala.annotation.tailrec

object Recursion {

  @tailrec
  def myMap[A, B](l: List[A], f: A=>B, gen: List[B] = Nil): List[B] = {
    l match {
      case Nil => gen
      case head :: tail => myMap(tail, f, gen :+ f(head))
    }
  }

  def main(args: Array[String]): Unit = {

    val listA = List(1, 2, 4, 6, 12)

    val listB = myMap(listA, (i: Int) => s"I ist $i")

    println(listB.mkString(", "))
  }
}
