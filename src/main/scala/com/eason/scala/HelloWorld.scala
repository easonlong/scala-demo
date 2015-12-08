package com.eason.scala;

import com.eason.Hello

/**
  * Created by longyaokun on 2015-12-7.
  */

object HelloWorld{
  def main(args: Array[String]) {
    for( i<- 1 to 10){
      println(new Hello().hello())
    }
  }
}

