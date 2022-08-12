import scala.io.StdIn.readLine

object StandardStreams {
  def main(args: Array[String]) = {
    // Standard Output
    println("Write your name: ");

    // Standard Input
    val name = readLine();

    // Standard Error
    System.err.println(s"An error occurred, $name");
  }
}
