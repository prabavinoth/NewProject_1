package com.pojo.student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Final {
	
	public static void main(String[] args) throws IOException, IOException, IOException {
		ObjectMapper mapp = new ObjectMapper();
		File s1 = new File("C:\\Users\\svinu\\eclipse-workspace\\ApiFirstDay\\src\\test\\resources\\ApijsonFirst\\pojo.json");
		Root r = mapp.readValue(s1, Root.class);
		int page = r.getPage();
		System.out.println(page);
		int page1 = r.getPer_page();
		System.out.println(page1);
		int page2 = r.getTotal();
		System.out.println(page2);
		int page3 = r.getTotal_pages();
		System.out.println(page3);
		System.out.println("data");
		
		ArrayList<Datum> data = r.getData();
		for (Datum datum : data) {
			System.out.println(datum.getId());
			System.out.println(datum.getName());
			System.out.println(datum.getYear());
			System.out.println(datum.getColor());
			System.out.println(datum.getPantone_value());
			
		}
		
		System.out.println("support");
		Support d1 = r.getSupport();
		System.out.println(d1.getUrl());
		System.out.println(d1.getText());
	}
	
	

}
