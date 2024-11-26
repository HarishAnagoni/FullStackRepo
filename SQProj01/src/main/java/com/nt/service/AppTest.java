package com.nt.service;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppTest {

	private static Logger logger=Logger.getLogger("com.nt.AppTest");
	int sum(int x,int y) {
		logger.info("AppTest.sum()");
		return x+y;
	}
	int processList() {
		logger.info("AppTest.processList()");
		
		ArrayList<Integer> list=null;
		list=new ArrayList<>();
		list.add(10);list.add(20);
		list.add(30);
		return list.size();
		
	}
	public static void main(String[] args) {
		//logging messages
		logger.info("AppTest.main() start");
		AppTest test=new AppTest();
		logger.log(Level.INFO,"Sum result {0}",test.sum(10,20));

		logger.log(Level.INFO,"List size {0}",test.processList());
		logger.info("AppTest.main() end");
	}

}
