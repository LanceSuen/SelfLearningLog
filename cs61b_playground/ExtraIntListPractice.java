public class IntList{
    public int head;
    public IntList tail;

    public IntList(int x, IntList y){
        this.head = x;
        this.tail = y;
    }

    public int size(){
        if (this.tail == null){
            return 1;
        }
        return this.tail.size();
    }

    public int stupidGet(int index){
        int i = index;
        IntList p = this;
        while(i > 0){
            p = p.tail;
            i = i - 1;
        }
        return p.head;
    }

    public int get(int index){
        if (index == 0){
            return this.head;
        }
        index -= 1;
        return this.tail.get(index);
        /** return this.tail.get(index - 1) */
    }
}

public class ExtraIntListPractice {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        return L;        
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.tail = new IntList(7, null);
        L.tail.tail = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(L.get(1));
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));        
    }
}

