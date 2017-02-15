/**
  * Created by radix on 2/15/17.
  */

import scala.collection.mutable.Stack

class AddOperatorCommand extends Command {
  def execute(s: Stack[Double]): Unit = {
    if (s.length >= 2) {
      var x1: Double = s.top
      s.pop()
      var x2: Double = s.top
      s.pop()
      s.push(x1 + x2)
    }
  }
}
