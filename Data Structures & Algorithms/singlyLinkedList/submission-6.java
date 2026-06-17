class Node {
    private int value;
    private Node next;
    public Node (int data) {
        value = data;
        next = null;
    }

    public Node (int data, Node nextNode) {
        value = data;
        next = nextNode;
    }

    public int getValue() {
        return value;
    }

    public Node getNextNode() {
        return  next;
    }

    public void setValue(int data) {
        value = data;
    }

    public void setNextNode(Node nextNode) {
        next = nextNode;
    }
}

class LinkedList {

    private Node head;
    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        if(Objects.isNull(head)) return -1;
        if(index == 0) return head.getValue();
        int currentIndex = 0;
        Node currentNode = head;
        while(currentIndex < index) {
            Node nextNode = currentNode.getNextNode();
            if(Objects.nonNull(nextNode))
                currentNode = nextNode;
            else return -1;
            currentIndex++;
        }
        return currentNode.getValue();
    }

    public void insertHead(int val) {
        Node newHead = new Node(val);
        newHead.setNextNode(head);
        head = newHead;
    }

    public void insertTail(int val) {
        if(Objects.isNull(head)) {
            head = new Node(val);
        }else {
        Node currentNode = head;
        while(Objects.nonNull(currentNode.getNextNode())) {
            currentNode = currentNode.getNextNode();
        }
        Node newTailNode = new Node(val);
        currentNode.setNextNode(newTailNode);}
    }

    public boolean remove(int index) {
        if(index == 0) {
            if(Objects.nonNull(head)) {
                head = head.getNextNode();
                return true;
            }
            else return false;
        }
        Node previousNode = null;
        int currentIndex = 0;
        Node currentNode = head;
        while(currentIndex < index) {
            Node nextNode = currentNode.getNextNode();
            currentIndex++;
            if(Objects.nonNull(nextNode)) {
                previousNode = currentNode;
                currentNode = nextNode;
            }
            else return false;
        }
        Node nextNode = currentNode.getNextNode();
        
        if(Objects.nonNull(previousNode)) {
            previousNode.setNextNode(nextNode);
        }
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        if(Objects.isNull(head)) return list;
        Node currentNode = head;
        if(Objects.nonNull(head)) list.add(head.getValue());
        while(Objects.nonNull(currentNode.getNextNode())) {
            currentNode = currentNode.getNextNode();
            list.add(currentNode.getValue());
        }

        return list;
    }
}
