package simple.example.motorpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.motorpedia.model.Ayam;
import simple.example.motorpedia.model.Hewan;
import simple.example.motorpedia.model.Itik;
import simple.example.motorpedia.model.Puyuh;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Ayam> initDataAyam(Context ctx) {
        List<Ayam> ayams = new ArrayList<>();
        ayams.add(new Ayam("Ayam Cemani", "Hitam",
                "Kerap dijual dengan harga yang fantastis yakni sekitar 25 jutaan Rupiah, menjadikan Ayam Cemani sebagai salah satu dari jenis-jenis ayam di Indonesia yang katanya cuma bisa dimiliki oleh orang “berduit” saja. ", R.drawable.cemani));
        ayams.add(new Ayam("Ayam Tukung", "Buntung",
                "Ayam Tukung merupakan salah satu dari jenis-jenis ayam di Indonesia yang cukup langka untuk ditemukan,Ayam Tukung merupakan salah satu dari jenis-jenis ayam di Indonesia yang cukup langka untuk ditemukan.", R.drawable.tukung));
        ayams.add(new Ayam("Ayam Pelung", "Jambul merah",
                "Hewan yang termasuk dalam jenis-jenis ayam di Indonesia ini, termasuk ayam buras khas tanah air yang banyak ditemukan di daerah Cianjur, Jawa Barat.", R.drawable.pelung));
        return ayams;
    }

    private static List<Puyuh> initDataPuyuh(Context ctx) {
        List<Puyuh> puyuhs = new ArrayList<>();
        puyuhs.add(new Puyuh("Puyuh Batu", "Unik",
                "Ciri ciri dari burung puyuh batu yaitu bulunya berwarna hitam pekat dan dibagian leher ada pada bagian leher berwarna putih.", R.drawable.puyuhbatu));
        puyuhs.add(new Puyuh("Puyuh Blaster", "Unik ",
                "Keunggulan yang dimiliki dari puyuh blaster yaitu telur yang dihasilkan besar sekitar 12gram lebih dan bobot afkir yang dihasilkan bisa mencapai 200gram keatas. ", R.drawable.puyuhblaster));
        puyuhs.add(new Puyuh("Puyuh Jepang", "Unik",
                "Puyuh jepang akan bertelur pada usia 40-50 hari dengan bobot telur berkisar 8-12 gram. ", R.drawable.puyuhjepang));
        return puyuhs;
    }

    private static List<Itik> initDataItik(Context ctx) {
        List<Itik> itiks = new ArrayList<>();
        itiks.add(new Itik("Itik Bali","Putih",
                "Itik bali adalah varian itik lokal yang banyak dibudidaya di Pulau Bali dan Pulau Lombok.", R.drawable.itikbali));
        itiks.add(new Itik("Itik manila", "",
                "Itik manila adalah unggas air yang termasuk dalam keluarga (genus) Cairina", R.drawable.manila));
        itiks.add(new Itik("Itik Serati", "",
                "Di Indonesia unggas ini adalah sepenuhnya hewan peliharaan, yang diternakkan terutama untuk dagingnya. Asal usul mentok peliharaan adalah dari Meksiko, Amerika Tengah dan Amerika Selatan, di mana populasi burung ini hidup alami dan liar di rawa-rawa berhutan dan wilayah berpaya di sekitar danau dan sungai; termasuk di hilir lembah Sungai Rio Grande di Texas. Populasi lepasan yang meliar (feral) juga dijumpai di Florida bagian selatan. ", R.drawable.serati));
        return itiks;
    }

    private static void initAllMotors(Context ctx) {
        hewans.addAll(initDataAyam(ctx));
        hewans.addAll(initDataPuyuh(ctx));
        hewans.addAll(initDataItik(ctx));
    }

    public static List<Hewan> getAllMotor(Context ctx) {
        if (hewans.size() == 0) {
            initAllMotors(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getMotorsByTipe(Context ctx, String merek) {
        List<Hewan> motorsByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllMotors(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getMerek().equals(merek)) {
                motorsByType.add(h);
            }
        }
        return motorsByType;
    }

}
