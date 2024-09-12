public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Mahasiswa08 m1 = new Mahasiswa08();
        m1.nim  = "2341760011";
        m1.nama = "Atsilah Amany Putri Harsuma";
        m1.alamat = "Bangil, Kabupaten Pasuruan";
        m1.kelas = "2C";

        Mahasiswa08 m2 = new Mahasiswa08();
        m2.nim = "2341760012";
        m2.nama = "Erika Attacharya";
        m2.alamat = "Blitar, Kabupaten Blitar";
        m2.kelas = "2C";

        Mahasiswa08 m3 = new Mahasiswa08();
        m3.nim = "2341760013";
        m3.nama = "Jamiatul Afifah";
        m3.alamat = "Kota Pasuruan";
        m3.kelas = "2F";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}
