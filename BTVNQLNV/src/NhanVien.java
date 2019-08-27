import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congviec;
	public NhanVien() {
		super();
	}
	public NhanVien(String congviec,String hoten, int namsinh, String gioitinh, String diachi) {
		super(hoten, namsinh, gioitinh, diachi);
		this.congviec=congviec;
	}
	public String getCongviec() {
		return congviec;
	}

	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}
	public void nhap() {
		Scanner cv = new Scanner(System.in);
		System.out.println("Nhap công việc: ");
		this.congviec = cv.nextLine();
	}
	@Override
	public void in() {
		System.out.println(" Cong viec: " + getCongviec());
	}
}
