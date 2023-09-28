public class GhostRooms {
    public int calculatValidRooms(int[][] matrix) {

        int cost = 0;

        for (int column = 0; column < matrix[0].length; column++) {
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][column] == 0) {
                    break;
                } else {
                    cost += matrix[row][column];
                }
            }

        }
        return matrix[0].length;

    }
}
