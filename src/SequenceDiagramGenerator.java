import java.util.ArrayList;
import java.util.HashMap;

import japa.parser.ast.CompilationUnit;

public class SequenceDiagramGenerator {
	private static String sourceFile;
	private static String destinationPath;
	private static ArrayList<CompilationUnit> compilationList;
	private static String stringyUML;
	private static HashMap<String, Boolean> map;
	SequenceDiagramGenerator(String sourceFile, String destinationPath){
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
					displayCompilationMap();
	    }
	private void makeCompilationMap(ArrayList<CompilationUnit> compilationList) {
		map=new HashMap<String, Boolean>();
	}
	public static ArrayList<CompilationUnit> getCompilationList(String str){
		compilationList = new ArrayList<CompilationUnit>();
		return compilationList;
	}
	private String getParsedString(CompilationUnit compilationUnit) {
		return null;
	}
	public void displayCompilationMap(){
		for(String key:map.keySet())
			System.out.println(key+ "-"+map.get(key));
	}
}
