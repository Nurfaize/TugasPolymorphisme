/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notifikasi;

/**
 *
 * @author Administrator
 */
public class Main {
    
    public static void main(String[] args){
        String emailPenerima = "nurfaize76@gmail.com";
        String nomerHp = "+62828732738";
        String mobileId = "android-123456";
        
        EmailNotification emailNotif = new EmailNotification();
        SMSNotification smsNotif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();
        
        String message = "Tutorial Polimorfisme sudah terbit di Web SMK, cek sekarang di https://www.petanikode.com/java-oop-polimorfisme";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}
