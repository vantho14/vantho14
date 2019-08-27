import java.util.ArrayList;
public class DanhSachCanBo {
	ArrayList<CanBo> danhsachs = new ArrayList<CanBo>();
	public boolean them(CanBo cb) {
		return danhsachs.add(cb);	
	}
	public ArrayList<CanBo> layDanhSachCanBo(){
		return danhsachs;
	}
}
