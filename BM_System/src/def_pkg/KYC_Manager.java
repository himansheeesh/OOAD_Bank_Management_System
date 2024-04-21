package def_pkg;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class KYC_Manager {
    
    private String name;
    
    KYC_Manager() {
        name = "";
    }
    
    KYC_Manager(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void performKYC(JFrame frame, String clientID, String clientAddress) {
        DB_Handler db = new DB_Handler();
        boolean kycResult = db.performKYC(clientID, clientAddress);

        if (kycResult) {
            JOptionPane.showMessageDialog(frame, "KYC Successful");
        } else {
            JOptionPane.showMessageDialog(frame, "KYC Failed. Client ID or Address doesn't match.");
        }
    }

}
