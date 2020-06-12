object Main {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
    @scala.annotation.tailrec
    def splitRec(index: Int,
                 take: List[A],
                 rest: List[A]): (List[A], List[A]) = {
      (index, rest) match {
        case (_, Nil)         => (take.reverse, Nil)
        case (0, list)        => (take.reverse, rest)
        case (index, x :: xs) => splitRec(index - 1, x :: take, xs)
      }
    }
    splitRec(n, Nil, list)
  }
}
