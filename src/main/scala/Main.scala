object Main {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
    val left = list.foldLeft(Nil: List[A])((x, y) => {
      if (x.size < n) y :: x
      else x
    }).reverse

    val right = list.foldRight(Nil: List[A])((y, x) => {
      if (x.size < list.size - n) y :: x
      else x
    })

    (left, right)
  }
}
