

val list = List(1, 2, 3, 4, 5)  
def timesTwo(i: Int) = i * 2

list.map(x => timesTwo(x))        
list.map(timesTwo(_))             
list.map(timesTwo)                
list map timesTwo                 



//tuples
new Tuple2[Int, String](4, "scala") 
new Tuple2(4, "scala")              
Tuple2(4, "scala")                  
(4, "scala")                        
4 -> "scala"                        


val listA = List(1, 2)
val listB = List(4, 5)

listA.flatMap(a => listB.map(a * _))

for {
  a <- listA
  b <- listB
} yield (a * b)


/* foldLeft */
//val list = List(1, 2, 3, 4, 5)
def adder(acc: Int, i: Int): Int = acc + i

list.foldLeft(0)((acc, x) => adder(acc, x))   //* : Int = 15
list.foldLeft(0)(adder(_, _))                 //* : Int = 15
list.foldLeft(0)(adder)                       //* : Int = 15
(0 /: list)(adder)                            //* : Int = 15
