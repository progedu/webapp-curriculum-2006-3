object Main {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = list match {
    case Nil => (Nil,Nil)
    case _  if n >= 0 => (list.take(n),list.takeRight(list.length-n))
  }
  def split2[A](n:Int, list:List[A]):(List[A],List[A]) = {
    def splitRec[A](index:Int,take:List[A],lest:List[A]):(List[A], List[A]) = {
      (index,lest) match {
        case (_,Nil) => (take.reverse,Nil)
        case (0,list) => (take.reverse,list)
        case (i,x::xs) =>splitRec(i-1,x::take,xs)
      }
    }
    splitRec(n, Nil, list)
  }
}
