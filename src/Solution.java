
public class Solution {
	public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        for(int i = 0; i < n / 2; i++){ 
        	for(int j = i; j < n - 1 - i; j++){ //the rotate only part as 1/4 matrix, other parts rotated at the same cycle; 
        		// find the relationship between the rotate elements and the aimed place
        		int tmp = matrix[i][j];
        		matrix[i][j] = matrix[n - 1 - j][i];
        		matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
        		matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
        		matrix[j][n - 1 - i] = tmp;
        	}
        }
        
        
    }
	

}
