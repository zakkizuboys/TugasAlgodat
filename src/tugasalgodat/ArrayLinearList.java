/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasalgodat;

import java.util.Iterator;

/**
 *
 * @author zakkizuboys
 */
public class ArrayLinearList implements LinearList {
    protected  Object [] element;
    protected int size;
    int i;

    public ArrayLinearList(int initialCapacity) {
        if(initialCapacity <1) throw new IllegalArgumentException("initialCapacity must be >= 1");
        element = new Object[initialCapacity];
    }
    
    public ArrayLinearList(){
        this(10);
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){
        return size;
    }
    
    void checkIndex(int index){
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException("index = " + index + "size = " + size);
    }
    
    public Object get(int index){
        checkIndex(index);
        return element[index];
    }
    
    public int indexOf(Object theElement){
        for (i = 0; i < size; i++)
            if (element[i].equals(theElement)) 
                return i;
        return -1;
    }
        
    public Object remove(int index){
        checkIndex(index);
        Object removeElement = element[index];
        for(i = index + 1; i < size; i++)
            element [i-1] = element[i];
        
        element[--size] = null;
        return removeElement;
    }
    
    public void add(int index, Object theElement){
        if(index < 0 || index > size)throw new IndexOutOfBoundsException("index = " + index + "size = " + size);
        if(size == element.length)
            element = ChangeArrayLength.changeLength1D(element, 2 * size);
        for(i = size - 1; i >= index; i--) 
            element[i+1] = element[i];
        
        element[index] = theElement;
    }
    
    public String toString(){
        StringBuffer s = new StringBuffer("[");
        for(i = 0; i < size; i++)
            if(element[i] == null)
                s.append("null, ");
             else
                s.append(element[i].toString() + ", ");
                        
        if(size > 0)
            s.delete(s.length() - 2, s.length());
        
        s.append("]");
        
        return new String(s);
    }

    public Iterator Iterator() {
        return new ArrayLinearListInterator(this);
    }

}
