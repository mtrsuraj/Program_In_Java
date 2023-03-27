package org.techinfo;


public class JClass {

	public static void main(String[] args) {
		Students st = new Students();
		st.createDatabase();
		st.createTable();
		st.createDatabase();
		st.createStData();
		st.readData();
		st.updateData();
		st.deletData();
		
		
	}

}
