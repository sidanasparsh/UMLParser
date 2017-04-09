import java.util.ArrayList;
import java.util.List;

import japa.parser.ast.CompilationUnit;

public class DiagramGenerator {
	private static String sourceFile;
	private static String destinationPath;
	ArrayList<CompilationUnit> compilationArray;

	DiagramGenerator(String sourceFile, String destinationPath){
		this.sourceFile=sourceFile;
		this.destinationPath=destinationPath;
	}
	   public void parse() {
	        compilationArray = getCompilationList(sourceFile);
	    }
	public static ArrayList<CompilationUnit> getCompilationList(String str){
        ArrayList<CompilationUnit> compilationArray = new ArrayList<CompilationUnit>();

		return compilationArray;
	}
}
