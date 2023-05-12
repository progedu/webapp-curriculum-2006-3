import scala.annotation.tailrec

object Main {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
    if (n > list.length) {
      return (Nil, list)
    }
    @tailrec
    def splitInner(i: Int, acc: List[A], list: List[A]): (List[A], List[A]) = i match {
      case 0 => (Nil, list)
      case 1 => (acc :+ list.head, list.tail)
      case _ => splitInner(i - 1, acc :+ list.head, list.tail)
    }
    splitInner(n, Nil, list)
  }
}
