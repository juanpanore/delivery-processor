object CoordinatesCalculator {
  def calculateRouteInPlane(route: String): String = {
    var coordinate = new Coordinates(0, 0, "Norte")
    route.map(step => {
      coordinate.direction match {
        case "Norte" => step match {
          case 'A' => coordinate.moveX(1)
          case 'I' => coordinate.moveDirection("Oriente")
          case 'D' => coordinate.moveDirection("Occidente")
        }
        case "Sur" => step match {
          case 'A' => coordinate.moveX(-1)
          case 'I' => coordinate.moveDirection("Occidente")
          case 'D' => coordinate.moveDirection("Oriente")
        }
        case "Oriente" => step match {
          case 'A' => coordinate.moveY(-1)
          case 'I' => coordinate.moveDirection("Sur")
          case 'D' => coordinate.moveDirection("Norte")

        }
        case "Occidente" => step match {
          case 'A' => coordinate.moveY(1)
          case 'I' => coordinate.moveDirection("Norte")
          case 'D' => coordinate.moveDirection("Sur")
        }
      }
    })
    "(".concat(coordinate.y.toString().concat(",".concat(coordinate.x.toString.concat(") ".concat("dirección ".concat(coordinate.direction))))))
  }


}