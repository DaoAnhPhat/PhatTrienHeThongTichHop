package Phan2;

public class PhanSo {
    private int TuSo, MauSo;
	public PhanSo(int tuSo, int mauSo) {
		TuSo = tuSo;
		MauSo = mauSo;}
    public PhanSo() {
	}

	public int getTuSo() {
		return TuSo;
	}

	public void setTuSo(int tuSo) {
		TuSo = tuSo;
	}

	public int getMauSo() {
		return MauSo;
	}

	public void setMauSo(int mauSo) {
		MauSo = mauSo;
	}
	
    public void nghichDao() {
        this.getTuSo();
        this.getMauSo();
        System.out.println("Nghịch đảo phân số: "+ MauSo + "/" + TuSo); 
    }

    public void giaTriThuc() {
        this.getTuSo();
        this.getMauSo();
        System.out.println("Kết quả phân số: " + (float) TuSo/MauSo);
    } 
    public String toString() {
        return "Phân số bạn nhập: "+ TuSo + "/" + MauSo; 
    }
}