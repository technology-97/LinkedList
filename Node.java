 class Node2
{       
        int data;
        Node next;
    };

    class LinkedList {
        Node head;

        LinkedList(){
            head = null;
        }

        //Add new element at the end of the list
        void push_back(int newElement) {
            Node newNode = new Node();
            newNode.data = newElement;
            newNode.next = null;
            if(head == null) {
                //for first element in the list
                head = newNode;
            } else {
                Node temp = new Node();
                temp = head;
                while(temp.next != null)
                    temp = temp.next;
                temp.next = newNode;
            }
        }

        //Delete last node of the list
        void pop_back() {
            if(this.head != null) {
                if(this.head.next == null) {
                    this.head = null;
                } else {
                    Node temp = new Node();
                    temp = this.head;
                    while(temp.next.next != null)
                        temp = temp.next;
                    Node lastNode = temp.next;
                    temp.next = null;
                    lastNode = null;
                }
            }
        }

        //display the content of the list
        void PrintList() {
            Node temp = new Node();
            temp = this.head;
            if(temp != null) {
                System.out.print("The list contains: ");
                while(temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            } else {
                System.out.println("The list is empty.");
            }
        }

        public void append(int i) {
        }
    };

    // test the code
    class Implementation {
        public static void main(String[] args) {
            LinkedList MyList = new LinkedList();

            //Add four elements in the list.
            MyList.push_back(56);
            MyList.push_back(30);
            MyList.push_back(70);

            MyList.PrintList();

            //Delete the last node
            MyList.pop_back();
            MyList.PrintList();
        }
    }






