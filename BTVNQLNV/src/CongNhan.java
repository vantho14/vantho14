import java.util.Scanner;

public class CongNhan extends CanBo {
	private String bac;
	public CongNhan() {
		super();
	}
	public CongNhan(String bac, String hoten, int namsinh, String gioitinh, String diachi) {
		super(hoten, namsinh, gioitinh, diachi);
		this.bac=bac;
	}
	public String getBac() {
		return bac;
	}

	public void setBac(String bac) {
		this.bac = bac;
	}
	public void nhap() {
		Scanner bac = new Scanner(System.in);
		System.out.println("Nhap cap bac: ");
		this.bac = bac.nextLine();
	}
	@Override
	public void in() {
		System.out.println(" Bac: " + getBac());
	}

}
