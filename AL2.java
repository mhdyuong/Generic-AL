import java.util.*;
public class AL2<K extends Comparable<K>,V> implements List<K,V> {
    private static final int CAPACITY = 100;
    private int index;
    private Pair<K,V>[] list;
    private Pair<K,V>[] temp;

    public AL2() 
    {
        index = 0;
        list = (Pair<K,V>[])new Pair[CAPACITY];
    }
    public boolean add(K key,V value) 
    {
        if( index != list.length) 
        {
            list[index] = new Pair<>(key, value);
            index++;
        } 
        else 
        {
            temp = Arrays.copyOf(list, list.length*2);
            list = temp;
            index++;
            list[index] = new Pair<>(key, value);
        } 
        return true;
    }
    public V lookup(K key) 
    {
        V temp = null;
        int indexOfKey = -1;
        for ( int m = 0;m < list.length; m++) 
        {
            if(list[m].getKey().equals(key)) {
                indexOfKey = m;
                temp = list[m].getValue();
                break;
            }
        }
        if( indexOfKey == -1) {
            return temp;
        }
        return temp;
    }
    public V remove(K key) 
    {
        V result = null;
        for(int i = 0; i < list.length; ++i) 
        {
            if(list[i].getKey().compareTo(key) == 0) 
            {
                result = list[i].getValue();
                index--;
                for(int j = i; j < index; j++)
                    list[j] = list[j+1];
                break;
            }
        }

        return result;
    }
    public V remove(int n) 
    {
        if(n >= index || n < 0)
            throw new RuntimeException("Index out of Bounds.");
        V result = null;

        result = list[n].getValue();
        for(int i = n; i < list.length; i++)
            list[n] = list[n+1];
        index--;

        return result;
    }

    public int size() 
    {
        return index;
    }

    public  V get(int n) {
        if(n >= index || n < 0)
            throw new RuntimeException("Index out of Bounds.");
        return list[n].getValue();
    }

    public V remove() {
        return null;
    }

}
