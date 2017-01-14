package HackerRank.java;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		Double cgpa1=s1.getCgpa();
		Double cgpa2=s2.getCgpa();
		
		String StudentName1 = s1.getFname().toUpperCase();
	    String StudentName2 = s2.getFname().toUpperCase();
	   
	    Integer id1=s1.getId();
	    Integer id2=s2.getId();
	    
	    int c=0;
	    if(cgpa2>cgpa1)
	    	c=1;
	    else if(cgpa1>cgpa2)
	    	c=-1;
	    	else if(StudentName1.compareTo(StudentName2)==0)
	    	{
	    		c=id2.compareTo(id1);
	    	}
	    	else
	    		c=StudentName1.compareTo(StudentName2);
	    
	    		return c;
		//return b.getCGPA().compareTo(a.getCGPA()) ;
	}

}
