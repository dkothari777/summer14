/** The purpose of this class is to see how literals work in the java environment and
 * utilize it different capabilities to improve coding skils.
 *
 * **/
public class Literals {

    public static void main(String[] args){
        System.out.println(0xFFFF);
        System.out.println(0_345_345);
        System.out.println(0B1111_1111_1101);
        int[][] arr = new int[4][4];
        for(int i = 0; i<arr.length; i++)
            for(int j = 0; j<arr[i].length; j++)
                arr[i][j]= (i!=0 ? arr[i-1][arr[i].length-1] +j : j) + (i>1 ? 1:i);
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j]+(j%arr[i].length==arr[i].length-1 ? "\n" : " "));
        String hello = "Hello", lo = "lo";
        System.out.println(hello == ("Hel" + lo).intern()+ " ");
//        System.out.println((Other.hello == hello) + " ");
  //      System.out.println((other.Other.hello == hello) + " ");
    }

    private static void decimals(){


    }

    private static void hexadecimals(){


    }

    private static void octals(){

    }

    private static void binary(){

    }

    private static void booleans(){

    }

    private static void strings(){

    }
}
