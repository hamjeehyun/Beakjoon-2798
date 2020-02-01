import java.util.Scanner;

public class baeakJoon2798 {
    static int N;
    static int M;
    static int[] cards;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        for(int i=0; i<N; i++) {
            cards[i] = scanner.nextInt();
        }

        System.out.println(solution(0, 0, 0));

    }

    public static int solution(int sum, int index, int count) {
        int max = 0;
        if(count == 3) {
            if(max > sum ) return 0;
            else return max;
        }

        if(index > N) return 0;

        for(int i=index; i<N; i++) {
            max = Math.max( max, solution(sum+cards[i], i+1, count+1) );
        }

        return max;
    }
}
