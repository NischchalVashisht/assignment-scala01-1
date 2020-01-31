package edu.knoldus


class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {

    val z=array.sortWith(_<_)

     val k=mySearch(z,0,array.length-1,elem)

    k
  }

  def mySearch(array:Array[Int],l:Int,r:Int,elem:Int):Boolean= {
    val bool=Array(false)
    if (r >= l) {
       val mid = l + (r - l) / 2
       val bool=Array(false)

      if (array(mid) == elem)
          {
            bool(0)=true
          }

      if (array(mid) > elem) mySearch(array, l, mid - 1, elem)

      mySearch(array, mid + 1, r, elem)
    }
    else
      {
        bool(0)
      }
  }
    def linearSearch(array: Array[Int], elem: Int): Boolean = {

      val b=Array(false)
      for(i<-array)
      {
        if(i==elem) {b(0)=true}
      }
      b(0)
    }


  }

