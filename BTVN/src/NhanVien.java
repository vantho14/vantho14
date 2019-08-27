
public class NhanVien extends CanBo{
	public String congviec;
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}
    public NhanVien(String congviec, String hoten, int namsinh, String gioitinh, String diachi) {
        super(hoten, namsinh, gioitinh, diachi);
        this.congviec = congviec;
    }
	public String getCongviec() {
		return congviec;
	}
	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}
    
}