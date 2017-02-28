/**
  * Created by radix on 28.02.2017.
  */

class MultiplyOperatorCommand {
  def execute(s: DoubleStack): Unit = {
    if (s.StackSize >= 2) {
      val x1: Double = s.Top
      s.Pop()
      val x2: Double = s.Top
      s.Pop()
      s.Push(x2 * x1)
    }
  }
}
