
import java.util.*;

public class ArrayList<T>
{
    private int index;
    private T[] list;
    private T[] temp;
    public ArrayList()
    {
        final int CAPACITY = 100;
        index = 0;
        list = (T[]) new Object[CAPACITY];
    }
    public boolean isEmpty()
    {
        if (index == 0)
        return true;
        return false;
    }

    public void add(T element)
    {
        if( index != list.length)
        {
          list[index] = element;
          index++;
        }
        else
        {
            temp = Arrays.copyOf(list, list.length*2);
            list = temp;
            index++;
            list[index] = element;
        }
    }
    
    public T get (int i)
    {
      return list[i];
    }
    
    public int size()
    {
        return index;
    }
    
    public void remove(int i)
    {
      T[] list1;
      T[] list2;  
      list1 = Arrays.copyOfRange(list,0, i-1);
      list2 = Arrays.copyOfRange(list,0, i+1); 
      T[] temp = (T[]) new Object[list1.length + list2.length];
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
      list = temp;
    }
    
    public void set ( int index, T element)
    {
        list[index] = element;
    }
}
