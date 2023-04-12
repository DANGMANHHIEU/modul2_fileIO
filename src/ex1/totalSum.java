package ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class totalSum {
    public void readFileText(String n){
        try {
            //đọc file theo đường dẫn
            File file=new File(n);

            //kiểm tra xem file ko tồn tại thì ném ra ngoại lệ
            if(!file.exists()){
                throw new FileNotFoundException();
            }

            //đọc từng dong của file vaf tiến hành cộng lại
            BufferedReader br =new BufferedReader( new FileReader(file));
            String line =" ";
            int total =0;
            while ((line= br.readLine())!=null){
                System.out.println(line);
                total+= Integer.parseInt(line);
            }
            br.close();
            System.out.println("tổng: "+total);
        }catch (Exception e){
            System.out.println("file ko tồn tại");
        }
    }

    public static void main(String[] args) {

//        System.out.println("Nhập đường dẫn file:");
//        Scanner sc = new Scanner(System.in);
        String str = "F:\\modul2\\fileIO\\src\\ex1\\vidu.txt";

        totalSum total =new totalSum();
        total.readFileText(str);
    }
}
