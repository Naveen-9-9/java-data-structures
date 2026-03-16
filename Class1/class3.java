public class class3 {
    public static void main(String[] args) {
        Object [] arr = new Object[] { 4,4.3,"hello",'a'};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Object[][] arr2 = new Object[][]{
            {1,2,3,3},{"hello2",'b'}
        };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
