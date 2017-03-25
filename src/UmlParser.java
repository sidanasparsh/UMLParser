public class UmlParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2){
			System.out.println("Error: Please enter input file and output file paths!");
			System.exit(0);
		}
		String inputFilePath=args[1];
		String ouputFilePath=args[2];
		if(inputFilePath==" "){
			System.out.println("Invalid input path");
			System.exit(0);
		}
		if(ouputFilePath==" "){
			System.out.println("Invalid output path");
			System.exit(0);
		}
	}
}
