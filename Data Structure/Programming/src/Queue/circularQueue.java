package Queue;

public class circularQueue {
    int[] arr;
    int front;
    int rear;
    int elements;

    public circularQueue(int k) {
        arr = new int[k];
        for (int i = 0; i < k; i++)
            arr[i] = -1;
        front = 0;
        rear = 0;
        elements = 0;
    }

    public boolean enQueue(int value) {
        if ((front + arr.length - 1) % arr.length == rear && arr[front] >= 0)
            return (false); // full -> false
        if (front == rear && arr[front] < 0)
            arr[front] = value; // empty
        else {
            rear = (rear + 1) % arr.length; // update rear location
            arr[rear] = value; // enqueue to rear
        }
        return (true);
    }

    public boolean deQueue() {
        if (front == rear && arr[front] < 0) // empty
            return (false);
        arr[front] = -1; // remove
        if (front == rear) // one element
            front = rear = 0; // initialize location
        else
            front = (front + 1) % arr.length; // move front to next
        return (true);
    }

    public int Front() {
        return (arr[front]);
    }

    public int Rear() {
        return (arr[rear]);
    }

    public boolean isEmpty() {
        if (front == rear)
            if (arr[front] < 0)
                return (true);
        return (false);
    }

    public boolean isFull() {
        if ((front + arr.length - 1) % arr.length == rear)
            return (true);
        return (false);
    }
}
