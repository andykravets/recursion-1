package com.andrewkravets.recursion

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import Lists._


@RunWith(classOf[JUnitRunner])
class ListsSuite extends FunSuite{

  test("sum of a few numbers") {
    assert(sum(List(1,2,0)) === 3)
  }
  test("max of a few numbers") {
    assert(max(List(3, 7, 2)) === 7)
  }

}
