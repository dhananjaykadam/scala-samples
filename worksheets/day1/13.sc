
val xs = List(1, 2, 3, 4)

0 :: xs

1 :: 2 :: 3 :: 4 :: Nil

val value = Nil.::(4)
value.head
value.tail

val value2 = value.::(3)

11:: value
value
value2

value2.head
value2.tail

value.::(2).::(1)
