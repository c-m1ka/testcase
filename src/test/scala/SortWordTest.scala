import org.scalatest.flatspec.AnyFlatSpec

class SortWordTest extends AnyFlatSpec{
  "Method sort with value testStr" should "return correct result compare with value correctStr" in {
    val testStr = "asdasdaaaweqbbbbasdasd"
    val correctStr = "aaaaaaassssddddbbbbwqe"
    val sortWord = SortWord

    assert(sortWord.sort(testStr) == correctStr)
  }
}
