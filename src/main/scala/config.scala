package com.demo.parfait

trait FruitConfig {
  val theFruit: Fruit
}

trait IceCreamConfig {
  val theCream: IceCream
}

trait NutConfig {
  val theNut: Nut
}

trait WholeParfaitConfig extends FruitConfig with IceCreamConfig with NutConfig