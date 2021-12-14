package de.illusioni.shapes

trait Shape {
  def area(): Double
}

class Circle(val radius:Double) extends Shape {
  override def area(): Double = Math.PI * radius * radius
}

class Rectangle(var w:Double, var h:Double) extends Shape {
  override def area(): Double = w * h
}

trait RectAreaMixin {
  def w:Double
  def h:Double
  def area(): Double = w * h
}

class Square extends Shape {
  private var delegate: Rectangle = null

  def this(a: Double) = {
    this()
    delegate = new Rectangle(a, a)
  }

  def getA = delegate.w
  def a = delegate.w
  def a_= (newA: Double) {
    delegate.w = newA
    delegate.h = newA
  }

  override def area(): Double = delegate.area()

}


object MainProg {
  def main(args: Array[String]): Unit = {
//    val shapes = new Circle(1) :: new Circle(1.5)
    val shapes = List.empty[Shape] :+
      new Circle(1) :+
      new Circle(1.5) :+
      new Rectangle(2, 4)

    for(s <- shapes) {
      println(s.area())
    }

    val r = new Square(1)
    r.a = 3
    r.getA
    println(r.a)

  }
}






//package de.illusioni.shapes
//
//trait Shape {
//  def area(): Double
//}
//
//class Circle(val radius:Double) extends Shape {
//  override def area(): Double = Math.PI * radius * radius
//}
//
//class Rectangle(var w:Double, var h:Double) extends Shape with RectAreaMixin {
//}
//
//trait RectAreaMixin {
//  def w:Double
//  def h:Double
//  def area(): Double = w * h
//}
//
//class Square(var a: Double) extends Shape with RectAreaMixin {
//  def w = a
//  def h = a
//}
//
//
//object MainProg {
//  def main(args: Array[String]): Unit = {
//    //    val shapes = new Circle(1) :: new Circle(1.5)
//    val shapes = List.empty[Shape] :+
//      new Circle(1) :+
//      new Circle(1.5) :+
//      new Rectangle(2, 4)
//
//    for(s <- shapes) {
//      println(s.area())
//    }
//
//    val r = new Square(1)
//    r.a = 3
//    println(r.a)
//
//  }
//}