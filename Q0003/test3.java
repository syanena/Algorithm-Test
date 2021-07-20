package Q0003;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            int x = 0, y = 0, d = 0, t = 0;

            int jumpspeed;

            // t초에 d칸만큼 일직선으로 이동

            Double distance;
            double time;

            System.out.println("숫자 x, y, d, t를 입력하세요.");
            System.out.print("숫자 x : ");
            x = scan.nextInt();
            System.out.print("숫자 y : ");
            y = scan.nextInt();
            System.out.print("숫자 d : ");
            d = scan.nextInt();
            System.out.print("숫자 t : ");
            t = scan.nextInt();

            distance = Math.sqrt(x * x + y * y);
            System.out.println("0,0 까지의 거리는 : " + distance);

            // 점프로 이동하는거리가 걸어서 이동하는 거리의 시간만큼 나오지 않는다면 점프할 필요가 없음
            // 1보다 빨라야함
            // 대각선의 길이가 점프로 딱떨어지면 점프만 써도 됨

            // 예제1의 경우 대각선의 길이가 10이므로 3초에 5만큼 점프를 2번 쓰면 6초가 됨
            // 예제2의 경우 대각선의 길이가 5이므로 3초에 6만큼 점프한뒤 뒤로 1만큼 이동
            // 예제3의 경우 대각선의 길이가 546.94515264232975이므로 800초에 1200만큼 점프(2초에 3만큼 점프)을 182초 써서
            // 546만큼 이동한다음 0.94515264232975초만큼 걸으면 됨 총 182.94515264232975초

            // t초에 d칸만큼 일직선으로 이동

            if (distance < d) {
                // 점프 거리가 이동 거리보다 짧음
                time = Math.abs(distance - d) + t;// 좌표계 절대값 반환
                
            } else if (distance == d) {
                // 점프거리가 이동거리랑 같을때
                time = (int) t;
                
            } else {
                // 점프 거리가 이동 거리보다 짧을때 점프 사용 불가
                // 점프하고 뒤로 걷기 or
                // 점프 2번 or
                // 걷기만 할때의
                // time의 최솟값 구하기
                time = Math.min(((distance / d) * t + distance % d), 2 * t);
                // 대각선 길이를 점프길이만큼 나누고 t로 곲하고
                
            }
            time=Math.min(time, distance);
            System.out.println("소요시간 : " + time);
        }

    }

}
