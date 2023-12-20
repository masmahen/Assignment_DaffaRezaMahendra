package logic;

public class Soal16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tunaSandwich = 42; // Harga Tuna Sandwich (mengandung ikan)
        int spaghettiCarbonara = 50;
        int teaPitcher = 30;
        int pizza = 70;
        int salad = 30;

        int totalHarga = spaghettiCarbonara + teaPitcher + pizza + salad; // Total harga tanpa makanan yang mengandung ikan

        double pajak = 0.10 * totalHarga; // Pajak 10% dari total harga
        double service = 0.05 * totalHarga; // Service 5% dari total harga
        double totalPembayaran = totalHarga + pajak + service; // Total pembayaran

        double pembayaranPerOrang = totalPembayaran / 3; // Pembayaran per orang (tanpa yang alergi)
        double pembayaranAlergi = (totalPembayaran - tunaSandwich) / 3; // Pembayaran orang yang alergi

        System.out.println("Pembayaran per orang (tanpa yang alergi): " + pembayaranPerOrang + "K");
        System.out.println("Pembayaran orang yang alergi: " + pembayaranAlergi + "K");

	}

}
