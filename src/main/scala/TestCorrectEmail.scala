import scala.util.matching.Regex

object TestCorrectEmail extends App {
  val string = scala.io.StdIn.readLine()

  val regex: Regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$".r

  regex.findFirstMatchIn(string) match {
    case Some(_) => println("email ok")
    case None => println("email invalid")
  }
}
