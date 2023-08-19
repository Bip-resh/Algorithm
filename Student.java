public class Student
{
  private String name;
  private int id;
  private double average;
  
        
   public Student (String name, int id, double average) 
   {
       this.name = name;
       this.id = id;
       if (average > 0.0)
         if (average <= 100.0)
           this.average = average;
   }
  
   public void setName(String name)
   {
   this.name = name;
   }
   
   public String getName()
   {
   return name;
   }
   
   public void setId(int studentid)
   {
      this.id = id;
   } 
   
   public int getId()
   {
   return id;
   } 
   
   public void setAverage(double studentAverage)
   {
   if (average > 0.0)
     if (average <= 100.0)
      this.average = average;
   }
   
   public double getAverage()
   {
   return average;
   }
   
   public String getLetterGrade()
   {
   String letterGrade = "";
    if (average >= 90.0)
     letterGrade = "A";
    else if (average >= 80.0)
     letterGrade = "B";
    else if (average >= 70.0)
     letterGrade = "C";
    else if (average >= 60.0)
     letterGrade = "D";
    else
     letterGrade = "F";
     
     return letterGrade;
   }
   
   
    public static void main(String[] args)
    {
        
    Student account1 = new Student("akash uddin laskar", 1, 82.2);
    Student account2 = new Student("osama bin Omi", 2, 79.4);
    Student account3 = new Student("Obro singh", 3, 84.5);
    Student account4 = new Student(" Musa yadav", 4, 87.3);
    System.out.printf("Name : %s,\t Id : %d, \t Grade : %s %n",
    account1.getName(), account1.getId(), account1.getLetterGrade());
    
    System.out.printf("Name : %s,\t Id : %d, \t Grade : %s %n",
    account2.getName(), account2.getId(), account2 .getLetterGrade());
    
    
    System.out.printf("Name : %s,\t Id : %d, \t Grade : %s %n",
    account3.getName(), account3.getId(), account3.getLetterGrade());
    
    System.out.printf("Name : %s,\t Id : %d, \t Grade : %s %n",
    account4.getName(), account4.getId(), account4.getLetterGrade());
    }
}
