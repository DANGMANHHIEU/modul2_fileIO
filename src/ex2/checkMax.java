package ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class checkMax {
    public List<Integer> readFile(String n){
        List<Integer>number=new ArrayList<>();
        try {
            File a = new File(n);

            if(!a.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader=new BufferedReader(new FileReader(a));

            while (bufferedReader.readLine()!=null){
                number.add(Integer.parseInt(bufferedReader.readLine()));
            }
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("File không tồn tại!!!");
        }
        return number;
    }

    public void writeFile(String n,int max){
        try {
            FileWriter fw= new FileWriter(n,true);
            BufferedWriter br =new BufferedWriter(fw);
            br.write("Giá trị lớn nhất: "+max);
            br.close();
        }catch (Exception e){
            e.getMessage();
        }
    }

}
