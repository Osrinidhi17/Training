package com.day4.oops;

import java.io.Serializable;

public class ReflectionApiEx implements Serializable, Cloneable{
		
		private Integer empId;
		private String name;
		private String add;
		private ReflectionApiEx() {
			super();
		}
		public ReflectionApiEx (Integer empId, String name, String add) {
			super();
			this.empId= empId;
			this.name= name;
			this.add= add;
	}

		public void addReflectionApiEx()
{
			}
		public void searchReflectionApiEx(Integer empId) {
			
		}
}
