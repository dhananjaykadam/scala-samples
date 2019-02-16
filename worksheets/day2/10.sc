
def length[A](list: List[A]): Int = list match {
  case Nil => 0
  case head :: tail    => 1 + length(tail)
}

"asdad" charAt 2
"asdad".charAt(2)

3 :: Nil
Nil.::(3)


length(1 :: 2 :: 3 :: Nil)

