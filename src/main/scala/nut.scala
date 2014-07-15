package com.demo.parfait

trait Nut {
  def name: String
}

class Almond extends Nut {
  def name = "ALMOND"
}

class Peanut extends Nut {
  def name = "PEANUT"
}

class Walnut extends Nut {
  def name = "WALNUT"
}