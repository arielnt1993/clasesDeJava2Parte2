import java.util.NoSuchElementException;

class Nodo{
    int value;
    int next;
}

public class Lista {
    private int size;
    public void add(int x){
        size++;
    }
    public int get(int pos){
        if (pos < 0){
            throw new NoSuchElementException();
        }
        return -1;
    }
    public boolean contains(int x){
        return false;
    }

    public  boolean isEmpty(){
        return size == 0;
    }

    public int size() {
        return size;
    }
}


