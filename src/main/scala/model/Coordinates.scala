class Coordinates(var x: Int, var y: Int, var direction: String) {
  def moveY(position: Int): Unit = {
    y += position
  }

  def moveX(position: Int): Unit = {
    x += position
  }

  def moveDirection(newDirection: String): Unit = {
    direction = newDirection
  }
}