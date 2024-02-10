package com.bst;
import com.bst.Node;

public class NodeInsertionDetails {
    Node parentNode;
    String direction;

    /**
     *
     * @return parent Node.
     */
    public Node getParentNode() {
        return parentNode;
    }

    /**
     * Sets parent node as given node.
     *
     * @param parentNode of Node type.
     */
    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    /**
     *
     * @return return current direction of traversal as String.
     */
    public String getDirection() {
        return direction;
    }

    /**
     *
     * @param direction sets the direction of traversal as String.
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }
}
