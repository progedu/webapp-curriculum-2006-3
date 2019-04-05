object Main {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
    def splitRec(index: Int, take: List[A], lest: List[A]): (List[A], List[A]) =
      (index, lest) match {
        case (_, Nil) => (take.reverse, Nil)
        case (0, list) => (take.reverse, lest)
        case (i, x::xs) => splitRec(i - 1, x::take, xs)
      }
    splitRec(n, Nil, list)
  }
}
