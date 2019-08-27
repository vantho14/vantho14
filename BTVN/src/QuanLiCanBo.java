import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.event.TableColumnModelListener;

	public class QuanLiCanBo {
		public void mainMenu() {
			// TODO Auto-generated method stub
			System.out.println("Nhap 1 - Nhap");
			System.out.println("Nhap 2 - Hien thi danh sach");
			System.out.println("Nhap 3 - Tim Kiem");
			System.out.println("Nhap 0 - Thoat");
			int luaChon = 0;
			do {
				System.out.println("ban chon chuc nang:");
				luaChon = Integer.parseInt(nn.nextLine());
				switch (luaChon) {
				case 1:
					themCanBo();
					break;
				case 2:
					hienThiDanhSachCanBo();
					break;
				case 3:
					System.out.println("2. Tim kiem can bo theo ten");
					timKiem();
					break;
				}
			} while (luaChon != 0);
		}
		public DanhSachCanBo danhsach;
		public Scanner nn;
		ArrayList<CanBo> danhsachs = new ArrayList<CanBo>();
		private static Scanner timkiem;
		private static ArrayList<CanBo> list;

		public QuanLiCanBo() {
			danhsach = new DanhSachCanBo();
			nn = new Scanner(System.in);
		}

		private void themCanBo() {
			System.out.println("Nhap 4 - Nhap thong tin cong nhan");
			System.out.println("Nhap 5 - Nhap thong tin ky su");
			System.out.println("Nhap 6 - Nhap thong tin nhan vien");
			System.out.println("Nhap 0 - Ket thuc");
			int luaChon = 0;
			do {
				System.out.println("Ban chon them loai nhan vien:");
				luaChon = Integer.parseInt(nn.nextLine());
				switch (luaChon) {
				case 4:
					if (danhsach.them(taoCongNhan())) {
						System.out.println("Nhap cong nhan thanh cong");
					} else {
						System.out.println("Nhap cong nhan that bai");
					}
					break;
				case 5:
					if (danhsach.them(taoKySu())) {
						System.out.println("Nhap ky su thanh cong");
					} else {
						System.out.println("Nhap ky su that bai");
					}
					break;
				case 6:
					if (danhsach.them(taoNhanVienPV())) {
						System.out.println("Nhap nhan vien thanh cong");
					} else {
						System.out.println("Nhap nhan vien thanh cong");
					}
					break;
				}
			} while (luaChon != 0);

		}

		private CanBo taoNhanVienPV() {
			NhanVien canBo = new NhanVien();
			System.out.println("Nhap ho ten:");
			canBo.setHoten(nn.nextLine());
			System.out.println("Nhap gioi tinh:");
			canBo.setGioitinh(nn.nextLine());
			System.out.println("Nhap nam sinh:");
			canBo.setNamsinh(Integer.parseInt(nn.nextLine()));
			System.out.println("Nhap dia chi:");
			canBo.setDiachi(nn.nextLine());
			System.out.println("Nhap cong viec:");
			canBo.setCongviec(nn.nextLine());
			return canBo;
		}

		private CanBo taoCongNhan() {
			CongNhan canBo = new CongNhan();
			System.out.println("Nhap ho ten:");
			canBo.setHoten(nn.nextLine());
			System.out.println("Nhap gioi tinh:");
			canBo.setGioitinh(nn.nextLine());
			System.out.println("Nhap nam sinh:");
			canBo.setNamsinh(Integer.parseInt(nn.nextLine()));
			System.out.println("Nhap dia chi:");
			canBo.setDiachi(nn.nextLine());
			System.out.println("Nhap bac:");
			canBo.setBac(Integer.parseInt(nn.nextLine()));
			return canBo;
		}

		private CanBo taoKySu() {
			KySu canBo = new KySu();
			System.out.println("Nhap ho ten:");
			canBo.setHoten(nn.nextLine());
			System.out.println("Nhap gio tinh:");
			canBo.setGioitinh(nn.nextLine());
			System.out.println("Nhap nam sinh:");
			canBo.setNamsinh(Integer.parseInt(nn.nextLine()));
			System.out.println("Nhap dia chi:");
			canBo.setDiachi(nn.nextLine());
			System.out.println("Nhap nganh dao tao:");
			canBo.setNganhdt(nn.nextLine());
			return canBo;
		}
		private void hienThiThongTinCanBo(CanBo canBo) {
			System.out.println("ten : " + canBo.getHoten());
			System.out.println("gioi tinh :" + canBo.getGioitinh());
			System.out.println("nam sinh: " + canBo.getNamsinh());
			System.out.println("dia chi :" + canBo.getDiachi());
			if (canBo instanceof CongNhan) {
				CongNhan congNhan = (CongNhan) canBo;
				System.out.println("bac: " + congNhan.getBac());
			} else {
				if (canBo instanceof KySu) {
					KySu kySu = (KySu) canBo;
					System.out.println("nganh dao tao :" + kySu.getNganhdt());
				} else {
					NhanVien nhanVienPV = (NhanVien) canBo;
					System.out.println("cong viec :" + nhanVienPV.getCongviec());
				}
			}
		}

		private void hienThiDanhSachCanBo() {
			for (CanBo canBo : danhsach.layDanhSachCanBo()) {
				hienThiThongTinCanBo(canBo);
			}
		}
		public static void timKiem() {
			timkiem = new Scanner(System.in);
			list = null;
			if (list.size() == 0) {
				System.out.println(" Chua co thong tin");
			} else {
			System.out.print(" Nhap ten can tim kiem: ");
			String tentk = timkiem.nextLine();
			for (int i = 0; i < list.size(); i++) {
				if(tentk.equals(((CanBo) list.get(i)).getHoten())) {
					((CanBo) list.get(i)).getHoten();
					System.out.println("--------------------");
				}
			}
			}
		}
	}

