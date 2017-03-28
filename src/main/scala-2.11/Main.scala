object Main {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {

    def makeSplitList(i: Int, r: Range, li: List[A]): List[A] = {
      if (!r.contains(i)) li
      else makeSplitList(i + 1, r, li ++ List(list(i)))
    }

    if (2 >= n) (List(), list)
    else if (list.length < n) (list, List())
    else (makeSplitList(0, 0 until n, List()), makeSplitList(n, n until list.length, List()))

  }

}
