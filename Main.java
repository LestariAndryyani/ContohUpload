import java.util.Scanner;

abstract class hitung{
    abstract double getHitungLuas();
}

class Persegi extends hitung {
    private double panjang, lebar;
}

void setPanjang(double panjang){
    this.panjang = panjang;
}

void setLebar(double lebar){
    this.lebar = lebar;
}

double getHitungLuas(){
    double hitungLuas;
    hitungLuas = this.panjang * this.lebar;
    return(hitungLuas);
}

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        hitung [] h = new hitung[2];
        double panjang, lebar;
        System.out.println();
        System.out.print("masukan panjang = "); panjang = scanner.nextDouble();
        System.out.print("masukan lebar = "); lebar = scanner.nextDouble();
        h[1] = new Persegi(panjang, lebar);
    }
}
