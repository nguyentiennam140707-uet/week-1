import java.util.Scanner;
public class pj3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int canh = scanner.nextInt();
        System.out.printf("thetich: %.0f", Math.pow(canh, 3)); //kết nối thì dùng '+', truyền vào thì dùng ','
        scanner.close();
    }
}
