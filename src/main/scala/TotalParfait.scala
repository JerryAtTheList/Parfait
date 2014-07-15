package com.demo.parfait

class TotalParfait(parfaitName: String)(implicit val config: WholeParfaitConfig)
  extends TempDoubler {
  val iceCream = config.theCream
  val nut = config.theNut
  val fruit = config.theFruit

  val iceCreamThing = new IceCreamDoer
  val nutThing = new NutDoer
  val fruitThing = new FruitDoer

  def getComponentDescriptions: String = s"Current parfait called $parfaitName is made of the following:\n" +
    s"- Ice Cream: (\n" +
    s"  - Color:       ${iceCreamThing.getIceCreamColor}\n" +
    s"  - Flavor:      ${iceCreamThing.getIceCreamFlavor}\n" +
    s"  - Temperature: ${iceCreamThing.getIceCreamTemp.toString} F\n" +
    s"  - Texture:     ${iceCreamThing.getIceCreamTexture}})\n" +
    s"- Fruit: (\n" +
    s"  - Name:        ${fruitThing.getFruitName}\n" +
    s"  - Color:       ${fruitThing.getFruitColor})\n" +
    s"- Nut: (\n" +
    s"  - Name:        ${nutThing.getNutName})"

  val heatTheParfait: String = meltIt
}