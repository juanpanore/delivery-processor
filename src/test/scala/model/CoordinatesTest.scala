class CoordinatesTest extends org.scalatest.funsuite.AnyFunSuite {

  var coordinates = new Coordinates(0, 0, "Norte")

  test("Coordinates.moveY") {
    coordinates.moveY(1)
    assert(coordinates.y === 1)
    coordinates.moveY(-1)
    assert(coordinates.y === 0)

  }
  test("Coordinates.moveX") {
    coordinates.moveX(1)
    assert(coordinates.x === 1)
    coordinates.moveX(-1)
    assert(coordinates.x === 0)

  }
  test("Coordinates.moveDirection") {
    coordinates.moveDirection("Oriente")
    assert(coordinates.direction === "Oriente")
  }
}