public void input_data() {
    try {
        String jk = jRadioButton1.isSelected() ? "L" : "P";

        String sql = "INSERT INTO data_mhs VALUES ('" 
        + jTextField1.getText() + "','" 
        + jTextField2.getText() + "','" 
        + jk + "','" 
        + jComboBox1.getSelectedItem().toString() + "','" 
        + jTextField3.getText() + "','" 
        + jTextField4.getText() + "','" 
        + jTextField5.getText() + "')"; 
        
        st.execute(sql);
        clean_form();
        load_data();
        JOptionPane.showMessageDialog(null, "Data Mahasiswa Berhasil Diinput");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
