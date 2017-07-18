package BankAccount

import rx._
import rx.ops._



object accounts {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(162); 
  def consolidated(accts : List[BankAccount]): Rx[Int] =
     Rx{accts.map(_.balance()).sum};System.out.println("""consolidated: (accts: List[BankAccount.BankAccount])rx.Rx[Int]""")}
     
    
  
   
}
