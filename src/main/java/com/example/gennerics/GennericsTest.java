package com.example.gennerics;

public class GennericsTest {
public void runGennericTest() {
	//this should be type not primitive datatype char, int dont work
	Integer[] intarray={1,2,3};
	Character[] chararray={'a','b','c'};
	this.gennericPrinter(intarray);
	this.gennericPrinter(chararray);
}
public <T> void gennericPrinter(T[] myArrays) {
	for(T myvalue:myArrays) {
		System.out.println(myvalue);
	}
	System.out.println("------------done-----------");
}
}
