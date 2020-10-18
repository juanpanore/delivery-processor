object Main extends App {
  File.read(Constants.inputFilePath).map(route => {
    File.write(Constants.outputFilePath, IdFactory.create(), CoordinatesCalculator.calculateRouteInPlane(route))
  })
}