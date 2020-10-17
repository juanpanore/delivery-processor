class CoodinatesCalculatorTest extends org.scalatest.funsuite.AnyFunSuite {
  test("CubeCalculator.calculateRouteInPlane") {
    assert(CoordinatesCalculator.calculateRouteInPlane("DDDAIAD") === "(-1,-1) dirección Oriente")
    assert(CoordinatesCalculator.calculateRouteInPlane("AAAAIAA") === "(-2,4) dirección Oriente")
    assert(CoordinatesCalculator.calculateRouteInPlane("AAIADAD") === "(-1,3) dirección Occidente")
  }
}
