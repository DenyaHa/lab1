import java.util.Scanner;
public class l3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите х: ");
        double x = in.nextDouble();
        if (x>1) {
            System.out.println("Ошибка");
        } else {
            System.out.println("Введите y:");
            double y = in.nextDouble();
            String outString;
            if (IsPointInSquare(x, y)) outString = "YES";
            else outString = "NO";
            System.out.println(outString);
        }
        in.close();
    }

    private static Boolean IsPointInSquare(double x, double y) {
        return (Math.abs(x)<= 1) && (Math.abs(y)<= 1) && ((Math.abs(x)+Math.abs(y))<=1);
    }
}
