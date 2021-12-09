import org.scalatest.funsuite._

class TestRunner extends AnyFunSuite {
  test("Hello should start with H") {
    assert("Hello".startsWith("H"))
  }
}