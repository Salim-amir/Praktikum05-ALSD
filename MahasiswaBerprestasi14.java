public class MahasiswaBerprestasi14 {
    Mahasiswa14 [] listMhs;
    int idx;

    MahasiswaBerprestasi14(int kapasitas) {
        listMhs = new Mahasiswa14[kapasitas];
        idx = 0;
    }

    void tambah(Mahasiswa14 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }
    
    void tampil() {
        for (Mahasiswa14 m : listMhs) {
            m.tampilInformasi();
            System.out.println("------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa14 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i=0;i<listMhs.length-1;i++){
            int idxMin=i;
            for (int j=i+1;j<listMhs.length;j++){
                if (listMhs[j].ipk<listMhs[idxMin].ipk){
                    idxMin =j;
                }
            }
            Mahasiswa14 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i]= tmp;
        }
    }
}