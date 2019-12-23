public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 5;
    private Object mList[];

    public void MyList(){
        mList = new Object[DEFAULT_CAPACITY];
    }

    public void MyList(int capacity){

    }

    public void add(int index, E element){

        if (index < 0 || index >= mList.length){
            throw new IndexOutOfBoundsException(" . . . . . ");
        }
        Object[] temp = new Object[mList.length + 1];  // create the new array into temp.
        for (int i = 0, j = 0; j < temp.length; ++i, ++j){  // loop into the array by comparing the first array to the second array's index i&j
            if ( i == index ) {  // check if i is valid
                temp[index] = element;  // insert element into the array
                --i; // decrement original array to cancel out j temp array
            } else {
                temp[j] = mList[i]; //
            }
        }
        mList = temp;
    }

    public E remove(int index){
        Object[] temp = new Object[mList.length + 1];
        for (int i = 0; i < mList.length; ++i) {
            if(i<index) temp[i]=mList[i];
            if(i>index) temp[i-1]=mList[i];
            //N.B. not added if i == index
        }
        mList = temp;
        return null;
    }

    public int size(){
        size = size++;
        return 0;
    }   

    public E clone(){
        int clone;
        return null;
    }

    public boolean contrains ( E o ){
        return true;
    }
}
