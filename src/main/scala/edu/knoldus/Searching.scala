package edu.knoldus

class Searching {

  // Linear Search
  def linearSearch(numbers: Array[Int], toFind: Int): Boolean = {
    for(i <- 0 until numbers.length - 1) {
      if(numbers(i) == toFind)
        true
    }
    false
  }

  // Binary Search
  def binarySearch(numbers: Array[Int], toFind: Int, startIndex: Int, endIndex: Int): Boolean = {
    if(startIndex < endIndex) {
      val mid = startIndex + (endIndex - startIndex )/2
      if (numbers(mid) == toFind)
        true
      else if (numbers(mid) > toFind)
        binarySearch(numbers, toFind, startIndex, mid - 1)
      else
        binarySearch(numbers, toFind, mid + 1, endIndex)
    }
    return false
  }


}
