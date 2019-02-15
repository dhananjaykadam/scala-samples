val myList = List(1, 2, 3)

def foldLeft[A, B](list: List[A], seed: B)(f: (B, A) => B): B = {
  var iterator = list.iterator
  var result = seed
  while (iterator.hasNext) {
    result = f.apply(result, iterator.next())
  }
  result
}

foldLeft( myList,0)((a,b)=> a+b)

myList.foldLeft(0)((a, b) => a + b)



