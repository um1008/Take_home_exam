package random_num;
import java.util.Random;
public class random_num {
	public static void main(String[] args) {
		Random r = new Random();
		int[] numbers = new int[10];
		for(int i = 0; i < 10; i++) {
		   int random_num = r.nextInt(500);
		   numbers[i] = random_num;
		   System.out.print("\n" + random_num);
		}
		int sum = 0;
		for(int i : numbers) {
			sum += i;      
		}
		System.out.println("\nSum = " + sum);
	}
}