import scala.annotation.tailrec

object Main {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
    @tailrec
    def go(n: Int, list: List[A], acc: List[A]): (List[A], List[A]) = (n, list) match {
      case (_, Nil) => (acc.reverse, Nil)
      case (0, l) => (acc.reverse, l)
      case (i, x :: xs) => go(i - 1, xs, x :: acc)
    }
    go(n, list, Nil)
  }
}
