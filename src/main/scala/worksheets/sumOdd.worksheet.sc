val list = List(1, 7, 4, 4, 8, 6, 2, 9, 0)

list.filter(_ % 2 != 0).sum                                     //* : Int = 17 
list.collect {case x if x % 2 != 0 => x}.sum                    //* : Int = 17
list.foldLeft(0) {(sum, x) => if (x % 2 != 0) sum + x else sum} //* : Int = 17
(for (x <- list if x % 2 != 0) yield x).sum                     //* : Int = 17