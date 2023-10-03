val pairs = List((1, "one"), (2, "two"), (3, "three"))


pairs.map {case (number, _) => (number *2)} //* : List[Int] = List(2, 4, 6)
pairs.map {case pair => (pair._1 *2)}       //* : List[Int] = List(2, 4, 6)
pairs.map {pair => (pair._1 *2)}            //* : List[Int] = List(2, 4, 6)
pairs.map {_._1 *2}                         //* : List[Int] = List(2, 4, 6)
