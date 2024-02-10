package com.bst;

import com.bst.Node;
import com.bst.NodeInsertionDetails;

public class BinarySearchTree {
    protected Node root;


    /** This method returns the root node.
     *
     * @return Return the root Node.
     */
    public Node getRoot() {
        return this.root;
    }

    public BinarySearchTree() {
        this.root = null;
    }

    /**
     * This method inserts a node in a B.Tree.
     *
     * @param val in int to be added in the B.Tree.
     */
    public void insert(int val) {
        // create new node
        Node newNode = new Node(val);
        // If null
        if (this.root == null) {
            // make root point to new node
            this.root = newNode;
        } else {
            // Call the constructNodeDetails.
            NodeInsertionDetails nodeDetails = this.constructNodeDetails(val);

            // Set the relationship between parent-node and new-node
            Node parentNode = nodeDetails.getParentNode();
            String direction = nodeDetails.getDirection();

            // Left - Child / Right-Child
            if (direction.equals("LEFT")) {
                parentNode.setLeft(newNode);
            } else if (direction.equals("RIGHT")) {
                parentNode.setRight(newNode);
            }
        }
    }

    /**
     * This method should return the parent node where the new value should be inserted.
     *
     * @param data value to be inserted.
     *
     * @return Node where the value can be inserted.
     */
    NodeInsertionDetails constructNodeDetails(int data) {
        NodeInsertionDetails nid = new NodeInsertionDetails();
        this.traverseTree(this.root, data, nid);
        return nid;
    }

    /**
     * This methond traverses the node to find a right place to insert data.
     *
     * @param aNode
     * @param data
     * @param details
     */
    void traverseTree(Node aNode, int data, NodeInsertionDetails details) {
        if(aNode.getVal() >= data) {
            if(aNode.getLeft() == null) {
                details.setDirection("LEFT");
                details.setParentNode(aNode);
                return;
            }
            traverseTree(aNode.getLeft(), data, details);
        } else {
            if(aNode.getRight() == null) {
                details.setDirection("RIGHT");
                details.setParentNode(aNode);
                return;
            }
            traverseTree(aNode.getRight(), data, details);
        }
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
