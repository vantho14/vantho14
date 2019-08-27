import java.util.Scanner;

public class KySu extends CanBo {
	private String nganhdaotao;
	public KySu() {
		super();
	}
	public KySu(String nganhdaotao, String hoten, int namsinh, String gioitinh, String diachi) {
		super(hoten, namsinh, gioitinh, diachi);
		this.nganhdaotao=nganhdaotao;
	}
	public String getNganhdaotao() {
		return nganhdaotao;
	}

	public void setNganhdaotao(String nganhdaotao) {
		this.nganhdaotao = nganhdaotao;
	}
	public void nhap(Scanner scanner) {
		Scanner ndt = new Scanner(System.in);
		System.out.println("Nhập ngành đào tạo: ");
		this.nganhdaotao = ndt.nextLine();
	}
	@Override
	public void in() {
		System.out.println(" Ngành đào tạo: " + getNganhdaotao());
	}
}
