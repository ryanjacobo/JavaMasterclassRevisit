package dev.lpa.Abstraction.Exercise;

public abstract class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        return rightLink.setNext(item);
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        return leftLink.setPrevious(item);
    }


    @Override
    Object compareTo(Object item) {
        return null;
    }
}
