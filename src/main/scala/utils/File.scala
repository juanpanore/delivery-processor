object File   {
  import scala.io.Source
  import java.io.PrintWriter

  def read(path:String): List[String] ={
    Source.fromFile(path).getLines.toList
  }

  def write(path:String, number:Int, coodinate: String): Any ={
    new PrintWriter(path.concat("out0".concat(number.toString)) +".txt") { write(coodinate); close }
  }
}