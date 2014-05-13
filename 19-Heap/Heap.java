public class Heap {

    private int [] heap;
    private int size;

    public Heap () {
	heap = new int [10];
	size = 0;
    }
    public Heap (int [] temp) {
	heap = temp;
	size = temp.length - 1;
    }

    public int getSize() {
	return size;
    }

    public void insert (int n) {
	int insert = size + 1;
	heap[insert] = n;
	int temp;
	while (heap[insert] > heap [insert/2] && insert > 1) {
	    temp = heap [insert/2];
	    heap [insert/2] = heap[insert];
	    heap[insert] = temp;
	    insert = insert/2;
	}

	size++;
    }

    public void sort(){
	int [] temp = new int [heap.length];
	for (int i = 0; i < heap.length; i++)
	    this.insert (temp[i]);
    }
}