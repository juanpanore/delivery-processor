object CoordinatesCalculator {
  def calculateRouteInPlane(route: String): String = {
    var x, y: Int = 0
    var direction: String = "Norte"
    route.map(step => {
      direction match {
        case "Norte" => step match {
          case 'A' => x += 1
          case 'I' => direction = "Oriente"
          case 'D' => direction = "Occidente"
        }
        case "Sur" => step match {
          case 'A' => x -= 1
          case 'I' => direction = "Occidente"
          case 'D' => direction = "Oriente"
        }
        case "Oriente" => step match {
          case 'A' => y -= 1
          case 'I' => direction = "Sur"
          case 'D' => direction = "Norte"

        }
        case "Occidente" => step match {
          case 'A' => y += 1
          case 'I' => direction = "Norte"
          case 'D' => direction = "Sur"
        }
      }
    })
    "(".concat(y.toString().concat(",".concat(x.toString.concat(") ".concat("dirección ".concat(direction))))))
  }


}