package Q0004;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int house, router;
        //int housepoint[]=new int[];
        Scanner sc=new Scanner(System.in);
        

        System.out.print("집의 갯수(2~200000) : ");
        house=sc.nextInt();
        while(!(2<=house && house<=200000)){
            System.out.print("집의 갯수는 2~200000 중으로 선택 : ");
            house=sc.nextInt();
        }
        System.out.println("집의 갯수 : "+house);
        int housepoint[]=new int[house];

        System.out.print("공유기의 갯수(2~N) : ");
        router=sc.nextInt();
        while(!(2<=router && router<=house)){
            System.out.println("공유기의 갯수는 집의 갯수를 넘을수 없습니다.");
            System.out.print("공유기의 갯수(2~"+house+")안에서 선택 : ");
            router=sc.nextInt();
        }
        System.out.println("공유기의 갯수:"+router);
        

        System.out.print("집의 X 좌표 위치 입력(집의 갯수 :"+house+") : ");
        for(int i=0; i<housepoint.length; i++){
            housepoint[i]=sc.nextInt();
        }

        Arrays.sort(housepoint);//정렬
        //System.out.println();
        //1,4,9에 설치 하면 가장 인접한 공유기의 사이의 거리는 3이 최대
        //1~end값의 집 위치로 부터 이분 탐색으로 mid값을 구해나가며 mid값 이상의 카운트가 공유기 개수 이상인지 확인
        //시작점(집의 첫 포인트)에는 무조건 설치한다는 전제를 깔아야함

        int start=1;//공유기간 최소 거리
        int end=housepoint[house-1]-1;//공유기 간 최대 거리
        int test=0;

        System.out.println(start+" / "+end);
        
        while(start <= end){
            int mid=(start+end)/2;//공유기 거리 기준
            int first = housepoint[0];//첫 공유기 위치는 첫번째 집
            int routercount=1;//공유기 설치 횟수

            for(int i=0; i<housepoint.length; i++){
                int distance=housepoint[i]-first;//거리 차이

                if(distance >= mid){//거리차이가 기준보다 크거나 같아야 설치 가능
                    routercount++;
                    first=housepoint[i];
                }
            }

            //공유기의 설치가 공유기의 개수보다 많으면 간격을 넓혀서 개수를 줄임.
            if(routercount >= router){
                start=mid+1;
                test=mid;
            }else{
                end=mid-1;
            }
        }
        System.out.println("가장 인접한 공유기 간의 최대 거리는 : "+test);
    }
}
