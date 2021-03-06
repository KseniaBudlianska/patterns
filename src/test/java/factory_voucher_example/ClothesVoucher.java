package factory_voucher_example;

import java.util.UUID;

public class ClothesVoucher implements Voucher {

    private final String code = UUID.randomUUID().toString();
    private final String message = "<<YOU WIN Clothes vaucher />>";

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }

    @Override
    public void print() {
        System.out.println(message);
        System.out.println("Code: " + code);
    }
}
