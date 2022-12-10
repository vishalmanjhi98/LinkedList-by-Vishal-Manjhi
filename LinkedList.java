class LinkedList{
    Node head;
    private int size;

    LinkedList(){
        this.size = 0;
    }

   // Node class.
   class Node{
    String data;
    Node next;
    // constructor.
    Node(String data){
        this.data = data;
        this.next = null;
        size++;
    }
    }

    //add last function;
    public void add_Last(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //add Frist function;
    public void aad_Frist(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // print list function.
    public void print_List(){
        if(head == null){
            System.out.println("Your List Is Empty");
            return;
        }
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data+"-->");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    // Delet Frist;
    public void Delete_frist(){
        if(head.next == null){
            head = null;
            return;
        }
        size--;
        head = head.next;
    }

    // Delet last;
    public void Delete_last(){
        if(head == null){
            System.out.println("Your List Is Empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node curNode = head;
        Node nextNode = head.next;
        while(nextNode.next != null){
            curNode = curNode.next; 
            nextNode = nextNode.next;
        }
        curNode.next = null;
    }

    // Get size function;
     public int get_Size(){
        return size;
     }

    public static void main(String[] args) {  
        LinkedList LL = new LinkedList();

        // calling Add Last function;
        LL.aad_Frist("This");
        LL.aad_Frist("look");
        LL.aad_Frist("work!");
        LL.aad_Frist("Great");

        // calling print list function;
        LL.print_List();

        // calling size function;
        System.out.println(LL.get_Size());

        // for secondline;
        System.out.println();

        // calling add Last function;
        LL.add_Last("is");
        LL.add_Last("a");
        LL.add_Last("list");
        LL.add_Last("created by");
        LL.add_Last("you");

        // calling print list function;
        LL.print_List();

        // calling size function;
        System.out.println(LL.get_Size());

        // for secondline;
        System.out.println();

        // calling delet frist function;
        LL.Delete_frist();

        // calling print last function;
        LL.print_List();

        // calling size function;
        System.out.println(LL.get_Size());

        // for secondline;
        System.out.println();

        // calling delet last function;
        LL.Delete_last();

        // calling print last function;
        LL.print_List();

        // calling size function;
        System.out.println(LL.get_Size());

        // for secondline;
        System.out.println();

    }
  
}