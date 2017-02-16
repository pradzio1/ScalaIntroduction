/**
  * Created by radix on 2/15/17.
  */
class DoubleStack() {
  val head: DoubleStackElem = _

  def Top: Double = head.elem

  def Push(e: Double): DoubleStack = {
    head match {
      case ??? =>
        val temp: DoubleStackElem = new DoubleStackElem(head, e)

      case _ => head = new DoubleStackElem(null, e)
    }
  }
}