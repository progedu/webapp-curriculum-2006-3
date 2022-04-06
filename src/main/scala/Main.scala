object Main {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = list match {
    case Nil => (Nil, Nil)
    case head :: tl => if(n == 1)
    {
      (List(head), tl)
    } else {
      val leftHalf = split(n-1, tl)._1
      val rightHalf = split(n-1, tl)._2
      ((head :: leftHalf), rightHalf)
    }
  }
}
