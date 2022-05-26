package pl.gm.linkedlist;

import java.util.Optional;

public class LinkedListNode<V> {
    private V value;
    private LinkedListNode<V> nextNode;

    public LinkedListNode(V value, LinkedListNode<V> nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public V getValue() {
        return value;
    }

    public void setNextNode(LinkedListNode<V> nextNode) {
        this.nextNode = nextNode;
    }

    public Optional<LinkedListNode<V>> getNextNode() {
        return Optional.ofNullable(nextNode);
    }


}
