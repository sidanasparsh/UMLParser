import com.project.umlparser.DiagramGenerator;

/**
 * @author ssjsparsh
 *Main class file taking the input parameters and calling the required functions.
 */
public class UmlParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		if(args.length!=2){
			if(args.length>2){
			System.out.println("Error: You have more than the required input parameter!");
			System.exit(0);}

		}
		String inputFilePath=args[1];
		String ouputFilePath=args[2];
		if(inputFilePath==" " || ouputFilePath==" "){
			System.out.println("Invalid input/output file path");
			System.exit(0);
		}
		DiagramGenerator diagramGenerator=new DiagramGenerator(args[1], args[2]);
		SequenceDiagramGenerator sequencDiagramGenerator=new SequenceDiagramGenerator(args[1], args[2]);

		String diagramType=args[0];
		if(diagramType.toLowerCase().equals("class"))
			 diagramGenerator=new DiagramGenerator(inputFilePath, ouputFilePath);
		else if(diagramType.toLowerCase().equals("sequence"))
			sequencDiagramGenerator= new SequenceDiagramGenerator(inputFilePath, ouputFilePath);
		else{
			System.out.println("Invalid diagram type");
			System.exit(-1);
		}
	}
}
