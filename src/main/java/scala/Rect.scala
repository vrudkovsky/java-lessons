package scala

class Rect {
  def print(s: String): Unit = {
    System.out.print(s)
  }

  def isBorder(i: Int, j: Int, h: Int, w: Int): Boolean = j == 0 || j == w - 1 || i == 0 || i == h - 1

  def isDiagonal(i: Int, j: Int, h: Int, w: Int): Boolean = {
    val k = w.toDouble / h
    val ik = (i * k).toInt
    val i_mirrored = w - ik - 1
    ik == j || i_mirrored == j
  }

  def isVisible(i: Int, j: Int, h: Int, w: Int): Boolean = isBorder(i, j, h, w) || isDiagonal(i, j, h, w)

  def drawEnvelope(W: Int, H: Int): Unit = {
    for (i <- 0 until H) {
      for (j <- 0 until W) {
        print(if (isVisible(i, j, H, W)) "*"
        else " ")
      }
      print("\n")
    }
  }
}