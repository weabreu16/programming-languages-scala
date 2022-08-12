import java.net.URL
import java.util.Scanner

object NetworkIO {
  def main(args: Array[String]) = {

    // Setting the URL
    val url = new URL("https://terraria.fandom.com/wiki/Terraria_Wiki");

    // Reading from URL
    val scanner = new Scanner( url.openStream() );
  
    val stringBuffer = new StringBuffer();

    while ( scanner.hasNext() ) {
      stringBuffer.append( scanner.next() );
    }

    // Getting the result string
    val result = stringBuffer.toString();
    println(result);
  }
}
