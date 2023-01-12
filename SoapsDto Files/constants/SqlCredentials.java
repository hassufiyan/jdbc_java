package com.xworkz.constants;

public enum SqlCredentials {
	

		
		URL("jdbc:mysql://localhost:3306/ Xworkz"),USERNAME("root"),PASSWORD("Xworkzodc@123");

		public String value;
		
		SqlCredentials(String value) {
			this.value=value;
		}

		public String getValue(String value) {
			return value;
		}
		
		
	}



