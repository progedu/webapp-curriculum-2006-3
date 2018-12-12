object Main {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) =  {
    if(num == 0) (Nil: List[A], list ::: Nil)
    else if (list.isEmpty) (Nil, Nil)
    else (list.head :: split(num - 1, list.tail)._1, split(num -1, list.tail)._2)
  }
}
