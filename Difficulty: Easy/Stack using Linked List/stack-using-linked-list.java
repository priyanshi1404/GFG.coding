class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;  //null by default

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        StackNode node=new StackNode(a); //create a new node
        node.next=top;
        top=node;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if(top==null){
            return -1;
        }
        int data=top.data;
        top=top.next;
        return data;
        // Add your code here
    }
}