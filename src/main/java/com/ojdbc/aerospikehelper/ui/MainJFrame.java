/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ojdbc.aerospikehelper.ui;

import com.ojdbc.aerospikehelper.bean.Connections;
import com.ojdbc.aerospikehelper.bean.ConnectionInfo;
import com.ojdbc.aerospikehelper.bean.ConnectionInfo_set;
import com.ojdbc.aerospikehelper.bean.ConnectionInfo_namespace;
import com.ojdbc.aerospikehelper.util.AerospikeDAO;
import com.ojdbc.aerospikehelper.util.StackUtil;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Arthur
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        init();

    }

    public void init() throws HeadlessException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(screenSize.width, screenSize.height - 20));
        dao = new AerospikeDAO();
        model = (DefaultTreeModel) dbList.getModel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Connections", true);
        model.setRoot(root);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        dbList = new javax.swing.JTree();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        add_connectJBN = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        del_connJBN = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        closeTabJBN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AerospikeHelper");

        jSplitPane1.setDividerLocation(-800);
        jSplitPane1.setDividerSize(5);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        dbList.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        dbList.setAutoscrolls(true);
        dbList.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
            public void treeExpanded(javax.swing.event.TreeExpansionEvent evt) {
                dbListTreeExpanded(evt);
            }
            public void treeCollapsed(javax.swing.event.TreeExpansionEvent evt) {
            }
        });
        dbList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dbListMouseReleased(evt);
            }
        });
        dbList.addTreeWillExpandListener(new javax.swing.event.TreeWillExpandListener() {
            public void treeWillExpand(javax.swing.event.TreeExpansionEvent evt)throws javax.swing.tree.ExpandVetoException {
                dbListTreeWillExpand(evt);
            }
            public void treeWillCollapse(javax.swing.event.TreeExpansionEvent evt)throws javax.swing.tree.ExpandVetoException {
            }
        });
        jScrollPane1.setViewportView(dbList);

        jSplitPane1.setLeftComponent(jScrollPane1);
        jSplitPane1.setRightComponent(jTabbedPane1);

        jToolBar1.setRollover(true);

        add_connectJBN.setText("Add...");
        add_connectJBN.setFocusable(false);
        add_connectJBN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add_connectJBN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add_connectJBN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                add_connectJBNMouseReleased(evt);
            }
        });
        jToolBar1.add(add_connectJBN);

        jSeparator2.setSize(new java.awt.Dimension(11, 5));
        jToolBar1.add(jSeparator2);

        del_connJBN.setText("Del");
        del_connJBN.setFocusable(false);
        del_connJBN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        del_connJBN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        del_connJBN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                del_connJBNMouseReleased(evt);
            }
        });
        jToolBar1.add(del_connJBN);
        jToolBar1.add(jSeparator1);

        closeTabJBN.setText("Close Tab");
        closeTabJBN.setFocusable(false);
        closeTabJBN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        closeTabJBN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        closeTabJBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeTabJBNActionPerformed(evt);
            }
        });
        jToolBar1.add(closeTabJBN);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_connectJBNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_connectJBNMouseReleased
        showDialog();

    }//GEN-LAST:event_add_connectJBNMouseReleased

    private void dbListTreeExpanded(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_dbListTreeExpanded
        //do nothing
    }//GEN-LAST:event_dbListTreeExpanded

    private void dbListTreeWillExpand(javax.swing.event.TreeExpansionEvent evt)throws javax.swing.tree.ExpandVetoException {//GEN-FIRST:event_dbListTreeWillExpand

    }//GEN-LAST:event_dbListTreeWillExpand

    private void dbListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbListMouseReleased
        if (evt.getClickCount() != 2) {
            return;
        }
        int n = dbList.getRowForLocation(evt.getX(), evt.getY());
        if (n < 0) {
            return;
        }

        DefaultMutableTreeNode selNode = getNodeByIndexRowNum(n);

        switch (selNode.getLevel()) {
            case 1:
                getNamspaces(selNode);
                break;
            case 2:
                getSets(selNode);
                break;
            case 3:
                addCard((ConnectionInfo_set) selNode.getUserObject());
                break;

        }
        dbList.updateUI();
        dbList.expandRow(n);

    }//GEN-LAST:event_dbListMouseReleased
    public boolean getSets(DefaultMutableTreeNode selNode) {
        ConnectionInfo_namespace ci = (ConnectionInfo_namespace) selNode.getUserObject();
        List<String> sets = null;
        try {
            sets = Connections.getSets(ci);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Connect failed:\n" + StackUtil.getStackTrace(e));
            return true;
        }
        for (String set : sets) {
            ConnectionInfo_set ci_n = new ConnectionInfo_set(ci.getName(), ci.getIp(), ci.getPort(), ci.getNamespace(), set);
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(ci_n, false);
            selNode.add(node);
            ci.getSets().add(ci_n);
        }
        return false;
    }

    public boolean getNamspaces(DefaultMutableTreeNode selNode) throws HeadlessException {
        ConnectionInfo ci = (ConnectionInfo) selNode.getUserObject();
        List<String> nameSpaces = null;
        try {
            nameSpaces = Connections.getNameSpaces(ci);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Connect failed:\n" + StackUtil.getStackTrace(e));
            return true;
        }
        for (String namespace : nameSpaces) {
            ConnectionInfo_namespace ci_n = new ConnectionInfo_namespace(ci.getName(), ci.getIp(), ci.getPort(), namespace);
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(ci_n, true);
            selNode.add(node);
        }
        return false;
    }

    private void del_connJBNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_del_connJBNMouseReleased
        int count = dbList.getSelectionCount();
        if (count == 0) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int row : dbList.getSelectionRows()) {
            DefaultMutableTreeNode selNode = getNodeByIndexRowNum(row);
            if (selNode.getLevel() == 1) {
                selNode.removeFromParent();
                dbList.updateUI();
            }

        }
    }//GEN-LAST:event_del_connJBNMouseReleased

    private void closeTabJBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeTabJBNActionPerformed
        int idx=jTabbedPane1.getSelectedIndex();
        if(idx!=-1){
            jTabbedPane1.remove(idx);
        }
    }//GEN-LAST:event_closeTabJBNActionPerformed

    public DefaultMutableTreeNode getNodeByIndexRowNum(int row) {
        TreePath selTree = dbList.getPathForRow(row);
        DefaultMutableTreeNode selNode = (DefaultMutableTreeNode) selTree.getLastPathComponent();
        return selNode;
    }

    public void showDialog() {
        ConnectionInfo ci = new ConnectionInfo();
        CountDownLatch cdl = new CountDownLatch(1);
        ConnectDialog dialog = new ConnectDialog(this, true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.setVisible(false);
                cdl.countDown();
            }
        });
        
        dialog.getOkJBT().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                String name_ui = dialog.getNameJTF().getText();
                if (name_ui == null || name_ui.length() == 0) {
                    JOptionPane.showMessageDialog(dialog, "name can not be null");
                    return;
                }
                if (Connections.allConnections.containsKey(name_ui)) {
                    JOptionPane.showMessageDialog(dialog, "name already exists");
                    return;
                }
                String ip_ui = dialog.getIpJTF().getText();
                if (ip_ui == null || ip_ui.length() == 0) {
                    JOptionPane.showMessageDialog(dialog, "ip can not be null");
                    return;
                }

                Object port_ui = dialog.getPortJSP().getValue();
                if (port_ui == null) {
                    JOptionPane.showMessageDialog(dialog, "ip can not be null");
                    return;
                }

                ci.setName(name_ui);
                ci.setIp(ip_ui);
                ci.setPort((int) port_ui);
                dialog.setVisible(false);
                cdl.countDown();
            }
        });
        dialog.getCancelJBT().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dialog.setVisible(false);
                cdl.countDown();
            }
        });
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        try {
            cdl.await();
        } catch (InterruptedException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(ci, true);
        root.add(node);
        dbList.updateUI();
        dbList.expandRow(0);
        Connections.all.add(ci);
    }

    private void addCard(ConnectionInfo_set ci) {
        ViewerJPanel vjp = new ViewerJPanel();
        vjp.setConnectionInfo_all(ci);
        jTabbedPane1.addTab(ci.toString()+"["+ci.getName()+"]", vjp);
        jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount()-1);
    }

    private AerospikeDAO dao;
    private DefaultTreeModel model;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_connectJBN;
    private javax.swing.JButton closeTabJBN;
    private javax.swing.JTree dbList;
    private javax.swing.JButton del_connJBN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
