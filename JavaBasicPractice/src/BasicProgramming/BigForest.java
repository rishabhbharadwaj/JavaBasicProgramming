package BasicProgramming;

public class BigForest {
	
	public static void main(String[] args) {
		String[][] arr = {{"T","T","T","W","W"},{"T","W","W","T","T"},{"T","W","W","T","T"},{"T","W","T","T","T"},{"W","W","T","T","T"}};
		int max = 0;
		int count = 0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(arr[i][j].equals("T")){
					count=countForest(arr,i,j);
					arr[i][j]="W";
				}
				if(max<count) {
					max=count;
				}
			}
		}
		System.out.println(max);
	}
	
	public static int countForest(String[][] arr,int row,int col){
		int count=0;
		if(row<0 || col<0 || row>=arr.length || col>=arr.length) {
			return 0;
		}
		if(arr[row][col].equals("W")){
			return 0;
		}
		arr[row][col]="W";
		count=1+countForest(arr,row+1,col)+countForest(arr,row-1,col)+countForest(arr,row,col+1)+countForest(arr,row,col-1);
		return count;
	}

}
