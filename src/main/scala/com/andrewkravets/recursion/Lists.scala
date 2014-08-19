package com.andrewkravets.recursion

object Lists {

  def sum(xs: List[Int]): Int = if (xs.isEmpty) 0 else xs.head + sum(xs.tail)

  def max(xs: List[Int]): Int = {
    if(xs.length==1) xs.head
    else if (xs.head > max(xs.tail)) xs.head
    else max(xs.tail)
  }

}
