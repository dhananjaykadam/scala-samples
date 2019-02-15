val myList = List(1, 2, 3)

def foldLeft[A, B](list: List[A], seed: B)(f: (B, A) => B): B = {
   if(list.isEmpty)
    return seed
    foldLeft(list.tail, f(seed, list.head))(f)
}

foldLeft( myList,0)((a,b)=> a+b)

myList.head
myList.tail


