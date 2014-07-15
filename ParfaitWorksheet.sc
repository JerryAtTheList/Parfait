import com.demo.parfait._
import org.scalatest._

class TotalParfaitTest extends FunSpec with Matchers {
  describe ("Using the implicit parameter injection approach") {
    it ("should work for chocolate ice cream, almonds, and strawberry") {
      implicit object MyTotalParfaitConfig extends WholeParfaitConfig {
        val theNut: Nut = new Peanut
        val theFruit: Fruit = new Blueberry
        val theCream: IceCream = new StrawberryChunk
      }

      val theParfait = new TotalParfait("Choco-Almond-Strawberry")

      theParfait.meltIt should include ("mess") //include/contain

      theParfait.getComponentDescriptions should be ("blah blah blah")

    }
  }
}
run(new TotalParfaitTest)



















