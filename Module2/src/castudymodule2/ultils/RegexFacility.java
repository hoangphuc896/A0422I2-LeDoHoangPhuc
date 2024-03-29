package castudymodule2.ultils;

import java.util.Scanner;

public class RegexFacility {
    public static final String FOMAT_IDVILLA = "SVVL-[0-9]{0,4}";
    public static final String FOMAT_IDHOUSE = "SVHO-[0-9]{0,4}";
    public static final String FOMAT_IDROOM = "SVRO-[0-9]{0,4}";
    public static final String FOMAT_REGEXSERVICE = "([A-Z][a-z ]*)+";
    static Scanner scanner = new Scanner(System.in);

    public static String IdVilla() {
        System.out.println("Mời bạn Nhập Mã Phòng :");
        return RegexData.regexStr(scanner.nextLine(), FOMAT_IDVILLA, "Bạn Nhập Sai Định Dạng Mã Phòng Mời Bạn Nhập Lại");
    }

    public static String IdHouse() {
        System.out.println("Mời bạn Nhập Mã Phòng :");
        return RegexData.regexStr(scanner.nextLine(), FOMAT_IDHOUSE, "Bạn Nhập Sai Định Dạng Mã Phòng Mời Bạn Nhập Lại");
    }

    public static String IdRoom() {
        System.out.println("Mời Bạn Nhập Mã Phòng :");
        return RegexData.regexStr(scanner.nextLine(), FOMAT_IDROOM, "Bạn Nhập Sai Định Dạng Mã Phòng Mời Bạn Nhập Lại");
    }

    public static String NameService() {
        System.out.println("Mời Bạn Nhập Tên Dịch Vụ");
        return RegexData.regexStr(scanner.nextLine(), FOMAT_REGEXSERVICE, "Bạn Nhập Sai Tên Dịch vụ Mời Bạn Nhập Lại");
    }

    public static double areaService() {
        double area = 0;
        do {
            try {
                System.out.println("Mời Bạn Nhập Diện tích Diện tích Cần Sử dụng :");
                area = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn Nhập Ko Đúng Mời Bạn Nhập Lại");
            }
        } while (area < 30.0);
        return area;
    }

    public static double areaPool() {
        double area = 0;
        do {
            try {
                System.out.println("Mời Bạn Nhập Diện tích Hồ Bơi Cần Sử dụng :");
                area = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn Nhập Ko Đúng Mời Bạn Nhập Lại");
            }
        } while (area < 30.0);
        return area;
    }

    public static void main(String[] args) {
        System.out.println(areaPool());
    }

    public static int rentalPrice() {
        int rental = 0;
        do {
            try {
                System.out.println("Mời Bạn Nhập Chi Phí phải Trả");
                rental = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn Nhập Sai Mời Bạn Nhập Lại");
            }
        } while (rental < 0);
        return rental;
    }

    public static int rentalPeopleMax() {
        int people = 0;
        do {
            try {
                System.out.println("Mời Bạn Nhập Số Người Thuê :");
                people = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn Nhập Sai Mời Bạn Nhập lại");
            }
        } while (people < 0 || people > 20);
        return people;
    }

    public static int floors() {
        int floor = 0;
        do {
            try {
                System.out.println("Mời Bạn Nhập số tầng cần thuê :");
                floor = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn Nhập Sai Mời Bạn Nhập Lại");
            }
        } while (floor > 0);
        return floor;
    }


    public static String roomStandard() {
        System.out.println("Mời Bạn Nhập Tiêu Chuẩn Phòng :");
        return RegexData.regexStr(scanner.nextLine(), FOMAT_REGEXSERVICE, "Bạn Nhập Sai Tiêu Chuẩn Phòng Mời Bạn Nhập Lại :");
    }

    public static String styleRental() {
        System.out.println("Mời Bạn Nhập Kiểu Thuê :");
        return RegexData.regexStr(scanner.nextLine(), FOMAT_REGEXSERVICE, "Bạn Nhập Sai Kiểu Thuê Mời Bạn Nhập Lại :");
    }

    public static String freeService() {
        System.out.println("Mời Bạn Nhập Dịch Vụ Khuyến Mãi :");
        return RegexData.regexStr(scanner.nextLine(), FOMAT_REGEXSERVICE, "Bạn Nhập Sai Dịch Vụ Khuyên mãi Mời Bạn Nhập Lại :");
    }
}