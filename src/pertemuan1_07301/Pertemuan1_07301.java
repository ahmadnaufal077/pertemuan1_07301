package pertemuan1_07301;
import java.util.Scanner;

public class Pertemuan1_07301 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int banyak_07301;
        int nilai_07301[];
        nilai_07301 = new int [100];
        int i_07301 = 1;
        int total = 0;
        int rata_rata;
        
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        banyak_07301 = scan.nextInt();
        int jumlah_07301[] = new int[banyak_07301];
        
        do{
            
            {
            String nama_matkul_07301;
            System.out.print("Nama Mata Kuliah ke - "+i_07301+" :");
            nama_matkul_07301 = scan.next();
            
            System.out.print("Nilai ke- "+i_07301+" : ");
            nilai_07301[i_07301] = scan.nextInt();
            total = total + nilai_07301[i_07301];
            }i_07301++;
            
        }while(i_07301 <= banyak_07301);
        
        System.out.println("Total = "+total);
        rata_rata = total / banyak_07301;
        System.out.println("Rata-Rata = "+rata_rata);
        
        if (rata_rata <= 70){
            System.out.println(Keterangan (rata_rata));
        }
        else if(rata_rata >= 71){
            System.out.println(Keterangan (rata_rata));
        }
    }
    public static String Keterangan(int nilai){
        String hasil = null;
        if (nilai <= 70){
            return "GUGUR";
        }
        else if(nilai >= 71){
            return "LULUS";
        }
        return hasil; 
    }
    
}