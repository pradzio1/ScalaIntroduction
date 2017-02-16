/**
  * Created by radix on 2/15/17.
  */
class DoubleStack(H: DoubleStackElem) {
  def this() {
    this(null)
  }

  val Head: DoubleStackElem = H

  def Top: Double = H.elem

  def Push(e: Double): DoubleStack = {
    H match {
      case null => new DoubleStack(new DoubleStackElem(null, e))
      case _ => new DoubleStack(new DoubleStackElem(H, e))
    }
  }

  def Pop(): DoubleStack = {
    new DoubleStack(H.next)
  }
}