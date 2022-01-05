package quan_ly_thu_vien;
import java.util.Scanner;
public class Quan_ly_thu_vien {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        do{
        System.out.println();
        System.out.println("-----------Quản lí thư viện-----------");
        System.out.println("--------Nhập 1 để thêm tài liệu-------");
        System.out.println("--------Nhập 2 để xem danh sách-------");
        System.out.println("--------Nhập 3 để sửa-----------------");
        System.out.println("--------Nhập 4 để tìm kiếm tài liệu---");
        System.out.println("--------Nhập 5 để thoát---------------");
        System.out.print("Mời nhập: ");
        int a=sc.nextInt();
        System.out.println();
        switch(a){
            case 1:
                ql.them();
                break;
            case 2:
                ql.xuatdanhsach();
                break;
            case 3:
                ql.sua();
                break;
            case 4:
                ql.tim();
                break;
            case 5:
                System.exit(0);
                break;
            }
        }
        while(true);
    }
}
