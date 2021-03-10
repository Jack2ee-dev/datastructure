package datastructure.linkedList;

public class LinkedListImpl {

    public static class Node {

        private final int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Integer getData() {
            return this.data;
        }

        public Integer getNextData() {
            return this.next.data;
        }

        public Node getNext() {
            return this.next;
        }
    }

    public static class NodeMgmt {

        private Node head;

        public NodeMgmt(Node head) {
            this.head = head;
        }

        public Node getHead() {
            return this.head;
        }

        public Integer getHeadData() {
            return this.head.getData();
        }

        public void add(int data) {
            if (this.head == null) {
                this.head = new Node(data, null);
                return;
            }
            Node node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(data, null);
        }

        public void describe() {
            Node node = this.head;
            while (node != null) {
                System.out.println(node.data);
                node = node.next;
            }
        }

        public boolean delete(int data) throws NullPointerException {
            throwNullPointerExceptionIfHeadIsEmpty("링크드리스트가 비었습니다. 해당 데이터를 삭제할 수 없습니다.");

            if (this.head.data == data) {
                this.head = this.head.next;
                return true;
            }
            Node node = this.head;
            while (node.next != null) {
                if (node.next.data == data) {
                    node.next = node.next.next;
                    return true;
                }
                node = node.next;
            }
            return false;
        }

        public Node search(int data) throws NullPointerException {
            throwNullPointerExceptionIfHeadIsEmpty("링크드리스트가 비었습니다. 해당 데이터를 검색할 수 없습니다.");
            if (this.head.data == data) {
                return this.head;
            }
            Node node = this.head;
            while (node != null) {
                if (node.data == data) {
                    return node;
                }
                node = node.next;
            }
            return null;
        }

        private void throwNullPointerExceptionIfHeadIsEmpty(String message) {
            if (this.head == null) {
                throw new NullPointerException(message);
            }
        }
    }
}
