/** The purpose of this class is to see how literals
 * **/
public class IntHexOct {

    public static void main(String[] args){
        System.out.println(0xFFFF);
        System.out.println(0_345_345);
        System.out.println(0B1111_1111_1101);
        int[4][4] arr = new int[4][4];
        for(int i = 0; i<arr.length; i++)
            for(int j = 0; j<arr[i].length; j++)
                arr[i][j]= i+j;
    }
}
