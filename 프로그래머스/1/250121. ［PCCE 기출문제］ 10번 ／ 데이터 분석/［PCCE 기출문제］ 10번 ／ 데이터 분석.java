import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int filterIndex = getIndex(ext);
        int sortIndex = getIndex(sort_by);

        List<int[]> selected = new ArrayList<>();

        for (int[] row : data) {
            if (row[filterIndex] < val_ext) {
                selected.add(row);
            }
        }

        selected.sort(Comparator.comparingInt(row -> row[sortIndex]));

        return selected.toArray(new int[selected.size()][]);
    }

    private int getIndex(String column) {
        switch (column) {
            case "code": return 0;
            case "date": return 1;
            case "maximum": return 2;
            case "remain": return 3;
            default: throw new IllegalArgumentException(column);
        }
    }
}