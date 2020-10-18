object DeliveryProcessor {
  def proccessDelivery(): Unit = {

    for (i <- 1 to File.count(Constants.inputFilePath, Constants.fileType)) yield {
      var listRoutes = File.read(Constants.inputFilePath.concat("in".concat(if (i < 10) "0" else "").concat(i.toString).concat(Constants.fileType)))
      if (FileValidator.validationList(listRoutes)) {
        if (FileValidator.validationNumberRoutes(listRoutes)) {
          File.write(Constants.outputFilePath, IdFactory.create(), listRoutes.map(route => CoordinatesCalculator.calculateRouteInPlane(route)))
        }
        else
          println("Error al procesar Ruta de Drone número in0".concat(i.toString).concat(Constants.fileType).concat(" supera número de registros permitidos"))
      } else
        println("Error al procesar Ruta de Drone número in0".concat(i.toString).concat(Constants.fileType).concat(" por Carácter Inválido"))
    }
  }
}