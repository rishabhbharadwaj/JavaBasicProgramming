package BasicProgramming;

import java.util.*;

public class ArrayCirculation {
	
	public static void main(String[] args) {
		
		String input = "\"abcde#fghij#klmno#pqrst#uvwxy\"";
		System.out.println(input);
		System.out.println();
		int rotation = 2;
		//Scanner scanner = new Scanner(System.in);
		//String[] inputArray = scanner.nextLine().replace("\"", "").split("#");
		
		String[] inputArray = input.replace("\"", "").split("#");
		int rows = inputArray.length;
		
		String [][] inputMatrix = new String[inputArray.length][]; 
		for(int i=0; i<inputArray.length; i++) { 
			inputMatrix[i] = inputArray[i].split(""); 
		}
		System.out.println("** Origional Matrix **");
		printMatrix(inputMatrix);
		System.out.println();
		int columns = inputMatrix[0].length;
		
		spiralRotate(inputMatrix, rows, columns, rotation); 
		
		//printMatrix(inputMatrix);
		
		//scanner.close();
		
		String [] joinedArray = new String[inputMatrix.length];
		for(int i=0; i<inputMatrix.length; i++) {
			joinedArray[i] = String.join("", inputMatrix[i]);
		}
		String result = String.join("", joinedArray);
		System.out.println();
		System.out.println("** Joined Result **");
		System.out.println(result);
		
		/*
		List<List<Integer>> matrix = new ArrayList<List<Integer>>();
		matrix.add(new ArrayList<Integer>() {{add(1);add(2);add(3);add(4);add(5);}});
		matrix.add(new ArrayList<Integer>() {{add(6);add(7);add(8);add(9);add(10);}});
		matrix.add(new ArrayList<Integer>() {{add(11);add(12);add(13);add(14);add(15);}});
		matrix.add(new ArrayList<Integer>() {{add(16);add(17);add(18);add(19);add(20);}});
		matrix.add(new ArrayList<Integer>() {{add(21);add(22);add(23);add(24);add(25);}});
		
		rotationArrayList(matrix,2);
		*/
	}
	
	public static void spiralRotate(String[][] inputMatrix, int row, int column, int rotation) {
		int currentStartRow = 0, currentStartColumn = 0;
		int currentMaxRow = row-1, currentMaxColumn = column-1;
		List<List<String>> rotationString = new ArrayList<List<String>>();
		while(currentStartRow <= currentMaxRow && currentStartColumn <= currentMaxColumn) {
			List<String> currentLine = new ArrayList<String>();
			for(int i=currentStartRow; i<currentMaxRow; i++ ) {
				currentLine.add(inputMatrix[i][currentStartColumn]);
			}
			for(int i=currentStartColumn; i<currentMaxColumn; i++) {
				currentLine.add(inputMatrix[currentMaxRow][i]);
			}
			for(int i=currentMaxRow; i> currentStartRow; i--) {
				currentLine.add(inputMatrix[i][currentMaxColumn]);
			}
			for(int i=currentMaxColumn; i> currentStartColumn; i--) {
				currentLine.add(inputMatrix[currentStartRow][i]);
			}
			currentStartRow++;
			currentStartColumn++;
			currentMaxRow--;
			currentMaxColumn--;	
			if(!currentLine.isEmpty()) {
				rotationString.add(currentLine);
			}
		}

		currentStartRow = 0; currentStartColumn = 0;
		currentMaxRow = row-1; currentMaxColumn = column-1;
		for(int i = 0 ; i < rotationString.size() ; i++) {
            ArrayList<String> currentLine = (ArrayList<String>)rotationString.get(i);
            int curIndex = -1;
            if(i%2 != 0) {
            	// clockwise
            	curIndex = rotation % currentLine.size();
            }else {
            	// anticlockwise
            	curIndex = currentLine.size() - rotation % currentLine.size();
            }
            
            for(int j = currentStartRow ; j < currentMaxRow ; j++) {
                inputMatrix[j][currentStartColumn] = currentLine.get(curIndex % currentLine.size()).toString();
                curIndex++;
            }
            for(int j = currentStartColumn ; j < currentMaxColumn ; j++) {
                inputMatrix[currentMaxRow][j] = currentLine.get(curIndex % currentLine.size()).toString();
                curIndex++;
            }
            for(int j = currentMaxRow ; j > currentStartRow ; j--) {
                inputMatrix[j][currentMaxColumn] = currentLine.get(curIndex % currentLine.size()).toString();
                curIndex++;
            }
            for(int j = currentMaxColumn; j > currentStartColumn ; j--) {
                inputMatrix[currentStartRow][j] = currentLine.get(curIndex % currentLine.size()).toString();
                curIndex++;
            }
            
            currentMaxRow--;
            currentMaxColumn--;
            currentStartRow++;
            currentStartColumn++;
        }
		System.out.println("** Rotated Matrix **");
		printMatrix(inputMatrix);
	}
	
