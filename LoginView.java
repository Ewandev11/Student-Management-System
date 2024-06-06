package view;
import javax.swing.*;

public class LoginView extends JFrame {
    private JPanel jPanel1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JTextField username;
    private JPasswordField password;
    private JLabel errormsg;
    private JButton login;
    private JButton cancel;

    public LoginView() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        username = new JTextField();
        password = new JPasswordField();
        errormsg = new JLabel();
        login = new JButton();
        cancel = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 350));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("PASSWORD");

        username.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        password.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        errormsg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        errormsg.setForeground(new java.awt.Color(255, 0, 0));
        errormsg.setText("ERRORMSG");
        errormsg.setVisible(false);

        login.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        login.setText("LOGIN");

        cancel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancel.setText("CANCEL");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel)
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(78, 78, 78)
                                .addComponent(password, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(errormsg)
                                    .addComponent(username, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(login))))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(username)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(password)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(errormsg)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(login)
                    .addComponent(cancel))
                .addGap(42, 42, 42))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    public String getUsername() {
        return username.getText();
    }

    public String getPassword() {
        return new String(password.getPassword());
    }

    public void setErrorMsg(String msg) {
        errormsg.setText(msg);
        errormsg.setVisible(true);
    }

    public void addLoginListener(java.awt.event.ActionListener listener) {
        login.addActionListener(listener);
    }

    public void addCancelListener(java.awt.event.ActionListener listener) {
        cancel.addActionListener(listener);
    }

    public void clearFields() {
        username.setText("");
        password.setText("");
        errormsg.setVisible(false);
    }
}
