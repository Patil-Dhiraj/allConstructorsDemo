package com.constructorsdemo.in;



 class Student {
		
		private String name;
		private int age;
		private String major;
		private double gpa;
		private boolean isFullTime;
		
			Student() {
				name = "unknown";
				age = 18;
				major = "Undeclared";
				gpa = 0.0;
				isFullTime = true;
				
			}
			
			Student(String name, int age) {
				this.name = name;
				this.age = age;
				this.major = "Undeclared";
				this.gpa = 0.0;
				this.isFullTime = true;
			}
			
			// Parameterized Constructor 2
		    public Student(String name, int age, String major) {
		        this.name = name;
		        this.age = age;
		        this.major = major;
		        this.gpa = 0.0;
		        this.isFullTime = true;
		    }
			
			Student( String name, int age, String major, double gpa, boolean isFullTime) {
				this.name = name;
				this.age = age;
				this.major = major;
				this.gpa = gpa;
				this.isFullTime = isFullTime;
			}
			
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			
			
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			
			
			public String getMajor() {
				return major;
			}
			public void setMajor(String major) {
				this.major = major;
			}
			
			
			public double getGpa() {
				return gpa;
			}
			public void setGpa(double gpa) {
				this.gpa = gpa;
			}
			
			
			public boolean getisFullTime() {
				return isFullTime;
			}
			public void setisFullTime(boolean isFullTime) {
				this.isFullTime = isFullTime;
			}

	}

			
			
	class TestStudent {		

		public static void main(String[] args) {
					// TODO Auto-generated method stub
					Student st = new Student();
					
					System.out.println(" Default Constructor ");
					System.out.println("Name = "+st.getName());
					System.out.println("Age: " + st.getAge());
			        System.out.println("Major: " + st.getMajor());
			        System.out.println("GPA: " + st.getGpa());
			        System.out.println("Is Full Time: " + st.getisFullTime());
			        System.out.println();
			        
			        // Parameterized Constructor.....
			        Student st1 = new Student("Dhiraj Patil", 25);
			        System.out.println("Parameterized Constructor 1 :");
			        System.out.println("Name: " + st1.getName());
			        System.out.println("Age: " + st1.getAge());
			        System.out.println("Major: " + st1.getMajor());
			        System.out.println("GPA: " + st1.getGpa());
			        System.out.println("Is Full Time: " + st1.getisFullTime());
			        System.out.println();
					
			        //
			        Student st2 = new Student("Suraj Patil", 24, "Computer Science");
			        System.out.println("Parameterized Constructor 2 :");
			        System.out.println("Name: " + st2.getName());
			        System.out.println("Age: " + st2.getAge());
			        System.out.println("Major: " + st2.getMajor());
			        System.out.println("GPA: " + st2.getGpa());
			        System.out.println("Is Full Time: " + st2.getisFullTime());
			        System.out.println();
			        
			        //
			        Student st3 = new Student("Mohit Desai", 23, "IT", 4.5, false);
			        System.out.println("Parameterized Constructor 3 :");
			        System.out.println("Name: " + st3.getName());
			        System.out.println("Age: " + st3.getAge());
			        System.out.println("Major: " + st3.getMajor());
			        System.out.println("GPA: " + st3.getGpa());
			        System.out.println("Is Full Time: " + st3.getisFullTime());
			
			
		}

		

}
