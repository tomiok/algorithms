package trees;

public class TreeFactory {

  private final Tree tree;

  private TreeFactory(final Tree tree) {
    this.tree = tree;
  }

  public static TreeFactory create(final int root) {
    final Tree t = new Tree(new TreeNode(root));
    return new TreeFactory(t);
  }

  public TreeFactory setChildren(final TreeNode[] treeNode) {
    this.tree.getTreeNode().setChildren(treeNode);
    return this;
  }

  public Tree create() {
    return this.tree;
  }
}
