
import rx._
import rx.ops._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 

val num = Var(2);System.out.println("""num  : rx.core.Var[Int] = """ + $show(num ));$skip(26); 
val twice = Rx{num() * 2};System.out.println("""twice  : rx.core.Rx[Int] = """ + $show(twice ));$skip(8); val res$0 = 
twice();System.out.println("""res0: Int = """ + $show(res$0));$skip(10); 
num() = 4;$skip(8); val res$1 = 
twice();System.out.println("""res1: Int = """ + $show(res$1));$skip(20); 


var num2 = Var(2);System.out.println("""num2  : rx.core.Var[Int] = """ + $show(num2 ));$skip(24); 
var t  = Rx{num2() * 2};System.out.println("""t  : rx.core.Rx[Int] = """ + $show(t ));$skip(5); val res$2 = 

t();System.out.println("""res2: Int = """ + $show(res$2));$skip(14); 
num2 = Var(4);$skip(4); val res$3 = 
t();System.out.println("""res3: Int = """ + $show(res$3))}


}
