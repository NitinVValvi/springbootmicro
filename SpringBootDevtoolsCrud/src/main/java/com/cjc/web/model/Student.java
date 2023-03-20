package com.cjc.web.model;

public class Student {

		private int sid;
		private String sname;
		private String username;
		private String password;
		private long mobno;
		private String city;
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public long getMobno() {
			return mobno;
		}
		public void setMobno(long mobno) {
			this.mobno = mobno;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", username=" + username + ", password=" + password
					+ ", mobno=" + mobno + ", city=" + city + "]";
		}
		 
}
