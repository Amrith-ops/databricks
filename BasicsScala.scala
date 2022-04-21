// Databricks notebook source
class basic(name:String,age:Int){
  
  def display():Unit={
    
    println(s"The name of the person is ${name} and his age is ${age} ")
  }
  
}

object basic{
  
  def main(args:Array[String]){
    
      val bas1=new basic("amrith",26);
      bas1.display();
  }
}
