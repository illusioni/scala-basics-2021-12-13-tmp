package de.illusioni


class Person(var name: String) {
  def rename(func: String => String): Unit = {
    name = func(name)
  }

//  override def toString: String = return s ()"A person named $name"
}



//class Zahlenpaar(a: Int, b: Int) {
//  def berechne(func: (Int, Int) => Int) = ???
//}

object HigherPerson {

  def main(args: Array[String]): Unit = {
    val conArtist: Person = new Person("Martin")
    conArtist.rename(HigherPerson.renamingFunction)

    println(conArtist)
  }

  val renamingFunction: Function1[_root_.scala.Predef.String, _root_.java.lang.String] = (oldName: String) => "Manuel"

//  val renamingFunction = (oldName: String) => s"Manuel (f.k.a. $oldName)"
}
