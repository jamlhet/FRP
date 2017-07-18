package BankAccount

import rx._
import rx.ops._



object accounts {
  def consolidated(accts : List[BankAccount]): Rx[Int] =
     Rx{accts.map(_.balance()).sum}
     
    
  
   
}