import java.util.Scanner;

public class Bài1 {
    public static String chuanHoaChuoi(String hoTen) {
        String[] tu = hoTen.split("\\s+");

        StringBuilder hoTenChuanHoa = new StringBuilder();
        for (String t : tu) {
            hoTenChuanHoa.append(Character.toUpperCase(t.charAt(0)));
            hoTenChuanHoa.append(t.substring(1).toLowerCase());
            hoTenChuanHoa.append(" ");
        }

        return hoTenChuanHoa.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên của bạn: ");
        String hoTen = scanner.nextLine();
        String hoTenChuanHoa = chuanHoaChuoi(hoTen);
        System.out.println("Họ tên sau khi chuẩn hóa: " + hoTenChuanHoa);
    }

}