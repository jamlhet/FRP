
import rx._
import rx.ops._

object test {

val num = Var(2)
val twice = Rx{num() * 2}
twice()
num() = 4
twice()


var num2 = Var(2)
var t  = Rx{num2() * 2}

t()
num2 = Var(4)
t()


}