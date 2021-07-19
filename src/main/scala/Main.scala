import scala.annotation.tailrec

object Main {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
    @tailrec
    def splitR(curR: Int, curL: List[A], pre: List[A]): (List[A], List[A]) =
      (curR, curL) match {
        case (_, Nil) => (pre.reverse, Nil)
        case (0, list) => (pre.reverse, list)
        case (n, h :: tail) => splitR(n - 1, tail, h :: pre)
      }
    splitR(n, list, Nil)
  }
}