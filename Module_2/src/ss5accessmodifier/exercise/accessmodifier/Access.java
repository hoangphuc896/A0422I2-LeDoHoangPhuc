package ss5accessmodifier.exercise.accessmodifier;

import java.util.Scanner;

public class Access {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();
        ClassAccess area = new ClassAccess(radius);
        area.getRadius();
        area.getArea();
        System.out.println("radius="+area.getRadius()+"area=" +area.getArea());
    }
}
