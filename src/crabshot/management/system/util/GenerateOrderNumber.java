/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crabshot.management.system.util;

import crabshot.management.system.DBA.DBManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Vijay
 */
public class GenerateOrderNumber {
    List<Integer> ints = new ArrayList<>();
    int i = 0;

    GenerateOrderNumber() {
         for (int i = 0; i < 10000; i++) {
            ints.add(i);
        }
        Collections.shuffle(ints);
    }
    static int count=0;
    void generate(){
       for(Integer ls:ints){
          // DBManager.StoreOrderNumber(ls);
       }
    }
    
    int nextInt() {
        return ints.get(i++);
    }
    public static void main (String arg[]){
        GenerateOrderNumber gn=new GenerateOrderNumber();
        int num=gn.nextInt();
        System.out.println(num);
        System.out.println("Counter is : "+count);
    }
}
