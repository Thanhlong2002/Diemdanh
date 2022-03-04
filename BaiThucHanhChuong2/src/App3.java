import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception {
        double year;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten");
        name = sc.nextLine();
        System.out.println("Nhap so nam");
        year = sc.nextDouble();
        double age=2022-year;
        if(age<16)
          System.out.println("Ban "+name+" o do tuoi vi thanh nien");
        if(age>=16&&age<18)
          System.out.println("Ban "+name+" o do tuoi truong thanh");
        if(age>=18)
          System.out.println("Ban "+name+" da gia");
      }
}