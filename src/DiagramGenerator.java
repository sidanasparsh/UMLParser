import java.util.ArrayList;
import java.util.List;

import japa.parser.ast.CompilationUnit;

public class DiagramGenerator {
	private static String sourceFile;
	private static String destinationPath;
	ArrayList<CompilationUnit> compilationList;
	private static String stringyUML;

	DiagramGenerator(String sourceFile, String destinationPath){
		this.sourceFile=sourceFile;
		this.destinationPath=destinationPath;
	}
	  public void parse() {
		  compilationList = getCompilationList(sourceFile);
	        for (CompilationUnit compilationUnit : compilationList)
	            stringyUML += getParsedString(compilationUnit);
	        System.out.println("YUML String: " + stringyUML);
	    }
	private String getParsedString(CompilationUnit cu) {
		// TODO Auto-generated method stub
		return null;
	}
	public static ArrayList<CompilationUnit> getCompilationList(String str){
        ArrayList<CompilationUnit> compilationArray = new ArrayList<CompilationUnit>();

		return compilationArray;
	}
}
