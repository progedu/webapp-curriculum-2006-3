object Main {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
    import scala.annotation.tailrec
    @tailrec
    def loop(i: Int, left: List[A], right: List[A]): (List[A], List[A]) = i match {
      case 0 => (left.reverse, right)
      case _ if right.isEmpty => (left.reverse, right)
      case _ => loop(i - 1, right.head :: left, right.tail)
    }

    loop(n, Nil, list)
  }
}
