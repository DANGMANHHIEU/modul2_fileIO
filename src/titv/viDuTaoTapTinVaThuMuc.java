package titv;

import java.io.File;
import java.io.IOException;

public class viDuTaoTapTinVaThuMuc {
    public static void main(String[] args) {
        File foder1 = new File("F:\\modul2\\fileIO");
        System.out.println("Kiểm tra xem tồn tại foder ko: " + foder1.exists());

        //tạo thưu mục
        File foder2 = new File("F:\\modul2\\fileIO\\thuchanh");
        foder2.mkdir();

        //tạo nhiều thư mục
        File foder3 = new File("F:\\modul2\\fileIO\\thuchanh\\thuchanh1\\thuchanh2");
        foder3.mkdirs();

        //tạo tập tin có phần mở rộng .exe,.txt,.doc,.xls
        File foder4 = new File("F:\\modul2\\fileIO\\thuchanh\\vidu.text");
        try {
            foder4.createNewFile();

        } catch (IOException e) {
            //khồn có quền truy cập
            //ổ nhớ đầy
            //đường link sai
            e.printStackTrace();
        }

    }
}