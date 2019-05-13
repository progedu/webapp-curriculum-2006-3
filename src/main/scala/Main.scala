object Main {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
    list.zipWithIndex.foldLeft((Nil: List[A], Nil: List[A])) { case ((left, right), (e, i)) =>
    if (i < n) (left :+ e, right) else (left, right :+ e)
    }
  }
}
