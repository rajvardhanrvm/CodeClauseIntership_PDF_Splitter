package com.pdfbox.pdfbox;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class MainClass {
	public static void main( String[] args)throws IOException {
		File sourcefile= new File("H:\\rvm\\OS.pdf");
		PDDocument doc= PDDocument.load(sourcefile);
		
		Splitter sp= new Splitter();
		List<PDDocument> spPages =sp.split(doc);
		
		int j=1;
		for(PDDocument i: spPages)
		{
			i.save("H:\\rvm\\OSsplit_@"+j+".pdf");
			j++;
			i.close();
		}
		
		System.out.println("split done");
	}
}
