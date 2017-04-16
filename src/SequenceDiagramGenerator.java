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
}
