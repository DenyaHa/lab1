import java.util.Scanner;
public class l1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите х1: ");
        double x1 = in.nextDouble();
        System.out.println("Введите y1:");
        double y1 = in.nextDouble();
        System.out.println("Введите x2:");
        double x2 = in.nextDouble();
        System.out.println("Введите y2:");
        double y2 = in.nextDouble();
        String pointOne = "(" + x1 + ";" + y1 + ")";
        String pointTwo = "(" + x2 + ";" + y2 + ")";
        String distance = distance(x1, y1, x2, y2);
        System.out.println("Расстояние между точками: " + pointOne + " и" + pointTwo + "равно " + distance);
        in.close();
    }

    private static String distance(double x1, double y1, double x2, double y2) {
        Double distance = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
        return distance.toString();
    }
}
