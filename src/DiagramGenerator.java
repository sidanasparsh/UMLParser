import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import japa.parser.ast.CompilationUnit;

public class DiagramGenerator {
	private static String sourceFile;
	private static String destinationPath;
	private static ArrayList<CompilationUnit> compilationList;
	private static String stringyUML;
	private static HashMap<String, Boolean> map;

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
		return null;
	}
	public static ArrayList<CompilationUnit> getCompilationList(String str){
		compilationList = new ArrayList<CompilationUnit>();
		return compilationList;
	}
	private String generateScopeRepresnetations(String variableScope) {
        if(variableScope.equals("public"))
        	return "+";
        else if(variableScope.equals("private"))
        	return "-";
        else if(variableScope.equals("package") || variableScope.equals(""))
        	return "#";
        return null;
    }
	public void displayCreatedMap(){
		for(String key:map.keySet())
			System.out.println(key+ "-"+map.get(key));
	}
}
