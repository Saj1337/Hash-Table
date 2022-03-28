package week9Task2;

import java.util.*;
import java.util.Map;

class Journal{
 int identity;
 String title, author, publisher,DOI;
 int quantity;
 public Journal (
         int identity,
         String title, 
         String author, 
         String publisher,
         String DOI,
         int quantity){
    this.identity = identity;
    this.title = title;
    this.author=author;
    this.publisher = publisher;
    this.DOI = DOI;
    this.quantity= quantity;
 }          
	}
 public class journalpaper {
public static void main(String[] args) {
Map<Integer, Journal> map=new Hashtable<Integer,Journal>();
 
Journal j1=new Journal(10001,"How to Write a Paper in Scientific Journal" +"Lewiston, ME" +"","", "","",10);
Journal j2=new Journal(10002,"2","7", "12","", 100);
Journal j3=new Journal(10003,"3","8", "13","", 150);
Journal j4=new Journal(10004,"4","9", "15","", 80);
Journal j5=new Journal(10005,"5","10","" ,"", 50);
 
 
map.put(1,j1);
map.put(2,j2);
map.put(3,j3);
map.put(4,j4);
map.put(5,j5);
 
        for (Map.Entry <Integer, Journal> entry:map.entrySet()) {
            int key=entry.getKey();
            Journal J;
            J= entry.getValue();
            System.out.println(key+"Details:");
            System.out.println(J.identity+" "+J.title+ "" + J.author + ""+J.publisher+ ""+ J.DOI+" "  +J.quantity+" ");
        }
 
    }
 
}