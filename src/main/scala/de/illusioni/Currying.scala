package de.illusioni

import scala.io.StdIn

object Currying {


  def userChooseValueFunc() = {
    def extractMeters = (s: Shift) => s.lfdM
    def extractWaste = (s: Shift) => s.wasteMtrs
    def defaultFunc = (_:Shift) => 0d

    val choice = StdIn.readLine("meters (1) or waste (2)?")
    choice match {
      case "1" => extractMeters
      case "2" => extractWaste
      case _ => defaultFunc
    }
  }

  def getTransFunc(extrFunc: Shift=>Double) = {
    translator(extrFunc, _)
  }

  def translator(extrFunc: Shift=>Double, shifts: Seq[Shift]) = {
    val statValues = shifts.map(extrFunc)
    statValues
  }



  def main(args: Array[String]): Unit = {

    val shifts = Seq(Shift(22.5, 0), Shift(2.5, 10), Shift(5, 1.5), Shift(15, 7.2), Shift(25.2, 3.2))

    val extrFunc = userChooseValueFunc()
    val transFunc = getTransFunc(extrFunc)

    val statValues = transFunc(shifts)

    println(statValues.mkString(" - "))

  }

}


case class Shift(val lfdM: Double, val wasteMtrs: Double)
