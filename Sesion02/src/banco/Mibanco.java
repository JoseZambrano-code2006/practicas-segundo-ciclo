/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author USER
 */
public class Mibanco {

    int id;
    int status;

    public Mibanco() {

        this.status = 0;

    }

    void pay() {
        status = 1;

    }

    void withdrawMoney() {

        status = 0;

    }

    void checkStatus() {

        if (status == 1) {
            System.out.println("usted pago");
        } else {
            System.out.println("usted retiro dinero");

        }

    }

}
