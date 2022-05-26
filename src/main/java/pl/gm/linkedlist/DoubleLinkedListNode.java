package pl.gm.linkedlist;

public class DoubleLinkedListNode<V> {
    private V value;
    private DoubleLinkedListNode<V> nextNode;
    private DoubleLinkedListNode<V> previousNode;

    public DoubleLinkedListNode(V value, DoubleLinkedListNode<V> nextNode, DoubleLinkedListNode<V> previousNode) {
        this.value = value;
        this.nextNode = nextNode;
        this.previousNode = previousNode;
    }
}
