package sv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class SinhVien implements Serializable {
	private int masv;
	private String Hoten;
	private String Lop;
	private String Mail;

	public SinhVien(int masv, String hoten, String lop, String mail) {
		super();
		this.masv = masv;
		Hoten = hoten;
		Lop = lop;
		Mail = mail;
	}

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return Hoten;
	}

	public void setHoten(String hoten) {
		Hoten = hoten;
	}

	public String getLop() {
		return Lop;
	}

	public void setLop(String lop) {
		Lop = lop;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.masv + " ," + this.Hoten + " ," + this.Lop + " ," + this.Mail;
	}

	public static void ghiDuLieu(SinhVien SV1) throws IOException {
		FileOutputStream fileout = null;
		ObjectOutputStream os = null;
		try {
			fileout = new FileOutputStream("QLSV.txt");
			os = new ObjectOutputStream(fileout);
			os.writeObject(SV1);

			os.close();
			fileout.close();
		} catch (FileNotFoundException e) {
			System.out.println("khong the ghi file");
			e.printStackTrace();
		}
	}

	public static void docDuLieu() throws IOException {
		FileInputStream filein = new FileInputStream("QLSV.txt");
		ObjectInputStream in = new ObjectInputStream(filein);
		try {
			SinhVien SV;
			SV = (SinhVien) in.readObject();
			System.out.println(SV.toString());
			in.close();
			filein.close();
		} catch (ClassNotFoundException e) {
			System.out.println("khong the doc file");
			e.printStackTrace();
		}

	}
	// public static void main(String []args) throws IOException{
	// SinhVien S = new SinhVien(1651120031, "Trinh Dinh Quang",
	// "Cn16a","quangtrinh@gmail.com");
	// ghiDuLieu(S);
	// docDuLieu(S);
	//// String thongtin = S.toString();
	//// System.out.println(thongtin);
	// }
}
