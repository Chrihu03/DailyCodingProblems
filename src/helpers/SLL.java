package helpers;

public class SLL<T> {
    private SLL_Node<T> head;

    public SLL(){
        head = null;
    }

    public static void main(String[] args) {
        SLL<Integer> list1 = new SLL<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list1: " + list1.listValues());
        SLL<Integer> list2 = new SLL<>();
        System.out.println("list2: " + list2.listValues());
        SLL<Integer> list3 = new SLL<>();
        list3.add(5);
        System.out.println("list3: " + list3.listValues());
        SLL<String> list4 = new SLL<>();
        list4.add("One");
        list4.add("Two");
        list4.add("Three");
        System.out.println("list4: " + list4.listValues());
    }

    public void add(T value){
        SLL_Node<T> newNode = new SLL_Node<>();
        newNode.setValue(value);
        if (head == null){
            head = newNode;
        }
        else{
            SLL_Node<T> currentNode = head;
            while (currentNode.getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }

    public String listValues(){
        String output = "";
        SLL_Node<T> currentNode = head;
        while (currentNode != null){
            output += currentNode.getValue();
            currentNode = currentNode.nextNode;
            if (currentNode != null){
                output += " -> ";
            }
        }
        return output;
    }

    public SLL_Node<T> getHead() {
        return head;
    }

    public void setHead(SLL_Node<T> head) {
        this.head = head;
    }

    public class SLL_Node<T>{
        private T value;
        private SLL_Node<T> nextNode = null;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public SLL_Node<T> getNextNode() {
            return nextNode;
        }

        public void setNextNode(SLL_Node<T> nextNode) {
            this.nextNode = nextNode;
        }
    }
}
