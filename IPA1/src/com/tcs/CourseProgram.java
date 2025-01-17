package com.tcs;
import java.util.*;
public class CourseProgram {
	public static int findAvgOfQuizByAdmin(ArrayList<Course>list,String admin)
	{int sum=0;
	int count=0;
		if(list.isEmpty())
		{
			return 0;
		}
		for(Course val:list)
		{
			if(val.getCourse_Admin().equals(admin))
			{
				sum+=val.getQuiz();
				count++;
			}
		}
		int avg=0;
		if(count!=0)
		{
			avg=sum/count;

		}
		return avg;
		}
	
	public static ArrayList<Course>sortCourseByHandsOn(ArrayList<Course>list, int handsonLimit)
	{ArrayList<Course>sortlist= new ArrayList<>();
		 for(Course val:list)
		 {
			 if(val.getHandson()<handsonLimit)
			 {
				 sortlist.add(val);
			 }
		 }
		Collections.sort(sortlist,new Comparator<Course>() {
			public int compare(Course c1, Course c2) {
	            return Integer.compare(c1.getHandson(), c2.getHandson());
	        }
			
		});
		return sortlist;
	}
	public static void main(String[]args)
	{Scanner sc= new Scanner(System.in);
		ArrayList<Course>list=new ArrayList<>();
		// System.out.println("Enter Data");
		// for(int i=0;i<4;i++)
		// {
		// 	int courseid=sc.nextInt();
		// 	sc.nextLine();
		// 	String courseName=sc.nextLine();
		// 	String courseAdmin=sc.nextLine();
			
		// 	int quiz=sc.nextInt();sc.nextLine();
		// 	int handson=sc.nextInt();sc.nextLine();
		// 	list.add(new Course(courseid,courseName,courseAdmin,quiz,handson));
			
					
		// }
		list.add(new Course(111, "kubernetes", "Nisha", 40, 10));
        list.add(new Course(321, "cassandra", "Roshini", 30, 15));
        list.add(new Course(457, "Apache Spark", "Nisha", 30, 12));
        list.add(new Course(987, "site core", "Tirth", 50, 20));
        list.add(new Course(999, "Nisha", "", 0, 17));
		System.out.print("Enter the admin name to find average quiz: ");
        String adminName = sc.nextLine();
        int avgQuiz = findAvgOfQuizByAdmin(list, adminName);
        if(avgQuiz==0)
        {
        	System.out.println("Not Found");
        	
        }
        else {
        	System.out.println(avgQuiz);
        }
        
        System.out.println("Enter hands-on : ");
        int handsonLimit = sc.nextInt();
        ArrayList<Course> sortedCourses = sortCourseByHandsOn(list, handsonLimit);
		if (sortedCourses.isEmpty()) {
            System.out.println("No Course found ");
        } else {
            for (Course course : sortedCourses) {
                System.out.println(course.getcourse_Name());
            }
        }
		sc.close();
    
	}
	

}
