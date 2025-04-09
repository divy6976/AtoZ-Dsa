class LRUCache {
Node head=new Node(-1,-1);
Node tail=new Node(-1,-1);
HashMap<Integer,Node> map=new HashMap<>();
int capacity;

    public LRUCache(int capacity) {
           this.capacity = capacity; 
    head.next=tail;
    tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node=map.get(key);
        deleteNode(node);
        insertafterhead(node);
        return node.value;

    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;
            deleteNode(node);
            insertafterhead(node);
        }else{
              if (map.size() == capacity) {
                Node node=tail.prev;
                deleteNode(node);
                map.remove(node.key);
            }
            Node node=new Node(key,value);
          map.put(key, node);
            insertafterhead(node);
        }
    }
    public void deleteNode(Node node){
Node prevnode=node.prev;
Node afternode=node.next;
prevnode.next=afternode;
afternode.prev=prevnode;
    }
    public void insertafterhead(Node node){
        Node afterhead=head.next;
        head.next=node;
        node.next=afterhead;
        afterhead.prev=node;
        node.prev=head;
    } 

    class Node {
        Node prev; Node next;
        int key, value;
        Node(int _key, int _value) {
            key = _key;
            value = _value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */