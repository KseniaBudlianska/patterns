package factory_voucher_example;

public class VoucherFabric {

    public Voucher generateVoucher(int rate) {
        if (rate < 0) {
            throw new IllegalArgumentException("Wrong rate. It can not be less than 0.");
        } else if (rate < 30) {
            return new FoodVoucher();
        } else return new ClothesVoucher();
    }

    public static void main(String[] args) {
        //new VoucherFabric().generateVoucher(-9);
        new VoucherFabric().generateVoucher(29).print();
        new VoucherFabric().generateVoucher(30).print();
        new VoucherFabric().generateVoucher(31).print();
    }
}
