import java.util.Scanner;

public class baekJoon2978 {
    private static int N;
    private static int M;
    private static int[] cards;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();
        cards = new int [N];

        for(int i=0; i<N; i++) {
            cards[i] = scanner.nextInt();
        }

        System.out.println(solution(0, 0, 0));

    }
    public static int solution(int sum, int index, int count) {
        if(count == 3) {
            if(sum > M ) return 0;
            else return sum;
        }

        if(index > N) return 0;

        int max = 0;
        for(int i=index; i<N; i++) {
            max = Math.max( max, solution(sum+cards[i], i+1, count+1) );
        }

        return max;
    }
}
