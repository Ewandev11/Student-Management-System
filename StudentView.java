package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StudentView extends JFrame {
    public JTextField id, name, address, age, birthday, admission, guardian, contact;
    public JComboBox<String> grade, gender;
    public JButton submit, search, newStudent, update, delete, mainmenu;

    public StudentView() {
        initComponents();
    }

    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel("STUDENT");
        JLabel jLabel2 = new JLabel("ID");
        JLabel jLabel3 = new JLabel("NAME");
        JLabel jLabel4 = new JLabel("ADDRESS");
        JLabel jLabel5 = new JLabel("GRADE");
        JLabel jLabel6 = new JLabel("AGE");
        JLabel jLabel7 = new JLabel("BIRTHDAY");
        JLabel jLabel8 = new JLabel("GENDER");
        JLabel jLabel9 = new JLabel("ADMISSION DATE");
        JLabel jLabel10 = new JLabel("GUARDIAN'S NAME");
        JLabel jLabel11 = new JLabel("CONTACT NO.");

        id = new JTextField();
        name = new JTextField();
        address = new JTextField();
        age = new JTextField();
        birthday = new JTextField();
        admission = new JTextField();
        guardian = new JTextField();
        contact = new JTextField();

        grade = new JComboBox<>(new String[]{"", "Grade-1", "Grade-2", "Grade-3", "Grade-4", "Grade-5", "Grade-6"});
        gender = new JComboBox<>(new String[]{"", "Male", "Female"});

        submit = new JButton("SUBMIT");
        search = new JButton("SEARCH");
        newStudent = new JButton("NEW");
        update = new JButton("UPDATE");
        delete = new JButton("DELETE");
        mainmenu = new JButton("MAIN MENU");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(102, 255, 255));
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 36));
        jLabel1.setForeground(Color.RED);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel11))
                                                .addGap(50, 50, 50)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(id, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(search)) // Search button added in front of ID field
                                                        .addComponent(name)
                                                        .addComponent(address)
                                                        .addComponent(grade, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(age)
                                                        .addComponent(birthday)
                                                        .addComponent(gender, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(admission)
                                                        .addComponent(guardian)
                                                        .addComponent(contact, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(newStudent)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(submit)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(update)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(delete)
                                                .addGap(93, 93, 93))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(mainmenu)
                                                .addGap(219, 219, 219))))
        );

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(search)) // Search button added in front of ID field
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(grade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(age, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(birthday, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(gender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(admission, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(guardian, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(contact, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(newStudent)
                                        .addComponent(submit)
                                        .addComponent(update)
                                        .addComponent(delete))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mainmenu)
                                .addContainerGap(38, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    
    public void addMainMenuButtonListener(ActionListener listener) {
        mainmenu.addActionListener(listener);
    }
}