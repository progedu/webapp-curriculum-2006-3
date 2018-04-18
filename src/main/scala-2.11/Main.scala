object Main {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) =
    (list.take(n), list.takeRight(list.size - n))
}
