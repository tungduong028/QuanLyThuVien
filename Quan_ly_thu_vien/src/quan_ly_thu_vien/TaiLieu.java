package quan_ly_thu_vien;
public abstract class TaiLieu implements Nhapxuat{
    String maTaiLieu, tenNhaXuatBan;
    int soBanPhatHanh;
    static String giaMuon = "3000vnđ/1 ngày";
    public TaiLieu(){
        maTaiLieu="";
        tenNhaXuatBan="";
        soBanPhatHanh=0;
    }
    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }
    
    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public static String getGiaMuon() {
        return giaMuon;
    }

    public static void setGiaMuon(String giaMuon) {
        TaiLieu.giaMuon = giaMuon;
    }
    
    @Override
    public abstract void nhap();
    @Override
    public abstract void xuat();
}
