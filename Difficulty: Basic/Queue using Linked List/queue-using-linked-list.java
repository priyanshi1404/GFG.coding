/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code her
        QueueNode node=new QueueNode(a);
        if(front == null){  //no queue exists
            front=rear = node;
        }
        else{
            rear.next=node;
            rear=node;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front == null){
            return -1;
        }  //no ll or queue exists
        int data=front.data;
        front=front.next;
        return data;
	}
}




