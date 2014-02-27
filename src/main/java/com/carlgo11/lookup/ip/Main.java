package com.carlgo11.lookup.ip;

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class Main 
{
    public static void main( String[] args )
    {
        if(Desktop.isDesktopSupported()){
        String lookupaddress = "http://ip-whois-lookup.com/lookup.php?ip=";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an IP address: ");
        String input = in.nextLine();
            try {
                Desktop.getDesktop().browse(new URI(lookupaddress+input));
            } catch (Exception ex) {
                onError(ex.toString());
            }
        
        }else{
            onError("OS is not desktop based.");
        }
    }
    static void onError(String error){
        System.out.println("[Error] "+error);
    }
}
