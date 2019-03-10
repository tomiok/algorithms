package trees;

public class TreeNode {

  private final int data;

  private TreeNode[] children;

  public TreeNode(final int data, final TreeNode... children) {
    this.data = data;
    this.children = children;
  }

  public int getData() {
    return this.data;
  }

  public TreeNode[] getChildren() {
    return this.children;
  }

  public void setChildren(final TreeNode[] children) {
    this.children = children;
  }

  @Override
  public String toString() {
    return this.data + "->" + check(this.children);
  }

  private String check(final TreeNode[] nodes) {
    if (nodes.length == 0) {
      return "null";
    } else {
      final StringBuilder sb = new StringBuilder();
      for (final TreeNode node : nodes) {
        sb.append(node.toString());
      }
      return sb.toString();
    }
  }
}
