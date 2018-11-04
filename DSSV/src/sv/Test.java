package sv;

import java.io.IOException;
import java.io.Serializable;

public class Test implements Serializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		@SuppressWarnings("unused")
		SinhVien SV1 = new SinhVien(1651120031, "Trinh Dinh Quang","Cn16a",
			"quangtrinh@gmail.com");
		SinhVien SV2 = new SinhVien(1651120032, "Trinh Van Quang","Cn16b",
				"vanquang@gmail.com");
		LISTSV sinhvien = new LISTSV();
//		ghi danh sach sinh vien tu file
		sinhvien.ghiDS(SV1);
		sinhvien.ghiDS(SV2);
//		doc danh sach sinh vien tu file
		sinhvien.docDS();
		
	}

}
