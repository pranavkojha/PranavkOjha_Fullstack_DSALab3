package com.bst;

public class Node {
    protected int val;
    protected Node left;
    protected Node right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    /**
     *
     * @return Integer value of the node.
     */
    public int getVal() {
        return val;
    }

    /**
     *
     * @return Return the left child of this node.
     */
    public Node getLeft() {
        return left;
    }

    /**
     *
     * @return Returns right child of this node.
     */
    public Node getRight() {
        return right;
    }

    /**
     *
     * @param val sets value of the current node.
     */
    public void setVal(int val) {
        this.val = val;
    }

    /**
     *
     * @param left Set left child as the given node "left" for current node.
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     *
     * @param right Set right child as the given node "right" for current node.
     */
    public void setRight(Node right) {
        this.right = right;
    }

    /**
     *
     * @return String data with current node value.
     */
    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}
