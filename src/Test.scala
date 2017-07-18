import rx._
import rx.ops._

object Test extends App {
  
   val a = Var(1)
   val b = Var(2)                   
                                    
  val c: Rx[Int] = Rx{ a() + b() }  

  val o = c.foreach{value =>
    println(s"c has a new value: ${value}")
  }                                 
                                    
  a() = 4                             
  b() = 12                            
  a() = 35 

}