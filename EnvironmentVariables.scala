import scala.sys.process._

object EnvironmentVariables {
  def main(args: Array[String]) = {

    // Getting an Env Variable
    println( sys.env("NAME") );

    // Setting an Env Variable for a Process
    val process = Process("env", None, "ENVIRONMENT" -> "development");
  }
}
