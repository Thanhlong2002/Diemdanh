package Shapes;

import java.util.Scanner;

public class Hinhchunhat extends HinhHoc {
  public float dai;
  public float rong;
  public Hinhchunhat(){
    ten = "Hình chữ nhật";
  }
  public void nhapChieuDai(){
    System.out.println("Chiều dài = ");
    Scanner scanner = new Scanner(System.in);
    dai = scanner.nextFloat();
  }
  public void nhapChieuRong(){
    System.out.println("Chiều rộng = ");
    Scanner scanner = new Scanner(System.in);
    rong = scanner.nextFloat();
  }
  public void tinhChuVi(){
    chuVi = 2 * ( dai + rong );
  }
  public void tinhDienTich(){
    dienTich = dai * rong;
  }
}