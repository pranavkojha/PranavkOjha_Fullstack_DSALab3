package com.bst;

import com.bst.BinarySearchTree;
import com.bst.Node;

import java.util.LinkedHashSet;
import java.util.Set;

public class PairFinder {
    protected BinarySearchTree bst;
    protected int sum;
    protected Set<Integer> visitedNodes;
    public PairFinder( BinarySearchTree bst, int sum) {
        this.bst = bst;
        this.sum = sum;
        this.visitedNodes = new LinkedHashSet<>();
    }

    /**
     * Finds a matching pair that equals sum.
     */
    void findPair() {
        this.preOrderTraversal(this.bst.getRoot());

    }

    /**
     * Initiates pre-order traversal to find a pair of nodes that match the sum.
     *
     * @param root Root node of the tree to start traversal.
     */
    void preOrderTraversal(Node root) {
        if(root == null)
            return;
        int currentVal = root.getVal();
        //System.out.print(currentVal + " ");
        this.visitedNodes.add(currentVal);
        int diff = this.sum - currentVal;
        if(this.visitedNodes.contains(diff)) {
            System.out.println("Found pair: " + currentVal + ", " + diff);
            //return;
        }

        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
    }
}
