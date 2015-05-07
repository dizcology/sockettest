import java.net._
import java.io._
import scala.io._

object SocketTest {
  def main(args: Array[String]) {
    val server = new ServerSocket(9000)
        val s = server.accept()
        
          val in = new BufferedSource(s.getInputStream()).getLines()
          val out = new PrintStream(s.getOutputStream())
          //println(in.next())
        while(true) {
          out.println("you typed " + in.next())
          Thread.sleep(2000)
          //out.flush()
          //s.close()
        }
    
  }
  
}
