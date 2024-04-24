package Payments;

import java.util.Date;

public class credit extends payment {
    private String type;
    private String number;
    private Date expDate;

    public credit(float amount, String type, String number, Date expDate) {

        this.type = type;
        this.number = number;
        this.expDate = expDate;
    }

    public void authorized(){
        System.out.println("pago con targeta de credito realizada con éxito");
    }
}