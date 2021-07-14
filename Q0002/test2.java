package Q0002;

public class test2 {
    public static void main(String[] args){
        int number[] =new int[5];
        int sum=0;

        for(int i=0; i<number.length; i++){
            double num=Math.random()*10;
            number[i]=(int)num;
        }

        for(int i=0; i<number.length; i++){
            sum += number[i]*number[i];
        }

        

        System.out.print("숫자 :");
        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
        System.out.println("합 : "+sum);
        System.out.println("검증수 : "+sum%10);
    }    
}