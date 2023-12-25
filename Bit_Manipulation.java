import java.util.*;

public class Bit_Manipulation{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        odd_even();
        
        System.out.print(count_set_bit(num));
    }

    public static int count_set_bit(int num){
        int count = 0;
        while(num>0){
            int x = num & 1;
            if(x == 1){
                count++;
            }
            
                num = num>>1;
            
        }
        return count;
    }

    public static boolean isPower_of_2(int num){
        return (num & (num-1)) == 0;
    }

    public static int clear_last_ith_bit(int num, int i){
        // for(int a=0; a<i; a++){
        //     num = num & (~(1<<a));
        // }
        // return num;

        int bitMask = (~0) << i;
        return num & bitMask;

    }

    public static int clear_ith_bit_range(int num, int i, int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitMask = a | b;

        return num & bitMask;
    }


    public static int get_ith_bit(int num, int i){

        int bitMask = 1<<i;
        if((num & bitMask) != 0){
            return 1;
        }
        else{
            return 0;
        }
        
    }

    public static int set_ith_bit(int num, int i){
        int bitMask = 1<<i;
        return num | bitMask;
    }

    public static int clear_ith_bit(int num, int i){
        int bitMask = 1<<i;
        return num & (~bitMask);
    }


    public static void odd_even(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if((x & 1) == 0){
            System.out.print("Even");
        }
        else{
            System.out.print("odd");
        }
    }
}