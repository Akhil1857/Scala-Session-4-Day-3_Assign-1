import scala.util.{Failure, Success, Try}

object ArithmeticOperationDriver extends App {

  private val arithmeticOperation = new ArithmeticOperation
  private val inputList = List(Some(1), Some(2), Some(3), Some(4))
  private val operation = "Addition"
  val result = Try {
    arithmeticOperation.listConversion(inputList, operation)
  }
  result match {
    case Success(value) => print(value)
    case Failure(_) => print("Operation not defined")

  }

}
