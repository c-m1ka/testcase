import IsSame.isSameTree
import org.scalatest.flatspec.AnyFlatSpec

class TreeCompareTest extends AnyFlatSpec {
  "Method isSame" should "return correct result compare with tree" in {
    val simpleP = TreeNode(1, None, None)
    val simpleQ = TreeNode(1, None, None)
    assert(isSameTree(Some(simpleP), Some(simpleQ)))
    val p = TreeNode(1, Some(TreeNode(2, None, None)), None)
    val q = TreeNode(1, None, Some(TreeNode(2, None, None)))
    assert(!isSameTree(Some(p), Some(q)))
  }
}