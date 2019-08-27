import java.util.Scanner;

public class CanBo {
	private String Hoten;
	private int namsinh;
	private String gioitinh,diachi;
	public CanBo() {
		super();
		
	}
	public CanBo(String Hoten,int namsinh,String gioitinh, String diachi) {
		super();
		this.Hoten = Hoten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
	}
	public String getHoten() {
		return Hoten;
	}

	public void setHoten(String hoten) {
		Hoten = hoten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public void nhap() {
		Scanner hoten = new Scanner(System.in);
        System.out.print("Nhap ho ten nhan vien: ");
        this.Hoten = hoten.nextLine();
        Scanner namsinh = new Scanner(System.in);
        System.out.print("Nhap nam sinh: ");
        this.namsinh = namsinh.nextInt();
        Scanner gioitinh = new Scanner(System.in);
        System.out.print("Nhap gioi tính: ");
        this.gioitinh = gioitinh.nextLine();
        Scanner diachi = new Scanner(System.in);
        System.out.print("Nhap dia chi: ");
        this.diachi = diachi.nextLine();
    }
    public void in() {
    	System.out.println(" Ho ten: " + getHoten() + "Nam sinh: " + getNamsinh() + " Gioi tinh: " + getGioitinh() + " Dia Chi: " + getDiachi());
	}
}
