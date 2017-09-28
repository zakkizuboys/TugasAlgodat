/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasalgodat;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author zakkizuboys
 */
public class ArrayLinearListInterator implements Iterator{
    private ArrayLinearList list;
    private int nextIndex;

    public ArrayLinearListInterator(ArrayLinearList thelist) {
        list = thelist;
        nextIndex = 0;
    }
    
    public boolean hasNext(){
        return nextIndex < list.size;
    }
    
    public Object next(){
        if(nextIndex < list.size)
            return list.element[nextIndex++];
        else 
            throw new NoSuchElementException("no elemnt");
    }
    
    public void remove(){
        throw new UnsupportedOperationException("remove");
    }
    
}
