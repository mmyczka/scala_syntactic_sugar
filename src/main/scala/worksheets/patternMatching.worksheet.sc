val lst = List(1, 2, 3, 4, 5)
lst match { case List(n, _*) => n }
lst match { case n :: _ => n}
