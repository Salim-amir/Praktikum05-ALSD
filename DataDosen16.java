public class DataDosen16 {
    Dosen16[] dataDosen16 = new Dosen16[10];
    int idx;

    void tambah(Dosen16 dsn){
        if (idx<dataDosen16.length){
            dataDosen16[idx]=dsn;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }
    void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen kosong.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen16[i].tampil();
        }
    }
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen16[j].usia > dataDosen16[j + 1].usia) {
                    Dosen16 temp = dataDosen16[j];
                    dataDosen16[j] = dataDosen16[j + 1];
                    dataDosen16[j + 1] = temp;
                }
            }
        }
        System.out.println("Data dosen berhasil diurutkan (ASC - termuda ke tertua).");
    }
    void sortingDSC() {
        for (int i = 1; i < idx; i++) {
            Dosen16 temp = dataDosen16[i];
            int j = i;
            while (j > 0 && dataDosen16[j - 1].usia < temp.usia) {
                dataDosen16[j] = dataDosen16[j - 1];
                j--;
            }
            dataDosen16[j] = temp;
        }
        System.out.println("Data dosen berhasil diurutkan (DSC - tertua ke termuda).");
    }
}

