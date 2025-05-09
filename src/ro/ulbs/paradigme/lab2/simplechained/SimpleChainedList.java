package ro.ulbs.paradigme.lab2.simplechained;

import ro.ulbs.paradigme.lab2.api.MyList;

public class SimpleChainedList implements MyList {

    private SimpleChainedNode head;

    @Override
    public void addValue(int value){
        if(head == null){
            head = new SimpleChainedNode(value);
            return;
        }

        SimpleChainedNode current = head;

        while(current.getNextNode() != null){
            if(current.getValue() == value) return;
            current = current.getNextNode();
        }

        if(current.getValue() == value) return;
        current.setNextNode(new SimpleChainedNode(value));
    }

    @Override
    public SimpleChainedNode getNodeByValue(int value) {
        SimpleChainedNode current = head;
        while (current != null) {
            if (current.getValue() == value) return current;
            current = current.getNextNode();
        }
        return null;
    }

    @Override
    public void removeNodeByValue(int value) {
        if (head == null) return;
        if (head.getValue() == value) {
            head = head.getNextNode();
            return;
        }
        SimpleChainedNode prev = head;
        SimpleChainedNode current = head.getNextNode();
        while (current != null) {
            if (current.getValue() == value) {
                prev.setNextNode(current.getNextNode());
                return;
            }
            prev = current;
            current = current.getNextNode();
        }
    }

    @Override
    public void listNodes() {
        SimpleChainedNode current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNextNode();
        }
        System.out.println();
    }

    @Override
    public int sumValues() {
        int sum = 0;
        SimpleChainedNode current = head;
        while (current != null) {
            sum += current.getValue();
            current = current.getNextNode();
        }
        return sum;
    }

    @Override
    public boolean isSorted() {
        if (head == null) return true;
        SimpleChainedNode current = head;
        while (current.getNextNode() != null) {
            if (current.getValue() > current.getNextNode().getValue()) {
                return false;
            }
            current = current.getNextNode();
        }
        return true;
    }
}
