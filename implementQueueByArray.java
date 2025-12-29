import java.util.*;

public class implementQueueByArray{
    static class Queue{
        static int arr[];
        static int size ;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        //add
        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            rear = rear+1;
            arr[rear] = data;
        }
        //remove
        public static int remove(){
            if(rear==-1){
                System.out.println("queue is empty");
                return -1;
            }else{
                int front = arr[0];
                for(int i = 0;i<rear;i++){
                    arr[i] = arr[i+1];
                }
                return front;
            }
        }
        //peek
        public static int peek(){
            if(rear>-1){
                int front = arr[0];
                return front;
            }else{
                System.out.println("queue is empty");
                return -1;
            }
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.print("the Queue is "+ q.remove());
    }
}