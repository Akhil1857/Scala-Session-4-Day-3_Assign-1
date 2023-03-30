class ArithmeticOperation {

  //Converts the List[Option[Int]] to List[Int] and Perform the defined Operation.
  def listConversion(list: List[Option[Int]], operation: String): Int = {
    val resultantList = for {
      listOfOption <- list
      listOfInt <- listOfOption
    } yield listOfInt

    val finalResult = operation match { //Operation Matching and Function Calling.
      case "Addition" => addition(resultantList)
      case "Subtraction" => subtraction(resultantList)
      case "Multiplication" => multiplication(resultantList)
      case _ => throw new IllegalArgumentException()
    }
    finalResult

  }

  // Sum up all the Element of the list
  private def addition(list: List[Int]): Int = {
    val sum = list.foldLeft(0)(_ + _)
    sum
  }

  //Subtract all the element of the list
  private def subtraction(list: List[Int]): Int = {
    val difference = list.reduceLeft(_ - _)
    difference
  }

  //Multiply all the number of the list
  private def multiplication(list: List[Int]): Int = {
    val product = list.foldLeft(1)(_ * _)
    product
  }

}
