/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author dani
 */
public class Array{
    
    public static void revertir(float array[]){
        float aux;
        int i,u;  
        for(i=0,u=array.length;i<array.length && u>0;i++,u--){
            aux=array[i];
            array[i]=array[u];
            array[u]=aux;
        }
    }
    
    public static void ordenar(float array[]){
        int i, j;
        float aux;
        for(i=0;i<array.length-1;i++){
            for(j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
    }
    
}
