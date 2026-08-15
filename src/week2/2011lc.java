public class 2011lc {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String o : operations) {
            if (o.equals("++X") || o.equals("X++")) {
                X++;
            } else {
                X--;
            }
        }
        return X;
    }
}
s