	public static void rotationArrayList(List<List<Integer>> matrix, int r) {
		int currentStartRow = 0, currentStartCol = 0;
        int currentMaxRow = matrix.size()-1, currentMaxCol = matrix.get(0).size()-1;

        // To store the list of layers
        List<List<Integer>> rotationList = new ArrayList<List<Integer>>();

        // iterate over matrix to get the layers
        while(currentStartRow <= currentMaxRow && currentStartCol <= currentMaxCol){
            // To store the layer
            List<Integer> layer = new ArrayList<Integer>();
            // First column top to bottom
            for(int i=currentStartRow; i<currentMaxRow; i++){
                layer.add(matrix.get(i).get(currentStartCol));
            }
            // Last Row left to right
            for(int i=currentStartCol; i<currentMaxCol; i++) {
                layer.add(matrix.get(currentMaxRow).get(i));
            }
            // Last column bottom to top
            for(int i=currentMaxRow; i>currentStartRow; i-- ){
                layer.add(matrix.get(i).get(currentMaxCol));
            }
            // First row right to left
            for(int i=currentMaxCol; i>currentStartCol; i-- ){
                layer.add(matrix.get(currentStartRow).get(i));
            }
            if(!layer.isEmpty())
                rotationList.add(layer);
            currentStartRow++;
            currentStartCol++;
            currentMaxRow--;
            currentMaxCol--;
        }
        currentStartRow = 0; currentStartCol = 0;
        currentMaxRow = matrix.size()-1; currentMaxCol = matrix.get(0).size()-1;

        // iterate over layers 
        for(int i=0; i<rotationList.size(); i++){
            int layerSize = rotationList.get(i).size();// 16
            // identifying the current index to start
            int currentIdx = layerSize - r % layerSize;
            // First column top to bottom
            for(int j=currentStartRow; j<currentMaxRow; j++){
            	matrix.get(j).set(currentStartCol, rotationList.get(i).get(currentIdx % layerSize));
                currentIdx++;
            }
            // Last Row left to right
            for(int j=currentStartCol; j<currentMaxCol; j++) {
            	matrix.get(currentMaxRow).set(j, rotationList.get(i).get(currentIdx % layerSize));
                currentIdx++;
            }
            // Last column bottom to top
            for(int j=currentMaxRow; j>currentStartRow; j-- ){
            	matrix.get(j).set(currentMaxCol, rotationList.get(i).get(currentIdx % layerSize));
                currentIdx++;
            }
            // First row right to left
            for(int j=currentMaxCol; j>currentStartCol; j-- ){
            	matrix.get(currentStartRow).set(j, rotationList.get(i).get(currentIdx % layerSize));
            	currentIdx++;
            }
            currentStartRow++;
            currentStartCol++;
            currentMaxRow--;
            currentMaxCol--;
        }
        System.out.println(matrix);
	}
	
	public static void printMatrix(String [][] matrix) {
		for(int i=0; i< matrix.length; i++) {
			for(int j=0 ; j< matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}