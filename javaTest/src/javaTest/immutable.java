package javaTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class immutable {

	public static void main(String[] args) {

	    final ArrayList<String> list;

	List<String > al= new ArrayList<String>();

        list = (ArrayList<String>) Collections.unmodifiableList(al);
    
}
}
