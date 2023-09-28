/* foldLeft */
val list = List(1, 2, 3, 4, 5)
def adder(acc: Int, i: Int): Int = acc + i
//val list = List(1, 2, 3, 4, 5)
//def adder(i: Int, acc: Int): Int = acc + i
list.foldLeft(0)((acc, x) => adder(acc, x))   //* : Int = 15
list.foldLeft(0)((acc, x) => acc + x)         //* : Int = 15
list.foldLeft(0)(adder(_, _))                 //* : Int = 15
list.foldLeft(0)(_ + _)                       //* : Int = 15
list.foldLeft(0)(adder)                       //* : Int = 15
(list foldLeft 0)(adder)                      //* : Int = 15
(0 /: list)(adder)                            //* : Int = 15
//(method /: is deprecated)

/* foldRight */
// val list = List(1, 2, 3, 4, 5)
// def adder(i: Int, acc: Int): Int = acc + i

list.foldRight(0)((x, acc) => adder(x, acc))   //* : Int = 15
list.foldRight(0)((x, acc) => x + acc)         //* : Int = 15
list.foldRight(0)(adder(_, _))                 //* : Int = 15
list.foldRight(0)(_ + _)                       //* : Int = 15
list.foldRight(0)(adder)                       //* : Int = 15
(list foldRight 0)(adder)                      //* : Int = 15
(list :\ 0)(adder)                             //* : Int = 15
//(method :\ is deprecated)

/* foldLeft vs foldRight */



list.foldLeft( "")((acc, x) => acc + x.toString) //* : String = "12345"
list.foldRight("")((x, acc) => acc + x.toString) //* : String = "54321"

val nilInt = List[Int]()
list.foldLeft( nilInt)(_ :+ _) //* : List[Int] = List(1, 2, 3, 4, 5)
list.foldRight(nilInt)(_ :: _) //* : List[Int] = List(1, 2, 3, 4, 5)
