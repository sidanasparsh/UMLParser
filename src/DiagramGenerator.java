import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import japa.parser.ast.CompilationUnit;

public class DiagramGenerator {
	private static String sourceFile;
	private static String destinationPath;
	ArrayList<CompilationUnit> compilationList;
	private static String stringyUML;
	HashMap<String, Boolean> map;

	DiagramGenerator(String sourceFile, String destinationPath){
		this.sourceFile=sourceFile;
		this.destinationPath=destinationPath;
	}
	  public void parse() {
		  compilationList = getCompilationList(sourceFile);
	        for (CompilationUnit compilationUnit : compilationList){
						if(getParsedString(compilationUnit)!=null)
	            stringyUML += getParsedString(compilationUnit);}
	        makeCompilationMap(compilationList);
	        System.out.println("YUML String: " + stringyUML);
	    }
	private void makeCompilationMap(ArrayList<CompilationUnit> compilationList) {
		map=new HashMap<String, Boolean>();
	}
	private String getParsedString(CompilationUnit compilationUnit) {
		// TODO Auto-generated method stub
		return null;
	}
	public static ArrayList<CompilationUnit> getCompilationList(String str){
        ArrayList<CompilationUnit> compilationList = new ArrayList<CompilationUnit>();

		return compilationList;
	}
}
