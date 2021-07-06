import java.util.*;

public class AL<K,V> implements List<K,V> 
{
    private int index;
    private Pair[] list;
    private Pair[] temp;
    public AL()
    {
        final int CAPACITY = 100;
        index = 0;
        list = new Pair[CAPACITY];
    }

    public boolean add(K key,V value)
    {
        if( index != list.length)
        {
            list[index] = new Pair<key, value>();
            index++;
        }
        else
        {
            temp = Arrays.copyOf(list, list.length*2);
            list = temp;
            index++;
            list[index] = new Pair<key, value>();
        } 
        return true;
    }

    public V lookup(K key)
    {
        V temp = null;
        int indexOfKey = -1;
        for ( int m = 0;m < list1.length; m++)
        {
            if(list[m].getKey().equals(key))
            {
                indexOfKey = m;
                break;
            }
        }
        if( indexOfKey == -1)
        {
            return temp;
        }
        return list[indexOfKey].getValue();
    }

    public V remove(K key)
    {
        V temp = null;
        int indexOfKey = -1;
        for ( int m = 0;m < list1.length; m++)
        {
            if(list[m].getKey().equals(key))
            {
                indexOfKey = m;
                break;
            }
        }
        if( indexOfKey == -1)
        {
            return temp;
        }
        Pair[] list1;
        Pair[] list2;  
        list1 = Arrays.copyOfRange(list,0, indexOfKey-1);
        list2 = Arrays.copyOfRange(list,0, indexOfKey+1); 
        Pair[] temp = new Pair[list1.length + list2.length];
        for ( int m = 0;m < list1.length; m++)
        {
            temp[m] = list1[m];    
        }
        int k = 0;
        for ( int j = list1.length; j < list2.length; j++)
        {
            temp[j] = list2[k]; 
            k++;
        }
        V temp = list[indexOfKey].getValue();
        list = temp;  
        index--;
        return temp;
    }

    public V remove(int n)
    {
        Pair[] list1;
        Pair[] list2;  
        list1 = Arrays.copyOfRange(list,0, n-1);
        list2 = Arrays.copyOfRange(list,0, n+1); 
        Pair[] temp = new Pair[list1.length + list2.length];
        for ( int m = 0;m < list1.length; m++)
        {
            temp[m] = list1[m];    
        }
        int k = 0;
        for ( int j = list1.length; j < list2.length; j++)
        {
            temp[j] = list2[k]; 
            k++;
        }
        V t = list[n].getValue;
        list = temp;  
        index--;
        return t;

    }

    public  V remove()
    {
        return null;
    }


    public int size()
    {
        return index;
    }

    public  V get(int n)
    {
        return list[m].getValue();
    }

}
