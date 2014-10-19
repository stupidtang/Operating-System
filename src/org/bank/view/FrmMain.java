package org.bank.view;

import javax.swing.JOptionPane;
import org.bank.model.*;
import org.bank.main.Safety;
import org.bank.util.OP;
/**
 * @author 2012222010013
 */
public class FrmMain extends javax.swing.JFrame {
    Myprocess[] p = null;
    Myresource[] r = null;
    Safety s = null;
    int[] allres = null;
    int np,nr;//分别是进程计数、资源计数
    int nump=0;//用于控制初始化进程状态计数
    javax.swing.table.DefaultTableModel dtm1 = new javax.swing.table.DefaultTableModel();//控制表格格式
    java.util.Vector data = new java.util.Vector();//表数据
    java.util.Vector title = new java.util.Vector();//表头
    
    public FrmMain() {
        initComponents();
        //设置表格初始化
        jTa1.setModel(dtm1);
        title.add("进程");title.add("Max");title.add("Allocation");title.add("Need");title.add("Available");
        dtm1.setDataVector(data, title);//显示表头,内容暂时为空
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPa11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCombNP = new javax.swing.JComboBox();
        chen1 = new javax.swing.JLabel();
        chen2 = new javax.swing.JLabel();
        jCombNR = new javax.swing.JComboBox();
        jBtnAck1 = new javax.swing.JButton();
        jPal2 = new javax.swing.JPanel();
        chen3 = new javax.swing.JLabel();
        jTexAllo = new javax.swing.JTextField();
        chen4 = new javax.swing.JLabel();
        jTexMax = new javax.swing.JTextField();
        jTexinit = new javax.swing.JTextField();
        jBtnAck3 = new javax.swing.JButton();
        jBtnAck2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTa1 = new javax.swing.JTable();
        chen5 = new javax.swing.JLabel();
        chen6 = new javax.swing.JLabel();
        jCombReqNP = new javax.swing.JComboBox();
        chen7 = new javax.swing.JLabel();
        jTexReqNR = new javax.swing.JTextField();
        jBtnReq = new javax.swing.JButton();
        jTexOrder = new javax.swing.JTextField();
        jBtnJudge = new javax.swing.JButton();
        jBtnReset = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTa2 = new javax.swing.JTable();
        jMenuBar = new javax.swing.JMenuBar();
        About = new javax.swing.JMenu();
        Help = new javax.swing.JMenu();
        Whatis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        JPa11.setBorder(javax.swing.BorderFactory.createTitledBorder("初始化设置"));
        JPa11.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel1.setText("进程数");
        jLabel1.setMaximumSize(new java.awt.Dimension(40, 15));
        jLabel1.setMinimumSize(new java.awt.Dimension(40, 15));

        jCombNP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "１", "２", "３", "４", "５", "６", "７", "８", "９", "１０" }));

        chen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chen1.setText("process & resource");

        chen2.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        chen2.setText("资源数");
        chen2.setMaximumSize(new java.awt.Dimension(40, 15));
        chen2.setMinimumSize(new java.awt.Dimension(40, 15));

        jCombNR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "１", "２", "３", "４", "５", "６", "７", "８", "９", "１０" }));

        jBtnAck1.setText("确定");
        jBtnAck1.setToolTipText("");
        jBtnAck1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnAck1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAck1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPa11Layout = new javax.swing.GroupLayout(JPa11);
        JPa11.setLayout(JPa11Layout);
        JPa11Layout.setHorizontalGroup(
            JPa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPa11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnAck1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPa11Layout.createSequentialGroup()
                        .addGroup(JPa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(chen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCombNP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCombNR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)))
                .addContainerGap())
        );
        JPa11Layout.setVerticalGroup(
            JPa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPa11Layout.createSequentialGroup()
                .addComponent(chen1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCombNP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPa11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chen2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPa11Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jCombNR, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jBtnAck1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPal2.setBorder(javax.swing.BorderFactory.createTitledBorder("初始化资源"));

        chen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chen3.setText("Max(最大需求)");

        jTexAllo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexAllo.setText("输入数字以空格分开");

        chen4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chen4.setText("Allocation(已分配)");

        jTexMax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexMax.setText("输入数字以空格分开");

        jTexinit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexinit.setText("输入数字以空格分开");
        jTexinit.setToolTipText("");

        jBtnAck3.setText("确定");
        jBtnAck3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAck3MouseClicked(evt);
            }
        });

        jBtnAck2.setText("确定");
        jBtnAck2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAck2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPal2Layout = new javax.swing.GroupLayout(jPal2);
        jPal2.setLayout(jPal2Layout);
        jPal2Layout.setHorizontalGroup(
            jPal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTexAllo)
            .addComponent(chen4, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
            .addComponent(jTexMax, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
            .addComponent(chen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTexinit)
            .addComponent(jBtnAck3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBtnAck2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPal2Layout.setVerticalGroup(
            jPal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPal2Layout.createSequentialGroup()
                .addComponent(jTexinit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAck3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chen3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTexMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chen4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTexAllo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAck2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTa1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTa1);

        chen5.setText("请求资源Request");

        chen6.setText("进程P");

        chen7.setText("资源：");

        jTexReqNR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexReqNR.setText("输入数字以空格分开");

        jBtnReq.setText("申请");
        jBtnReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnReqMouseClicked(evt);
            }
        });

        jTexOrder.setText("操作系统银行家算法");

        jBtnJudge.setFont(new java.awt.Font("宋体", 0, 10)); // NOI18N
        jBtnJudge.setText("安全性检查");
        jBtnJudge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnJudgeMouseClicked(evt);
            }
        });

        jBtnReset.setText("重置所有数据");
        jBtnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnResetMouseClicked(evt);
            }
        });

        jTa2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "进程", "Work", "Need", "Allocation", "Work+Allocation", "Finish"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTa2.setMaximumSize(new java.awt.Dimension(450, 144));
        jTa2.setMinimumSize(new java.awt.Dimension(450, 144));
        jScrollPane3.setViewportView(jTa2);

        About.setText("关于");
        jMenuBar.add(About);

        Help.setText("帮助");

        Whatis.setText("什么是银行家算法");
        Help.add(Whatis);

        jMenuBar.add(Help);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPa11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chen5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chen6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCombReqNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chen7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTexReqNR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnReq, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnJudge, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTexOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnReset)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chen5)
                    .addComponent(chen6)
                    .addComponent(jCombReqNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chen7)
                    .addComponent(jTexReqNR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnReq, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTexOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnJudge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPa11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //初始化进程、资源的数目
    private void jBtnAck1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAck1MouseClicked
        // TODO add your handling code here:
        np = jCombNP.getSelectedIndex()+1;//设置的进程数量
        nr = jCombNR.getSelectedIndex()+1;//设置的资源数量
        p = new Myprocess[np]; //这里只是初始化有多少个类数组
        r = new Myresource[nr];
        
        for(int i = 0;i < np;i++){
            p[i] = new Myprocess();//这里才是实例化
            p[i].setNr(nr);//初始化进程对象，有多少种资源
        }

        for(int i=0;i<np;i++)
        jCombReqNP.addItem(i);
        
        JOptionPane.showMessageDialog(FrmMain.this, "进程数："+np+"\t资源数："+nr+"\n"+"请在下方设置进程资源状态");
    }//GEN-LAST:event_jBtnAck1MouseClicked
    //初始化资源状态
    private void jBtnAck3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAck3MouseClicked
        // TODO add your handling code here:
        allres = OP.toInt(jTexinit.getText(), nr);//将文本框中信息转化为int类型数组
        for(int i = 0;i < nr;i++){
             r[i] = new Myresource(allres[i]);//这里才是实例化
        }

        JOptionPane.showMessageDialog(FrmMain.this, "资源总数设置完成");
    }//GEN-LAST:event_jBtnAck3MouseClicked
    //初始化每个进程的具体状态
    private void jBtnAck2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAck2MouseClicked
        // TODO add your handling code here:
            p[nump].setMaxNeed(OP.toInt(jTexMax.getText(), nr));
            p[nump].setAllocation(OP.toInt(jTexAllo.getText(), nr));
            p[nump].setNeed(OP.getNeed(p[nump]));
            if( !OP.compare( p[nump].getMaxNeed() , allres) ){
            	JOptionPane.showMessageDialog(FrmMain.this, "设置出错，最大需求数不能超过资源总数");
            	jTexMax.requestFocus();//获得焦点
            	return;
            }
            if( !OP.compare( p[nump].getAllocation() , p[nump].getMaxNeed()) ){
            	JOptionPane.showMessageDialog(FrmMain.this, "设置出错，已分配资源不能超过最大需求数");
            	jTexAllo.requestFocus();//获得焦点
            	return;
            }
            //向表格中填充信息
            java.util.Vector line = new java.util.Vector();
            line.add("P"+nump);
            line.add(OP.toString(p[nump].getMaxNeed()));//从对象中获得数据，转化后显示到表格中
            line.add(OP.toString(p[nump].getAllocation()));
            line.add(OP.toString(p[nump].getNeed()));
            data.add(line);
            //更新表格
            dtm1.setDataVector(data, title);
            JOptionPane.showMessageDialog(FrmMain.this, "进程P"+nump+"参数设置完成\n请进行下一个进程资源设置");
                       
            if(nump == np-1){//所有设置完成
                s = new Safety(np,nr,p,r);
                
                JOptionPane.showMessageDialog(FrmMain.this, "所有参数设置已经完成");
                jBtnReq.setVisible(true);jBtnJudge.setVisible(true);
                //从表格的DefaultTableModel获取vector
                java.util.Vector vec = dtm1.getDataVector();//获取第一层vector--->>data
                vec = (java.util.Vector)vec.get(0);//获取第二层vector------>>line
                //通过修改向量vector跟新表格
                s.setAvailable(s.getAvailable());
                vec.set(4 ,(String) OP.toString( s.available ) );
                jTa1.repaint();//更新表格视图
                nump = 0;jBtnAck2.setVisible(false);
                return;
            }
            else
                nump++;//设置下一个资源
    }//GEN-LAST:event_jBtnAck2MouseClicked
