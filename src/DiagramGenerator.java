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
	        for (CompilationUnit compilationUnit : compilationList){
						if(getParsedString(compilationUnit)!=null)
	            stringyUML += getParsedString(compilationUnit);}
	        System.out.println("YUML String: " + stringyUML);
	    }
	private String getParsedString(CompilationUnit compilationUnit) {
		// TODO Auto-generated method stub
		return null;
	}
	public static ArrayList<CompilationUnit> getCompilationList(String str){
        ArrayList<CompilationUnit> compilationList = new ArrayList<CompilationUnit>();

		return compilationArray;
	}
}
