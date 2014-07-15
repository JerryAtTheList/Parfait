package com.demo.parfait

trait Fruit {
  def name: String
  def color: String
}

class Banana extends Fruit {
  def name = "BANANA"
  def color = "YELLOW"
}

class Strawberry extends Fruit {
  def name = "STRAWBERRY"
  def color = "RED"
}

class Raspberry extends Fruit {
  def name = "RASPBERRY"
  def color = "DEEP RED"
}

class Blueberry extends Fruit {
  def name = "BLUEBERRY"
  def color = "NAVY BLUE"
}