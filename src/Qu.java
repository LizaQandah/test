import javax.xml.soap.Node;

public class Qu <Item>{

    int head ,tail,N;
    Item[] qu;

    public Qu(){
        qu =(Item[]) new Object [128];
        head = 0;
        tail = 0;
        N = 0;

    }
    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }


    public void enq(Item e){

        if(e==null)
            throw new IllegalArgumentException();

        if(N==qu.length)
            resize(qu.length*2);

        qu[tail] = e;
        tail++;
         N++;

    }

    public Item dequeue() throws NoSuchFieldException {

        if(N==0)
            throw new NoSuchFieldException();


        Item temp = qu[head];
        qu[head] = null;
        head++;
        N--;

        if ( N == qu.length/4)
            resize(qu.length/2);

        return temp;
    }


    private void resize(int capacity){
        Item[] temp = (Item[]) new Object[capacity];

        int cnt=head;
        for (int i = 0; i < N; i++){
            temp[i] = qu[cnt];
            cnt++;
        }
        qu = temp;
        head=0;tail=N;
    }


}
