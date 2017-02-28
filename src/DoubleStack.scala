/**
  * Created by radix on 2/15/17.
  */

class DoubleStack(H: DoubleStackElem, S: Int) {
  def this() {
    this(_)
  }
  val StackSize: Int = S
  val Head: DoubleStackElem = H

  def Top: Double = H.elem

  def Push(e: Double): DoubleStack = {
    H match {
      case null => new DoubleStack(new DoubleStackElem(null, e), 1)
      case _ => new DoubleStack(new DoubleStackElem(H, e), StackSize+1)
    }
  }

  def Pop(): DoubleStack = {
    new DoubleStack(H.next, StackSize-1)
  }
}