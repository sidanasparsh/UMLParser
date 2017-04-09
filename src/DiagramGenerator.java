
import java.util.ArrayList;
import java.util.List;

import japa.parser.ast.CompilationUnit;

public class DiagramGenerator {
	private static String sourceFile;
	private static String destinationPath;
	ArrayList<CompilationUnit> compilationArray;
	private static String stringyUML;

	DiagramGenerator(String sourceFile, String destinationPath){
		this.sourceFile=sourceFile;
		this.destinationPath=destinationPath;
	}
	  public void parse() {
	        compilationArray = getCompilationList(sourceFile);
	        for (CompilationUnit cu : compilationArray)
	            stringyUML += getParsedString(cu);

	    }
	private String getParsedString(CompilationUnit compilationUnit) {
		// TODO Auto-generated method stub
		return null;
	}

	public static ArrayList<CompilationUnit> getCompilationList(String str){
        ArrayList<CompilationUnit> compilationArray = new ArrayList<CompilationUnit>();

		return compilationArray;
	}
}
