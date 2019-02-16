val xs = List(1, 2, 3, 4)

xs.foldLeft(0)((acc: Int, elm: Int) => acc + elm)
xs.foldLeft(1)((acc, elm) => acc * elm)
xs.foldLeft("")((acc: String, elm: Int) => acc + elm)
xs.foldLeft(List.empty[Int])((acc: List[Int], elm: Int) => elm :: acc)

xs.foldLeft(0) { (acc: Int, elm: Int) =>
    println((acc, elm, acc + elm))
    acc + elm
}