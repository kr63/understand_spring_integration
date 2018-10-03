package com.oreilly.integration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class FilePrinter {

    public void print(String file) {
        System.out.println("Invoking the pring method with a string");
        System.out.println(file);
    }

	public void print(File file){
		
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader(file));
			
			String line;
			
			while ((line = reader.readLine()) != null){
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				Objects.requireNonNull(reader).close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