//重置按钮的功能
    private void jBtnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnResetMouseClicked
        // TODO add your handling code here:
        p = null;
        r = null;
        s = null;
        allres = null;
        np = 0;
        nr = 0;
        nump = 0;
        //jBtnReq.setVisible(false);jBtnJudge.setVisible(false);
        jTexinit.setText("输入数字以空格分开");jTexMax.setText("输入数字以空格分开");jTexAllo.setText("输入数字以空格分开");
        jTexReqNR.setText("输入数字以空格分开");jTexOrder.setText("操作系统银行家算法");
        //清空表格
    }//GEN-LAST:event_jBtnResetMouseClicked
    //安全性检查按钮
    private void jBtnJudgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnJudgeMouseClicked
        // TODO add your handling code here:
        if(s==null)
            s = new Safety(np,nr,p,r);
        int[] order = s.judge();
        String[][] ss = s.table;
        for(int i=0;i<np;i++){
            
            jTa2.setValueAt("P"+order[i], i, 0);
            for(int j=0;j<5;j++){
               jTa2.setValueAt(ss[i][j], i, j+1);
            }
        } 
        if( order != null){
            jTexOrder.setText( "存在安全序列:"+OP.toString(order) );
        }
        else{
            jTexOrder.setText("系统处于不安全状态");
        }
        
    }//GEN-LAST:event_jBtnJudgeMouseClicked
    //请求资源按钮
    private void jBtnReqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnReqMouseClicked
        // TODO add your handling code here:
        int tempp = jCombReqNP.getSelectedIndex();
        int[] tempreq = OP.toInt( jTexReqNR.getText() , nr);
        if(s==null)
            s = new Safety(np,nr,p,r);
        int flag = s.request(p[tempp], tempreq);//请求,看会返回什么

        if(flag==0){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
            if( s.judge() !=  null){
                jTexOrder.setText("可以进行资源分配且存在安全序列:"+OP.toString(s.judge()));
            }
            else{
                jTexOrder.setText("尝试资源分配......"+"资源分配不成功");
            }
        }
        if(flag==-1){
                jTexOrder.setText("请求小于大于需要,不合理!");
        }
        if(flag==-2){
                jTexOrder.setText("请求大于可利用,该进程等待!");
        }               
    }//GEN-LAST:event_jBtnReqMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JMenu Help;
    private javax.swing.JPanel JPa11;
    private javax.swing.JMenuItem Whatis;
    private javax.swing.JLabel chen1;
    private javax.swing.JLabel chen2;
    private javax.swing.JLabel chen3;
    private javax.swing.JLabel chen4;
    private javax.swing.JLabel chen5;
    private javax.swing.JLabel chen6;
    private javax.swing.JLabel chen7;
    private javax.swing.JButton jBtnAck1;
    private javax.swing.JButton jBtnAck2;
    private javax.swing.JButton jBtnAck3;
    private javax.swing.JButton jBtnJudge;
    private javax.swing.JButton jBtnReq;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JComboBox jCombNP;
    private javax.swing.JComboBox jCombNR;
    private javax.swing.JComboBox jCombReqNP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPal2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTa1;
    private javax.swing.JTable jTa2;
    private javax.swing.JTextField jTexAllo;
    private javax.swing.JTextField jTexMax;
    private javax.swing.JTextField jTexOrder;
    private javax.swing.JTextField jTexReqNR;
    private javax.swing.JTextField jTexinit;
    // End of variables declaration//GEN-END:variables
}
