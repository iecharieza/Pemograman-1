import java.util.List;

public class Peminjaman{
	private String tanggalPinjam;
	private String tanggalKembali;
	private String status;
	private Anggota peminjam;
	
	private List<Pengembalian> daftarPengembalian;
	private List<Buku> daftarBuku;
}