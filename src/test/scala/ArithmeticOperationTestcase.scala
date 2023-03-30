import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ArithmeticOperationTestcase extends AnyFlatSpec with Matchers {

  val arithmeticOperation = new ArithmeticOperation
  "ArithmeticOperation" should "returns the sum of the List" in {
    val listNum = List(Some(2), Some(4), Some(5), Some(6))
    val operation = "Addition"
    val result = arithmeticOperation.listConversion(listNum, operation)
    result shouldBe 17
  }

  it should "returns the product of the List" in {
    val listNum = List(Some(2), Some(4), Some(5), Some(6))
    val operation = "Multiplication"
    val result = arithmeticOperation.listConversion(listNum, operation)
    result shouldBe 240
  }

  it should "returns the subtraction of the List" in {
    val listNum = List(Some(2), Some(4), Some(5), Some(6))
    val operation = "Subtraction"
    val result = arithmeticOperation.listConversion(listNum, operation)
    result shouldBe -13
  }

}
