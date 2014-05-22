public class findOdd{

    public static void main (String[] args) {
        int [] arr = {22, 33, 22, 22, 33, 33, 33};
        int num = arr[0];
        //System.out.println(Integer.toBinaryString(num));
        for(int i=1; i<arr.length; i++){
            System.out.println((Integer.toBinaryString(num)+ '\n' + Integer.toBinaryString(arr[i])));
            num = num^arr[i];
            System.out.println(Integer.toBinaryString(num)+ '\n');
        }
        System.out.println(num);
    }
}
