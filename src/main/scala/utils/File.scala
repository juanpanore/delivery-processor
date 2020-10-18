object File {

  import scala.io.Source
  import java.io.PrintWriter

  def read(path: String): List[String] = {
    try {
      Source.fromFile(path).getLines.toList.map(_.toUpperCase)
    }
    finally {
      Source.fromFile(path).close()
    }
  }

  def write(path: String, number: Int, coodinates: List[String]): Unit = {

    new PrintWriter(path.concat("out0".concat(number.toString)) + ".txt") {
      coodinates.map(coodinate => {
        write(coodinate.concat(Constants.lineSeparator))
      });
      close
    }
  }

  def count(path: String, ext: String): Int = {
    Option(new java.io.File(Constants.inputFilePath).list).map(_.filter(_.endsWith(ext)).size).getOrElse(0)
  }

}