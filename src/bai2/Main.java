package bai2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br =null;
        try {
             br=new BufferedReader(new FileReader("F:\\modul2\\fileIO\\src\\bai2\\country.csv"));
            String line =" ";
            while ((line=br.readLine())!=null){
                render(arr(line));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(br!=null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static List<String> arr(String scvLine){
        List<String> list=new ArrayList<>();
        if(scvLine != null){
            String[] splitData=scvLine.split(",");
            for(int i =0; i<splitData.length;i++){
                list.add(splitData[i]);
            }
        }
        return list;
    }

    public static void render(List<String> n){
        System.out.println("Country { id= "+n.get(0)+", code= "+n.get(1)+", name="+n.get(2)+"}");
    }
}
