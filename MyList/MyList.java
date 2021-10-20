import java.util.Arrays;

public class MyList<T> {
  
    private T[] array ;
    private int capacity = 10;
    private  int indis = 0 ;

    public MyList() {
        this.array = (T[]) new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    public int size(){  return indis;  }
    
    public int getCapacity(){  return capacity;  }

    public void add(T value){
        if(indis == this.capacity){
          capacity *= 2 ;
          this.array = Arrays.copyOf(array,capacity); 
        }
        this.array[indis++] = value;
  
    }

    public T get(int index){
        if(index<indis) return array[index];
        return null;
    }
    
    public T remove(int index){
        int j = -1;

        T[] newArray = (T[]) new Object[capacity];
        if(index >= indis)  return null;
        
        for (int i=0; i<indis; i++){
            if(i != index ) { newArray[++j] = array[i]; }
            else continue;
        }
        indis--;
        this.array = newArray;
        return this.array[index];
    }

    public T set(int index, T data){
        if(index>= indis) return null;
        array[index] = data;
        return this.array[index];
    }

    public String toString(){ 
        String str = "[" ;
        for(int i=0; i<indis; i++){
            str += array[i] ;
            if(i!=indis-1) str +=",";
        }
        str += "]";
        return str;

    }

    public int indexOf(T data){
        for (int i=0; i<size(); i++){
            if(array[i] == data) return i;
        }
        return -1;    
    }
    
    public int lastIndexOf(T data){
        int foundIndex = -1;
        for (int i=0; i<size(); i++){
            if(array[i] == data) foundIndex = i;
        }
        return foundIndex;
    }

    public boolean isEmpty(){
        if(this.size() != 0) return false;
        return true;
      
    }
    
    public boolean contains(T data){
        if(this.indexOf(data) != -1) return true;
        return false;
    }

    public T[] toArray() {
        Object array = Arrays.copyOf(this.array,size());
        return (T[]) array;
    }

    public void clear(){
        Arrays.fill(array,null);
    }
    
    public MyList<T> subList(int start,int finish){
        MyList<T> sublist = new MyList<>(finish-start+1);
      
        for(int i=start;i<=finish;i++){
            sublist.add((T)this.array[i]);
        }
        return sublist;
    } 
 }
