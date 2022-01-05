package quan_ly_thu_vien;
import java.util.Scanner;

public class QuanLy {
    int n;
    TaiLieu[] tailieu;
    Scanner sc = new Scanner(System.in);
    public void them(){
        System.out.print("Nhập số lượng tài liệu: ");
        n=sc.nextInt();
        tailieu = new TaiLieu[n];
        for(int i=0;i<n;i++){
        System.out.println("Nhập 1 để thêm sách");
        System.out.println("Nhập 2 để thêm tạp chí");
        System.out.println("Nhập 3 để thêm báo");
        System.out.print("Mời nhập: ");
        int x=sc.nextInt();sc.nextLine();
        System.out.println();
        switch(x){
            case 1:
                tailieu[i]=new Sach();
                tailieu[i].nhap();
                break;
            case 2:
                tailieu[i]=new TapChi();
                tailieu[i].nhap();
                break;
            case 3:
                tailieu[i]=new Bao();
                tailieu[i].nhap();
                break;
        }
        System.out.println();
    }
}
    public void xuatdanhsach(){
        System.out.println("Danh sách thư viện: ");
        System.out.printf("%-15s | %-15s | %-15s | %-15s| %-15s | %-15s | %-15s | %-15s |\n\n",
                "Mã tài liệu",
                "Nhà xuất bản",
                "Số lượng phát hành",
                "Tên tác giả",
                "Số trang",
                "Số phát hành",
                "Ngày phát hành",
                "Giá mượn tài liệu");
               
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        for(int i=0;i<n;i++){
            tailieu[i].xuat();
        }
    }
    public void sua(){
        System.out.print("Nhập mã tài liệu cần sửa: ");
        String str=sc.nextLine();
        for(int i=0;i<n;i++){
            if(str.compareTo(tailieu[i].getMaTaiLieu())==0){
                tailieu[i].nhap();
                System.out.println("Sửa thành công");
                return;
            }
        }System.out.println("Không tìm thấy tài liệu cần sửa");
    }
    public void tim(){
        System.out.print("Nhập mã tài liệu cần tìm: ");
        String str=sc.nextLine();
        for(int i=0;i<n;i++){
            if(str.compareTo(tailieu[i].getMaTaiLieu())==0){
                tailieu[i].xuat();
                return;
            }
        }System.out.println("Không tìm thấy tài liệu cần tìm");
    }
}

