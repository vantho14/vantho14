
public class KySu extends CanBo {
	public String nganhdaotao;
	public KySu() {
		
	}
	public KySu(String nganhdaotao, String hoten, int namsinh, String gioitinh, String diachi) {
        super(hoten, namsinh, gioitinh, diachi);
        this.nganhdaotao = nganhdaotao;
    }
	public String getNganhdt() {
		return nganhdaotao;
	}
	public void setNganhdt(String nganhdaotao) {
		this.nganhdaotao = nganhdaotao;
	}
	
}