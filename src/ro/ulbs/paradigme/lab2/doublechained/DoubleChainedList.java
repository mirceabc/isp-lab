package ro.ulbs.paradigme.lab2.doublechained;

import ro.ulbs.paradigme.lab2.api.MyList;

public class DoubleChainedList implements MyList{
    private DoubleChainedNode head;
    private DoubleChainedNode tail;

    @Override
    public void addValue(int value) {
        if (head == null) {
            head = new DoubleChainedNode(value);
            tail = head;
            return;
        }
        DoubleChainedNode current = head;
        while (current != null) {
            if (current.getValue() == value) return; // unique values
            current = current.getNextNode();
        }
        DoubleChainedNode newNode = new DoubleChainedNode(value);
        tail.setNextNode(newNode);
        newNode.setPrevNode(tail);
        tail = newNode;
    }

    @Override
    public DoubleChainedNode getNodeByValue(int value) {
        DoubleChainedNode current = head;
        while (current != null) {
            if (current.getValue() == value) return current;
            current = current.getNextNode();
        }
        return null;
    }

    @Override
    public void removeNodeByValue(int value) {
        DoubleChainedNode current = head;
        while (current != null) {
            if (current.getValue() == value) {
                if (current.getPrevNode() != null)
                    current.getPrevNode().setNextNode(current.getNextNode());
                else
                    head = current.getNextNode();
                if (current.getNextNode() != null)
                    current.getNextNode().setPrevNode(current.getPrevNode());
                else
                    tail = current.getPrevNode();
                return;
            }
            current = current.getNextNode();
        }
    }

    @Override
    public void listNodes() {
        DoubleChainedNode current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNextNode();
        }
        System.out.println();
    }

    @Override
    public int sumValues() {
        int sum = 0;
        DoubleChainedNode current = head;
        while (current != null) {
            sum += current.getValue();
            current = current.getNextNode();
        }
        return sum;
    }

    @Override
    public boolean isSorted() {
        if (head == null) return true;
        DoubleChainedNode current = head;
        while (current.getNextNode() != null) {
            if (current.getValue() > current.getNextNode().getValue()) {
                return false;
            }
            current = current.getNextNode();
        }
        return true;
    }
}