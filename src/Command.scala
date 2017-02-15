/**
  * Created by radix on 2/15/17.
  */
import scala.collection.mutable.Stack

trait Command {
  def execute() : Stack[String]
}
