package sv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class LISTSV implements Serializable {
	private ArrayList<SinhVien> DanhSachSV = new ArrayList<SinhVien>();

	public ArrayList<SinhVien> getDanhSachSV() {
		return DanhSachSV;
	}

	public void setDanhSachSV(ArrayList<SinhVien> danhSachSV) {
		DanhSachSV = danhSachSV;
	}

	public void ghiDS(SinhVien SV) throws IOException {
		FileOutputStream fileout = new FileOutputStream("dssv.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(SV);
		DanhSachSV.add(SV);
		out.close();
		fileout.close();

	}

	@SuppressWarnings("unchecked")
	public void docDS() throws  IOException {
		File file = new File("dssv.txt");
		FileInputStream filein = null;
		ObjectInputStream in = null;
		filein = new FileInputStream(file);

		in = new ObjectInputStream(filein);
		ArrayList<SinhVien>SV2;
		try {
			SV2 =  (ArrayList<SinhVien>)in.readObject();
			for (SinhVien DS1 : SV2) {
				System.out.println(DS1.toString());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		in.close();
		filein.close();
	}

}