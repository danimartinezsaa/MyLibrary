/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.Iterator;

/**
 *
 * @author dani
 */
public class ArrayList{
    public static <T> void mostar(java.util.ArrayList<T>lista){
        Iterator it=lista.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
