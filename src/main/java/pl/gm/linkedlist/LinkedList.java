package pl.gm.linkedlist;

import java.util.Optional;

public class LinkedList<V> {
    private LinkedListNode<V> head;

    public LinkedList() {
        head = null;
    }

    public void addFront(V item) {
        this.head = new LinkedListNode<>(item, head);
    }

    public void deleteFront() {
        Optional<LinkedListNode<V>> firstNode = Optional.ofNullable(this.head);
        this.head = firstNode.flatMap(LinkedListNode::getNextNode).orElse(null);
        firstNode.ifPresent(n -> n.setNextNode(null));
    }

    public Optional<LinkedListNode<V>> find(V item) {
        Optional<LinkedListNode<V>> node = Optional.ofNullable(this.head);
        while (node.filter(n -> n.getValue() != item).isPresent()) {
            node = node.flatMap(LinkedListNode::getNextNode);
        }
        return node;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
