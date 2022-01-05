package quan_ly_thu_vien;
import java.util.Scanner;
class Bao extends TaiLieu implements Nhapxuat{
    String ngayPhatHanh;
    public Bao(){
        super();
        ngayPhatHanh="";
    }
    public Bao(String ngayPhatHanh, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    
    @Override public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã báo: ");
        maTaiLieu = sc.nextLine();
        System.out.print("Nhập tên nhà phát hành: ");
        tenNhaXuatBan = sc.nextLine();
        System.out.print("Nhập số lượng phát hành: ");
        soBanPhatHanh = sc.nextInt();sc.nextLine();
        System.out.print("Nhập ngày phát hành: ");
        ngayPhatHanh = sc.nextLine();
    }
    @Override public void xuat(){
                System.out.printf("%-15s | %-15s | %-15S | %-15s | %-15s | %-15s | %-15s | %-15s |\n",
                getMaTaiLieu(),
                getTenNhaXuatBan(),
                getSoBanPhatHanh(),
                " ",
                " ",
                " ",
                getNgayPhatHanh(),
                getGiaMuon());
    }
}
