package jnext.coll.Set.Hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
//import java.util.Collections;


public class Run{
	public static void main(String[] args) {

  HashSet<Integer> lst =new HashSet<Integer>();	
  lst.add(9);
  lst.add(8);
  lst.add(2);
  lst.add(49);
  lst.add(84);
  lst.add(23);
  lst.add(855);
  lst.add(25);
  lst.add(493);
  lst.add(42);
  lst.add(53);
  lst.add(9);
  lst.add(8);
  lst.add(2);
  lst.add(49);
  lst.add(84);
  lst.add(23);
  lst.add(855);
  lst.add(25);
  lst.add(493);
  lst.add(42);
 ArrayList<Integer> ls=new ArrayList<Integer>();
  ls.addAll(lst);
  Collections.sort(ls);
  for(Integer i:ls){
	 System.out.println(i);
  }

	}
}




