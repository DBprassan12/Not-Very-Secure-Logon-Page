package com.UWA;

/*
PROJECT 1 UWA

AUTHOR : THE JANITOR _ "DIVIJ BHAW"
DOh !!! THE PASSWORD AND USER IS VISIBLE IN PLAIN TEXT!!!!

                           __
                   _ ,___,-'",-=-.
       __,-- _ _,-'_)_  (""`'-._\ `.
    _,'  __ |,' ,-' __)  ,-     /. |
  ,'_,--'   |     -'  _)/         `\
,','      ,'       ,-'_,`           :
,'     ,-'       ,(,-(              :
     ,'       ,-' ,    _            ;
    /        ,-._/`---'            /
   /        (____)(----. )       ,'
  /         (      `.__,     /\ /,
 :           ;-.___         /__\/|
 |         ,'      `--.      -,\ |
 :        /            \    .__/
  \      (__            \    |_
   \       ,`-, *       /   _|,\
    \    ,'   `-.     ,'_,-'    \
   (_\,-'    ,'\")--,'-'       __\
    \       /  // ,'|      ,--'  `-.
     `-.    `-/ \'  |   _,'         `.
        `-._ /      `--'/             \
-hrr-      ,'           |              \
          /             |               \
       ,-'              |               /
      /                 |             -'



OR IS IT HMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM......
***************FIND THE CLUES AND HACK THE SYSTEM***************


LOOK CAREFULLY THE PASSWORD I'SNT WHAT YOU THINK IT IS -

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;



//_____________________________________________________________________________
public class Main implements ActionListener {
    //_____________________________________________________________________________
    private static JLabel userLabel;
    private static JLabel passwordLabel;
    private static JLabel success;
    private static JLabel note;
    private static JLabel failedattempt;
    private static JLabel Message;
    private static JLabel Message1;

    //_____________________________________________________________________________
    private static JButton button;
    private static JFrame frame;
    private static JPanel panel;
    private static JTextField userText;
    private static JPasswordField passwordText;

    //____________________________________________
    private static String a;
    private static String b;
    private static String c;
    private static String d;
    private static String f;
    private static String k;

    //__________________________________________________________________________
    public static void main(String[] args) {

//_____________________________________________________________________________
        panel = new JPanel();
        frame = new JFrame();
        //__________________________________________________________________________
        frame.setSize(450,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(" UWA LOGON PAGE" );
        frame.add(panel);
        Container con = frame.getContentPane();
        con.setBackground(Color.blue);
        frame.setResizable(false);
        frame.setBackground(Color.yellow);
        a = ("https://www.youtube");
//_____________________________________________________________________________
        Message = new JLabel("NO UNAUTHORISED ACCESS");
        Message.setBounds(155,20,3000,25);
        panel.add(Message);

        Message1 = new JLabel(" UWA LOG IN PAGE");
        Message1.setBounds(155,5,3000,25);
        panel.add(Message1);
        k= ("FYIMYQo");
//_____________________________________________________________________________
        panel.setLayout(null);
        userLabel = new JLabel("USERNAME");
        userLabel.setBounds(50, 50, 80, 25);
        panel.add(userLabel);

//_____________________________________________________________________________
        userText = new JTextField();
        userText.setBounds(150, 50, 165,25);
        panel.add(userText);
        f = "Ma1nCla55";
        c= ("h?v=878l");
//_____________________________________________________________________________
        panel.setLayout(null);
        passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setBounds(50,80,80,25);
        panel.add(passwordLabel);
//_____________________________________________________________________________
        passwordText = new JPasswordField();
        passwordText.setBounds(150,80,165,25);
        panel.add(passwordText);
//_____________________________________________________________________________
        button = new JButton("LOGIN");
        button.setBounds(175,120,80,25);
        button.addActionListener(new Main());
        panel.add(button);
//_____________________________________________________________________________
        success = new JLabel("");
        success.setBounds(50,150,3000,25);
        panel.add(success);
        //success.setForeground(Color.GREEN);
//_____________________________________________________________________________
        note = new JLabel("");
        note.setBounds(50,170,3000,25);
        panel.add(note);
        note.setForeground(Color.GREEN);

//_____________________________________________________________________________
        failedattempt= new JLabel("");
        failedattempt.setBounds(50,170,3000,25);
        panel.add(failedattempt);
        failedattempt.setForeground(Color.RED);

//_____________________________________________________________________________
        frame.setVisible(true);
       // frame.setBackground(Color.BLUE);
    }
    //_____________________________________________________________________________
    public void actionPerformed(ActionEvent e){
        String user =userText.getText();
        String password =passwordText.getText();
        System.out.println(user + "," +  password);

        //__________________________________________________________________________
        passwordText.setText("");
        userText.setText("");
        failedattempt.setText("");
        d = "STring1nt";


// will need to mask the password and username
        b= (".com/watc");
//_____________________________________________________________________________
        if(user.equals(f) && password.equals(d))
//----------------------------------------------------------------------------
        {
            success.setText("LOGIN SUCCESSFUL, WELCOME " + user );
            note.setText("CONGRATULATIONS, YOU HAVE HACKED UWA!");
            //cyber punk redirect link
           try {
                Desktop desktop = Desktop.getDesktop();
                URI oURL = new URI(a + b + c + k );
                //HASH THE URL PLS
                desktop.browse(oURL);
            } catch (Exception var7) {
                var7.printStackTrace();
            }
            }

        else{
            failedattempt.setText("WRONG PASSWORD OR USERNAME, TRY AGAIN!");
            success.setText("");
            note.setText("");
//_____________________________________________________________________________
        }
        }
    }









