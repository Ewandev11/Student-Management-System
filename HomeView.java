package view;
import javax.swing.*;

public class HomeView extends JFrame {
    private JPanel jPanel1;
    private JButton logout;
    private JButton student;

    public HomeView() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        logout = new JButton();
        student = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 350));

        logout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logout.setText("LOG OUT");

        student.setBackground(new java.awt.Color(255, 255, 0));
        student.setIcon(new ImageIcon(getClass().getResource("/images/student.png"))); // NOI18N

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(499, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(233, 233, 233)
                    .addComponent(student)
                    .addContainerGap(234, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout)
                .addContainerGap(302, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(student)
                    .addContainerGap(96, Short.MAX_VALUE)))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    public void addLogoutListener(java.awt.event.ActionListener listener) {
        logout.addActionListener(listener);
    }

    public void addStudentListener(java.awt.event.ActionListener listener) {
        student.addActionListener(listener);
    }
}
