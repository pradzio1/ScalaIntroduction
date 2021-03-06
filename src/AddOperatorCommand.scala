/**
  * Created by radix on 2/15/17.
  */

class AddOperatorCommand extends Command {
  def execute(s: DoubleStack): Unit = {
    if (s.StackSize >= 2) {
      val x1: Double = s.Top
      s.Pop()
      val x2: Double = s.Top
      s.Pop()
      s.Push(x1 + x2)
    }
  }
}