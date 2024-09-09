import java.io.PrintWriter;

public class HelloWorld {
  public static void main (String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println ("Hello, GitHub (edited from GitHub)!");
    pen.println("Conflicting Changes");
    pen.flush();
    pen.close();
  } // main(String[])
}
