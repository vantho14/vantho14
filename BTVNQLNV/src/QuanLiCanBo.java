import java.util.ArrayList;
import java.util.Scanner;
	public class QuanLiCanBo {
		public static CanBo canBo = null;
		public static ArrayList<CanBo> list = new ArrayList<CanBo>();
		public static void main(String[] args) {
			boolean flag = true;
			do {
				System.out.println("=====MENU=====");
				System.out.println("1. Nhap danh sach can bo");
				System.out.println("2. Tim kiem can bo theo ten");
				System.out.println("3. In danh sach can bo");
				System.out.println("4. Thoat chuong trinh");
				System.out.println("==============");
				Scanner lc = new Scanner(System.in);
				System.out.print(" Nhap lua chon: ");
				int n = lc.nextInt();
				
				switch (n) {
				case 1:
					System.out.println("1. Nhap danh sach can bo");
					nhapThongtin();
					break;
				case 2:
					System.out.println("2. Tim kiem can bo theo ten");
					timKiem();
					break;
				case 3:
					System.out.println("3. In danh sach can bo");
					danhSach();
					break;
				case 4:
					System.out.println("4. Thoat ");
					flag = false;
				}
			} while (flag == true);
		}
		public static void nhapThongtin() {
			Scanner so = new Scanner(System.in);
			Scanner nN = new Scanner(System.in);
			Scanner nt = new Scanner(System.in);

			do {
				System.out.print(" Nhap nghe ngiep(1-CongNhan,2-KySu,3-NhanVien): ");
				int choose = nN.nextInt();
				
				if ((choose == 1)) {
					System.out.print(" Nhap so cong nhan: ");
					int snv = so.nextInt();
					for (int i = 0; i < snv; i++) {
						System.out.println(" Thong tin cong nhan thu " + (i+1) + " la: ");
						canBo = new CongNhan();
						canBo.nhap();
						list.add(canBo);
					}
				} 
				else if ((choose == 2)) {
					System.out.print(" Nhap so ky su: ");
					int snv = so.nextInt();
					for (int i = 0; i < snv; i++) {
						System.out.println(" Thong tin ky su thu " + (i+1) + " la: ");
						canBo = new KySu();
						canBo.nhap();
						list.add(canBo);
					}
				}
				else if ((choose == 3)) {
					System.out.print(" Nhap so nhan vien: ");
					int snv = so.nextInt();
					for (int i = 0; i < snv; i++) {
						System.out.println(" Thong tin nhan vien thu " + (i+1) + " la: ");
						canBo = new NhanVien();
						canBo.nhap();
						list.add(canBo);
					}
				}
				else {
					System.out.println(" Ban da nhap sai !");
				}
				System.out.print(" Nhap them (y/n) : ");
				if(nt.nextLine().equals("n")) {
					break;
				}
			} while (true);
			
		}
		public static void timKiem() {
			Scanner timkiem = new Scanner(System.in);
			if (list.size() == 0) {
				System.out.println(" Chua co thong tin");
			} else {
			System.out.print(" Nhap ten can tim kiem: ");
			String tenTK = timkiem.nextLine();
			for (int i = 0; i < list.size(); i++) {
				if(tenTK.equals(((CanBo) list.get(i)).getHoten())) {
					((CanBo) list.get(i)).nhap();
					System.out.println("--------------------");
				}
			}
			}
		}
		public static void danhSach() {
			if (list.size() == 0) {
				System.out.println(" Chua tao thong tin");
			} else {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(" Thong tin can bo thu " + (i+1) + " :");
					((CanBo) list.get(i)).nhap();
					System.out.println("--------------------");
				}
			}
			
		}
	
}
