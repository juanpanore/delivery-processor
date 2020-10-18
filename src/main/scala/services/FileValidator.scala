object FileValidator {

  def validationList(list: List[String]): Boolean = {
    list.flatMap(route => route.toUpperCase).filterNot(_.equals('A')).filterNot(_.equals('D')).filterNot(_.equals('I')).size == 0
  }

  def validationNumberRoutes(list: List[String]): Boolean = {
    list.size <= Constants.maxNumberRoutes
  }

}