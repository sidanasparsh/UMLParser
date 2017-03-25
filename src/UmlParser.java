package com.project.umlparser;
/**
 * @author ssjsparsh
 *Main class file taking the input parameters and calling the required functions.
 */
public class UmlParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2){
			System.out.println("Error: Please enter input file and output file paths!");
			System.exit(0);
		}
		String inputFilePath=args[1];
		String ouputFilePath=args[2];
		if(inputFilePath==" " || ouputFilePath==" "){
			System.out.println("Invalid input/output file path");
			System.exit(0);
		}
	}
}