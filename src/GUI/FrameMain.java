package GUI;

import GUI.ItemRoot;
import java.util.ArrayList;
import untils.CatchEvent;

public class FrameMain extends javax.swing.JFrame {

    public FrameMain(int status) {
        initComponents();
        initView(status);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        CatchEvent catchEvent = new CatchEvent(pn_view);
        ArrayList<ItemRoot> menu = new ArrayList<>();
        menu.add(new ItemRoot("book", pn_book, lb_book));
        menu.add(new ItemRoot("deal", pn_deal, lb_deal));
        menu.add(new ItemRoot("employees", pn_employees, lb_employees));
        menu.add(new ItemRoot("member", pn_member, lb_member));
        menu.add(new ItemRoot("statistical", pn_statistical, lb_statistical));
        catchEvent.setMenu(menu);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_root = new javax.swing.JPanel();
        pn_menu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn_book = new javax.swing.JPanel();
        lb_book = new javax.swing.JLabel();
        pn_employees = new javax.swing.JPanel();
        lb_employees = new javax.swing.JLabel();
        pn_member = new javax.swing.JPanel();
        lb_member = new javax.swing.JLabel();
        pn_statistical = new javax.swing.JPanel();
        lb_statistical = new javax.swing.JLabel();
        pn_deal = new javax.swing.JPanel();
        lb_deal = new javax.swing.JLabel();
        pn_view = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_root.setBackground(new java.awt.Color(204, 255, 204));

        pn_menu.setBackground(new java.awt.Color(153, 153, 255));

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Library.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ THƯ VIỆN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_book.setBackground(new java.awt.Color(0, 255, 153));

        lb_book.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_book.setForeground(new java.awt.Color(255, 255, 255));
        lb_book.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Book.png"))); // NOI18N
        lb_book.setText("Quản Lý Sách");

        javax.swing.GroupLayout pn_bookLayout = new javax.swing.GroupLayout(pn_book);
        pn_book.setLayout(pn_bookLayout);
        pn_bookLayout.setHorizontalGroup(
            pn_bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_bookLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lb_book, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_bookLayout.setVerticalGroup(
            pn_bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_bookLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lb_book)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_employees.setBackground(new java.awt.Color(0, 255, 153));

        lb_employees.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_employees.setForeground(new java.awt.Color(255, 255, 255));
        lb_employees.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_employees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Employees.png"))); // NOI18N
        lb_employees.setText("Quản Lý Nhân Viên");

        javax.swing.GroupLayout pn_employeesLayout = new javax.swing.GroupLayout(pn_employees);
        pn_employees.setLayout(pn_employeesLayout);
        pn_employeesLayout.setHorizontalGroup(
            pn_employeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_employeesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lb_employees)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_employeesLayout.setVerticalGroup(
            pn_employeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_employeesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lb_employees)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_member.setBackground(new java.awt.Color(0, 255, 153));

        lb_member.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_member.setForeground(new java.awt.Color(255, 255, 255));
        lb_member.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Member.png"))); // NOI18N
        lb_member.setText("Quản Lý Đọc Giả");

        javax.swing.GroupLayout pn_memberLayout = new javax.swing.GroupLayout(pn_member);
        pn_member.setLayout(pn_memberLayout);
        pn_memberLayout.setHorizontalGroup(
            pn_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_memberLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lb_member)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_memberLayout.setVerticalGroup(
            pn_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_memberLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_member)
                .addGap(10, 10, 10))
        );

        pn_statistical.setBackground(new java.awt.Color(0, 255, 153));

        lb_statistical.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_statistical.setForeground(new java.awt.Color(255, 255, 255));
        lb_statistical.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_statistical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Statistical.png"))); // NOI18N
        lb_statistical.setText("Thống Kê");

        javax.swing.GroupLayout pn_statisticalLayout = new javax.swing.GroupLayout(pn_statistical);
        pn_statistical.setLayout(pn_statisticalLayout);
        pn_statisticalLayout.setHorizontalGroup(
            pn_statisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_statisticalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lb_statistical)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        pn_statisticalLayout.setVerticalGroup(
            pn_statisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_statisticalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lb_statistical)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_deal.setBackground(new java.awt.Color(0, 255, 153));

        lb_deal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_deal.setForeground(new java.awt.Color(255, 255, 255));
        lb_deal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Deal.png"))); // NOI18N
        lb_deal.setText("Quản Lý Mượn - Trả Sách");

        javax.swing.GroupLayout pn_dealLayout = new javax.swing.GroupLayout(pn_deal);
        pn_deal.setLayout(pn_dealLayout);
        pn_dealLayout.setHorizontalGroup(
            pn_dealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dealLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lb_deal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_dealLayout.setVerticalGroup(
            pn_dealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dealLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lb_deal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_menuLayout = new javax.swing.GroupLayout(pn_menu);
        pn_menu.setLayout(pn_menuLayout);
        pn_menuLayout.setHorizontalGroup(
            pn_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_menuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pn_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pn_deal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pn_member, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pn_employees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pn_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pn_statistical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pn_menuLayout.setVerticalGroup(
            pn_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_menuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pn_book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pn_employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pn_member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pn_deal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pn_statistical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel2.setText("QUẢN LÝ THƯ VIỆN");

        javax.swing.GroupLayout pn_viewLayout = new javax.swing.GroupLayout(pn_view);
        pn_view.setLayout(pn_viewLayout);
        pn_viewLayout.setHorizontalGroup(
            pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pn_viewLayout.setVerticalGroup(
            pn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_viewLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_rootLayout = new javax.swing.GroupLayout(pn_root);
        pn_root.setLayout(pn_rootLayout);
        pn_rootLayout.setHorizontalGroup(
            pn_rootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_rootLayout.createSequentialGroup()
                .addComponent(pn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pn_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        pn_rootLayout.setVerticalGroup(
            pn_rootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_rootLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pn_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb_book;
    private javax.swing.JLabel lb_deal;
    private javax.swing.JLabel lb_employees;
    private javax.swing.JLabel lb_member;
    private javax.swing.JLabel lb_statistical;
    private javax.swing.JPanel pn_book;
    private javax.swing.JPanel pn_deal;
    private javax.swing.JPanel pn_employees;
    private javax.swing.JPanel pn_member;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_root;
    private javax.swing.JPanel pn_statistical;
    private javax.swing.JPanel pn_view;
    // End of variables declaration//GEN-END:variables

    private void initView(int status) {
        
        if(status==1){
        
        }
     }
}
