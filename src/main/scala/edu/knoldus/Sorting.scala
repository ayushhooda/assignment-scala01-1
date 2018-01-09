package edu.knoldus

class Sorting {

  // Insertion Sort
  def insertionSort(list: Array[Int]): Array[Int] = {
    for(i <- 0 to list.length - 1) {
      val key = list(i)
      var j = i - 1
      while(j >= 0 && list(j) > key) {
        list(j + 1) = list(j)
        j = j - 1
      }
      list(j + 1) = key
    }
    list
  }

  // Selection Sort
  def selectionSort(list: Array[Int]): Array[Int] = {
    for(i <- 0 until list.length - 1) {
      var minIndex = i
      for(j <- i + 1 until list.length){
        if(list(j) < list(minIndex)) {
          minIndex = j
          val temp = list(i)
          list(i) = list(minIndex)
          list(minIndex) = temp
        }
      }
    }
    list
  }

  // Bubble Sort
  def bubbleSort(list: Array[Int]): Array[Int] = {
    for(i <- 0 until list.length - 1) {
      for(j <- 0 until list.length - i - 1) {
        if(list(j) > list(j + 1)) {
          val temp = list(j)
          list(j) = list(j + 1)
          list(j + 1) = temp
        }
      }
    }
    list
  }

}
