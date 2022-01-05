package quan_ly_thu_vien;
import java.util.Scanner;
class Sach extends TaiLieu implements Nhapxuat{
    String tenTacGia;
    int soTrang;
    public Sach(){
        super();
        tenTacGia="";
        soTrang=0;
    }
    public Sach(String tenTacGia, int soTrang, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }
    
    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
    @Override public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        maTaiLieu = sc.nextLine();
        System.out.print("Nhập tên nhà phát hành: ");
        tenNhaXuatBan = sc.nextLine();
        System.out.print("Nhập số lượng phát hành: ");
        soBanPhatHanh = sc.nextInt();sc.nextLine();
        System.out.print("Nhập tên tác giả: ");
        tenTacGia = sc.nextLine();
        System.out.print("Nhập số trang: ");
        soTrang = sc.nextInt();sc.nextLine();
    }
    @Override public void xuat(){
                System.out.printf("%-15s | %-15s | %-15S | %-15s | %-15s | %-15s | %-15s | %-15s |\n",
                getMaTaiLieu(),
                getTenNhaXuatBan(),
                getSoBanPhatHanh(),
                getTenTacGia(),
                getSoTrang(),
                " ",
                " ",
                getGiaMuon());
    }
}
