package com.demo.parfait

class NutDoer(implicit nutConfig: NutConfig) {
  val nutName = nutConfig.theNut.name
  def getNutName: String = nutName
}

class FruitDoer(implicit fruitConfig: FruitConfig) {
  val fruitName = fruitConfig.theFruit.name
  def getFruitName: String = fruitName

  val fruitColor = fruitConfig.theFruit.color
  def getFruitColor: String = fruitColor
}

class IceCreamDoer(implicit iceCreamConfig: IceCreamConfig) {
  val iceCreamFlavor = iceCreamConfig.theCream.flavor
  def getIceCreamFlavor: String = iceCreamFlavor

  val iceCreamColor = iceCreamConfig.theCream.color
  def getIceCreamColor: String = iceCreamColor

  val iceCreamTexture = iceCreamConfig.theCream.texture
  def getIceCreamTexture: String = iceCreamTexture

  val iceCreamTemp = iceCreamConfig.theCream.temp
  def getIceCreamTemp: Double = iceCreamTemp
}

trait TempDoubler {
  def iceCream: IceCream
  def nut: Nut
  def fruit: Fruit

  lazy val meltIt: String = s"${nut.name} + ${fruit.name} + ${iceCream.flavor} at ${iceCream.temp * 2} F == one big mess!"
}

