package trees;

public class Tree {

  private final TreeNode treeNode;

  public Tree(final TreeNode treeNode) {
    this.treeNode = treeNode;
  }

  public TreeNode getTreeNode() {
    return treeNode;
  }

  @Override
  public String toString() {
    return this.treeNode.toString();
  }
}