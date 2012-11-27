

public class MyTeacher extends Teacher{

//	public class Student{
//	    private String name;
//	    private int sex; //男の子:1  女の子:2
//
//	    public Student(String name,int sex){
//	        this.name = name;
//	        this.sex = sex;
//	    }
//	    public String getName(){
//	        return name;
//	    }
//	    public int getSex(){
//	        return sex;
//	    }
//	}
//
//	public class StudentList{
//	    protected Student[] students;
//	    private int last = 0;
//
//	    public StudentList(){}
//	    public StudentList(int studentCount){
//	        this.students = new Student[studentCount];
//	    }
//
//	    public void add(Student student){
//	        students[last] = student;
//	        last++;
//	    }
//	    public Student getStudentAt(int index){
//	        return students[index];
//	    }
//	    public int getLastNum(){
//	        return last;
//	    }
//	}
//
//	public abstract class Teacher{
//	    protected StudentList studentList;
//
//	    public abstract void createStudentList();
//	    public abstract void callStudents();
//	}



		public MyTeacher(){
			this.studentList = new StudentList(5);
		}

		public void createStudentList(){
			studentList.add(new Student("赤井亮太",1));
			studentList.add(new Student("赤羽里美",2));
			studentList.add(new Student("岡田美央",2));
			studentList.add(new Student("西森俊介",1));
			studentList.add(new Student("中ノ森玲菜",2));

		}
		public void callStudents(){
			int count = studentList.getLastNum();
			for(int i = 0; i < count; i++){
				System.out.println(studentList.getStudentAt(i).getName());
			}
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Teacher you = new MyTeacher();
	     you.createStudentList();
	     you.callStudents();

	}

}
