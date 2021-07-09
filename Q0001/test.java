package Q0001;

public class test {
    public static void main(String[] args) {
        int count[]=new int[10];
        

        for(int i=1; i<1001; i++){
            count[i%10]++; // 1의 자리 카운트
            if(i>=10)
                count[i/10%10]++;
                //10의 자리의 숫자 카운트
            if(i>=100)
                count[i/100%10]++;
                //100의 자리의 숫자 카운트
            if(i>=1000)
                count[i/1000%10]++;
                //1000의 자리의 숫자 카운트
        }

        for(int i=0; i<count.length; i++){
            System.out.println(i+"의 갯수"+count[i]);
        }
    }
}
