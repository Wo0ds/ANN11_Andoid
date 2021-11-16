import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThreadMinMax {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            try {
                nums[i] = Integer.parseInt(reader.readLine());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        Thread1 thread1 = new Thread1(nums);
        thread1.start();

        try {
            thread1.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread2 thread2 = new Thread2(nums);
        thread2.start();
    }
}


class Thread1 extends Thread {
    int[] nums;

    public void run() {
        Arrays.sort(nums);
        System.out.println("Максимальное значение: " + nums[4]);
    }

    public Thread1(int[] nums) {
        this.nums = nums;
    }
}

class Thread2 extends Thread1 {

    public Thread2(int[] nums) {
        super(nums);
    }

    public void run() {
        Arrays.sort(nums);
        System.out.println("Минимальное значение: " + nums[0]);
    }
}
