import scala.io.Source
import java.io.FileWriter

object FilesIO {
  def main(args: Array[String]) = {

    // Read Lines from File
    val lines = Source.fromFile("data.txt").getLines();

    // Printing all lines with a dot
    for (line <- lines) {
      println(s"$line.");
    }

    // Append Text to File
    val fw = new FileWriter("data.txt", true);
    try {
      fw.write("\nSome new data");
    }
    finally fw.close();
  }
}
