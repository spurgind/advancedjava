/*
 * For educational purposes - CTU Online
 */

package advancedjava;

import javax.swing.JFrame;


/**
 *Written by Dalton Spurgin
 */
public class ServerTest {

    public static void main(String[] args){
            //create server
    Server application = new Server();
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.runServer();
    }
    
    
}



