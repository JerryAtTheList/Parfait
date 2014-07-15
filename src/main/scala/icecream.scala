package com.demo.parfait

trait IceCream {
  def flavor: String
  def color: String
  def texture: String = "SMOOTH"
  def temp: Double = 25.0
}

class Vanilla extends IceCream {
  def flavor = "VANILLA"
  def color = "OFF-WHITE"
}

class StrawberryChunk extends IceCream {
  def flavor = "STRAWBERRY CHUNK"
  def color = "PINK"
  override def texture = "CHUNKY"
}

class Chocolate extends IceCream {
  def flavor = "CHOCOLATE"
  def color = "BROWN"
}

