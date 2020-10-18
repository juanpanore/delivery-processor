class FileValidatorTest extends org.scalatest.funsuite.AnyFunSuite {
  val listOK :List[String] = List("AAAAIAA","DDDAIAD","AAIADAD")
  val listMayor :List[String] = List("AAAAIAA","DDDAIAD","AAIADAD","AAIADAD")
  val listCaracter:List[String] = List("AAAAIAA","DDDAIAD","AAIADAD","agfgsd")

  test("FileValidatorTest.validationList") {
    assert(FileValidator.validationList(listOK) === true)
  }
  test("FileValidatorTest.validationList.caracter") {
    assert(FileValidator.validationList(listCaracter) === false)
  }
  test("FileValidatorTest.validationNumberRoutesOK") {
    assert(FileValidator.validationNumberRoutes(listOK) === true)
  }
  test("FileValidatorTest.validationNumberRoutesMayor") {
    assert(FileValidator.validationNumberRoutes(listMayor) === false)
  }
}
