package ex2;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> list){
        int max = list.get(0);
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        checkMax n = new checkMax();
        List<Integer> list = n.readFile("F:\\modul2\\fileIO\\src\\ex2\\max.txt");
        int max= findMax(list);
        n.writeFile("F:\\modul2\\fileIO\\src\\ex2\\writeMax.txt",max);
    }
}
