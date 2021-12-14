package de.illusioni


class Person(var name: String) {
  def rename(func: (String) => String) = {
    name = func(name)
  }

  override def toString: String = s"A person named $name"
}

object HigherPerson {

  def main(args: Array[String]): Unit = {
    val conArtist = new Person("Martin")
    conArtist.rename(renamingFunction)

    println(conArtist)
  }

  val renamingFunction = (oldName: String) => "Manuel"

//  val renamingFunction = (oldName: String) => s"Manuel (f.k.a. $oldName)"
}
