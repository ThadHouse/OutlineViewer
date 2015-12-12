/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.tableviewer.dialog;

import edu.wpi.first.wpilibj.tables.ITable;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Sam
 */
public class AddArrayDialog extends AbstractAddDialog {

    private final DefaultCellEditor booleanEditor = new DefaultCellEditor(new JComboBox<>(new String[]{"True", "False"}));

    public AddArrayDialog(TreePath path, ITable table) {
        super(path, table);
        setTitle("Add array");
        initComponents();
        setMinimumSize(getSize());
        valueTable.getColumnModel().getColumn(0).setCellEditor(booleanEditor); // default to boolean because it's first alphabetically
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        keyLabel = new javax.swing.JLabel();
        keyField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        valueTable = new javax.swing.JTable();
        cancelButton = new javax.swing.JButton();
        okayButton = new javax.swing.JButton();
        removeRowButton = new javax.swing.JButton();
        addRowButton = new javax.swing.JButton();
        typeLabel = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        keyLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        keyLabel.setText("Array name");

        valueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        valueTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(valueTable);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        okayButton.setText("OK");
        okayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okayButtonActionPerformed(evt);
            }
        });

        removeRowButton.setText("-");
        removeRowButton.setToolTipText("Remove the selected row");
        removeRowButton.setPreferredSize(new java.awt.Dimension(20, 20));
        removeRowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRowButtonActionPerformed(evt);
            }
        });

        addRowButton.setText("+");
        addRowButton.setPreferredSize(new java.awt.Dimension(20, 20));
        addRowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRowButtonActionPerformed(evt);
            }
        });

        typeLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        typeLabel.setText("Array type");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Boolean", "Number", "String", "Byte (raw)" }));
        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keyLabel)
                            .addComponent(typeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keyField)
                            .addComponent(typeComboBox, 0, 175, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(okayButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addRowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeRowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyLabel)
                    .addComponent(keyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeRowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okayButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addRowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRowButtonActionPerformed
        ((DefaultTableModel) valueTable.getModel()).insertRow(valueTable.getSelectedRow() + 1, (Object[]) null);
    }//GEN-LAST:event_addRowButtonActionPerformed

    private void removeRowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRowButtonActionPerformed
        try {
            ((DefaultTableModel) valueTable.getModel()).removeRow(valueTable.getSelectedRow());
        } catch (ArrayIndexOutOfBoundsException e) {
            ((DefaultTableModel) valueTable.getModel()).removeRow(valueTable.getModel().getRowCount() - 1);
        }
    }//GEN-LAST:event_removeRowButtonActionPerformed

    private void typeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed
        valueTable.clearSelection();
        switch (typeComboBox.getSelectedItem().toString()) {
            case "Boolean":
                for (int i = 0; i < valueTable.getRowCount(); i++) {
                    valueTable.setValueAt(null, i, 0);
                }
                valueTable.getColumnModel().getColumn(0).setCellEditor(booleanEditor);
                break;
            default:
                valueTable.getColumnModel().getColumn(0).setCellEditor(null);
                break;
        }
    }//GEN-LAST:event_typeComboBoxActionPerformed

    @Override
    public void okayButtonActionPerformed(java.awt.event.ActionEvent evt) {
        checkKey();
        try {
            final String dataType = typeComboBox.getSelectedItem().toString();
            table.putValue(keyField.getText(), createArrayData(dataType));

//            getOutline().expandPath(path);
            dispose();
        } catch (IllegalArgumentException | NullPointerException e) { // errors from createArray
            e.printStackTrace();
        }
    }

    /**
     * Creates a new array object containing the values in the
     * table, which will then be put into the Network Table associated
     * with this dialog.
     *
     * @param arrayType The type of array: Boolean, Number, or String.
     * @return An array object containing the data in the table, or
     * null if an error is present in the table (such as an invalid double
     * value).
     */
    private Object createArrayData(String arrayType) {
        int n = 0;
        for (int i = 0; i < valueTable.getRowCount(); i++) {
            Object data = valueTable.getValueAt(i, 0);
            if (data != null) {
                n++;
            }
        }
        switch (arrayType) {
            case "Boolean":
                {
                    boolean[] arr = new boolean[n];
                    n = 0;
                    for (int i = 0; i < valueTable.getRowCount(); i++) {
                        Object data = valueTable.getValueAt(i, 0);
                        if (data != null) {
                            arr[n] = data.toString().equalsIgnoreCase("true");
                            n++;
                        }
                    }
                    return arr;
                }

            case "Number":
                {
                    double[] arr = new double[n];
                    n = 0;
                    for (int i = 0; i < valueTable.getRowCount(); i++) {
                        Object data = valueTable.getValueAt(i, 0);
                        try {
                            if (data != null) {
                                arr[n] = Double.parseDouble(data.toString());
                                n++;
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(
                                    this,
                                    "Invalid double value \"" + data + "\" in row " + (i + 1),
                                    "Invalid number",
                                    JOptionPane.ERROR_MESSAGE);
                            return null;
                        }
                    }
                    return arr;
                }

            case "String":
                {
                    String[] arr = new String[n];
                    n = 0;
                    for (int i = 0; i < valueTable.getRowCount(); i++) {
                        Object data = valueTable.getValueAt(i, 0);
                        if (data != null) {
                            arr[n] = data.toString();
                            n++;
                        }
                    }
                    return arr;
                }

            case "Byte (raw)":
                {
                    byte[] arr = new byte[n];
                    n = 0;
                    for (int i = 0; i < valueTable.getRowCount(); i++) {
                        Object data = valueTable.getValueAt(i, 0);
                        try {
                            if (data != null) {
                                arr[n] = Byte.parseByte(data.toString());
                                n++;
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(
                                    this,
                                    "Invalid byte value \"" + data + "\" in row " + (i + 1),
                                    "Invalid number",
                                    JOptionPane.ERROR_MESSAGE);
                            return null;
                        }
                    }
                    return arr;
                }

            default:
                throw new IllegalArgumentException(arrayType + " is not a valid array type");
        }
    }
    // Variables declaration - do not modify
    private javax.swing.JButton addRowButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel keyLabel;
    private javax.swing.JButton okayButton;
    private javax.swing.JButton removeRowButton;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JTable valueTable;
    // End of variables declaration
}
