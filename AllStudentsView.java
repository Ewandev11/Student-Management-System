package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AllStudentsView extends JFrame {
    private JPanel jPanel1;
     private JLabel jLabel1;
    private JComboBox<String> grade;
    private JScrollPane jScrollPane1;
    private JTable view;
    private JButton mainMenuButton;
    private JButton editorAddButton;
 
    public AllStudentsView() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        grade = new JComboBox<>();
        jScrollPane1 = new JScrollPane();
        view = new JTable();
        mainMenuButton = new JButton();
        editorAddButton = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new Color(102, 255, 255));

        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 36));
        jLabel1.setForeground(new Color(255, 0, 0));
        jLabel1.setText("STUDENTS");

        grade.setFont(new Font("Tahoma", Font.BOLD, 18));
        grade.setModel(new DefaultComboBoxModel<>(new String[]{"All"}));

        view.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{}
        ));
        jScrollPane1.setViewportView(view);

        mainMenuButton.setText("MAIN MENU");
        editorAddButton.setText("EDIT / ADD");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(298, 298, 298))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(grade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(362, 362, 362))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(mainMenuButton)
                            .addGap(33, 33, 33))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 688, GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(351, 351, 351)
                            .addComponent(editorAddButton)))
                    .addGap(0, 52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(grade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)
                    .addComponent(editorAddButton)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                    .addComponent(mainMenuButton)
                    .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    public void addGradeActionListener(ActionListener listener) {
        grade.addActionListener(listener);
    }

    public void addMainMenuButtonListener(ActionListener listener) {
        mainMenuButton.addActionListener(listener);
    }

    public void addEditorAddButtonListener(ActionListener listener) {
        editorAddButton.addActionListener(listener);
    }

    public void setTableModel(javax.swing.table.TableModel model) {
        view.setModel(model);
    }

    public String getSelectedGrade() {
        return (String) grade.getSelectedItem();
    }
}
