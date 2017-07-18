package BankAccount

import rx._
import rx.ops._

class BankAccount extends Publisher {
  val balance = Var(0)
  def currentBalance = balance

  def deposit(amount: Int): Unit =
    if (amount > 0) {
      val b = balance()
      balance() = b + amount
      publish()
    }
  def withdraw(amount: Int): Unit =
    if (0 < amount && amount <= balance()) {
      val b = balance()
      balance() = b - amount
      publish()
    } else throw new Error("insufficient funds")
 }

 