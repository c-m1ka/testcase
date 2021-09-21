object IsSame {
  def isSameTree[X](p: Option[TreeNode[X]], q: Option[TreeNode[X]]): Boolean = {
    (p, q) match {
      case (None, None) => true
      case (Some(_), None) => false
      case (None, Some(_)) => false
      case (Some(x), Some(y)) => (x.value == y.value) && isSameTree(x.right, y.right) && isSameTree(x.left, y.left)
    }
  }
}
case class TreeNode[X](value: X, left: Option[TreeNode[X]], right: Option[TreeNode[X]])