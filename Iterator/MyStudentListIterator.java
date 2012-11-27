
public class MyStudentListIterator implements Iterator {

	MyStudentList myStudentList;
	int index;

	MyStudentListIterator(MyStudentList list){
		myStudentList = list;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		// TODO 自動生成されたメソッド・スタブ
		if(index<myStudentList.getLastNum())
			return true;
		else
			return false;
	}

	@Override
	public Object next() {
		// TODO 自動生成されたメソッド・スタブ
		Student s = myStudentList.getStudentAt(index);
		index++;
		return s;
	}

}
