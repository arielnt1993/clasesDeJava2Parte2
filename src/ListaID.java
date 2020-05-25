import java.util.NoSuchElementException;

class Nodo{
    int value;
    Nodo next;

    public Nodo(int value) {
        this.value = value;
    }
}

public class ListaID {
    private Nodo root;
    private int size;
    public void add(int x){
        Nodo n = new Nodo(x);
        n.next= root;
        root = n;
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

    public static void main(String[] args) {
        ListaID l = new ListaID();
        l.add(3);
        l.add(5);

    }
}


