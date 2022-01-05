package quan_ly_thu_vien;
import java.util.Scanner;
class TapChi extends TaiLieu implements Nhapxuat{
    String soPhatHanh;
    public TapChi(){
        super();
        soPhatHanh="";
    }
    public TapChi(String soPhatHanh, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }
    
    @Override public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã tạp chí: ");
        maTaiLieu = sc.nextLine();
        System.out.print("Nhập tên nhà phát hành: ");
        tenNhaXuatBan = sc.nextLine();
        System.out.print("Nhập số lượng phát hành: ");
        soBanPhatHanh = sc.nextInt();sc.nextLine();
        System.out.print("Nhập số phát hành: ");
        soPhatHanh = sc.nextLine();
    }
    @Override public void xuat(){
                System.out.printf("%-15s | %-15s | %-15S | %-15s | %-15s | %-15s | %-15s | %-15s |\n",
                getMaTaiLieu(),
                getTenNhaXuatBan(),
                getSoBanPhatHanh(),
                " ",
                " ",
                getSoPhatHanh(),
                " ",
                getGiaMuon());
    }
}
