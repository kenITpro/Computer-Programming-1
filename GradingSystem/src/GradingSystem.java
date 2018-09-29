import java.util.*;


public class GradingSystem {
	public static void main(String[] args)
	{
Scanner input = new Scanner(System.in);
        
        //allow user  input for quiz;
        
        System.out.println("GRADES FOR QUIZZES:");
        System.out.println("How many number of Quizzes");
        System.out.println("do you want to enter" );
            int num = input.nextInt();
            int quizinput[] = new int[num];
            int quizlength = quizinput.length;
        
        //input the quiz grade into a array
        
        System.out.println("Enter the " + num + " scores of Quizzes:");
        for (int i = 0 ; i < quizlength; i++ ) 
            
            {
           quizinput[i] = input.nextInt();
            }
        
        //computing the array of quizzes
        
            int sum = 0;
        for (int i : quizinput)
        {
            sum += i;
        }
            double quizaverage = sum / quizlength;
            double quizsum = sum;
            double quizraw = quizaverage*.3;
            
        //show the list of array elements
        
        System.out.println("Your Scores in Quizzes are: ");
        printArray(quizinput);
        
        //QUIZZES ARE 30% OF THE TOTAL GRADE
        
        System.out.println("TOTAL SCORE FOR " + num + " QUIZZES IS: " + quizsum);
        System.out.println("AVERAGE SCORE FOR " + num + " QUIZZES IS: " + quizaverage);
        System.out.println("RAW SCORE FOR " + num + " QUIZZES IS: " + quizraw + "\n");
        System.out.println("------------------------------------");
        
        /* Recitation*/
        
        System.out.println("GRADES FOR RECITATION:");
        
        //allow user  input for recitation;
        
        System.out.println("How many numbers of Recitations");
        System.out.println("do you want to enter?");
        num = input.nextInt();
            int [] recitationinput = new int[num];
            int recitationlength = recitationinput.length;
        
        //input the recitation grade into a array
        
        System.out.println("Enter the " + num + " scores of Recitation:");
        for (int i = 0 ; i < recitationlength; i++ ) 
        {
           recitationinput[i] = input.nextInt();
        }
        
        //computing the array of recitation
        
            int sumrec = 0;
        for (int i : recitationinput)
        {
            sumrec += i;
        }
            double recitationresult = sumrec;
            double recitationave = sumrec/recitationlength;
            double recitationraw = recitationave*.3;
            
        //show the list of array elements
        
        System.out.println("Your Scores in Recitations are: ");
        printArray(recitationinput);
        
        //RECITATIONS ARE 30% OF THE TOTAL GRADE
        
        System.out.println("TOTAL SCORE FOR " + num + " RECITATIONS IS: " + recitationresult);
        System.out.println("AVERAGE SCORE FOR " + num + " RECITATIONS IS: " + recitationave);
        System.out.println("RAW SCORE FOR " + num + " RECITATION IS: " + recitationraw +"\n");
        System.out.println("------------------------------------");
        
        /*Exam*/
        
        System.out.println("GRADES FOR EXAMINATION: ");
        
        //allow user  input for exam;
        
        System.out.println("How many numbers of Examination");
        System.out.println("do you want to enter?");
        num = input.nextInt();
            int [] examinput = new int[num];
            int examlength = examinput.length;
        
        //input the exam grade into a array
        
        System.out.println("Enter the " + num + " scores of Examination:");
        for (int i = 0 ; i < examlength; i++ ) 
        {
           examinput[i] = input.nextInt();
        }
        
        //computing the array of exams
        
            int sumexam = 0;
        for (int i : examinput)
        {
            sumexam += i;
        }
            double examresult = sumexam;
            double examave = sumexam/examlength;
            double examraw = examave*.4;
        
        //show the list of array elements
        
        System.out.println("Your Score in Examination is: ");
        printArray(examinput);
        
        //EXAMINATIONS ARE 40% OF THE TOTAL GRADE
        
        System.out.println("TOTAL SCORE FOR " + num + " EXAMINATION IS: " + examresult);
        System.out.println("AVERAGE SCORE FOR " + num + " EXAMINATION IS: " + examave);
        System.out.println("RAW SCORE FOR " + num + " EXAMINATION IS: " + examraw);
        System.out.println("------------------------------------");
        
        //identifying if the grade is passed or failed
        
        double totalgrade = quizraw + recitationraw + examraw;
        System.out.println("You got a raw score of " +quizraw+ " in QUIZ ");
        System.out.println("You got a raw score of " +recitationraw+ " in RECITATION");
        System.out.println("You got a raw score of " +examraw+ " in EXAMINATION");
        System.out.println("You got total raw score of " +totalgrade);
        if(totalgrade <=50)
            System.out.println("YOUR GRADE IS 5.00");
        else if(totalgrade <=79)
            System.out.println("YOUR GRADE IS 2.75");
        else if(totalgrade <= 82)
            System.out.println("YOUR GRADE IS 2.5");
        else if(totalgrade <=85)
            System.out.println("YOUR GRADE IS 2.25");
        else if(totalgrade <=88)
            System.out.println("YOUR GRADE IS 2.00");
        else if(totalgrade <=90)
            System.out.println("YOUR GRADE IS 1.75");
        else if(totalgrade <=93)
            System.out.println("YOUR GRADE IS 1.50");
        else if(totalgrade <=97)
            System.out.println("YOUR GRADE IS 1.25");
        else if(totalgrade <=100)
            System.out.println("YOUR GRADE IS 1.00");
        else
            System.out.println("YOUR GRADE IS 3.00");
		
	}
	  //showing the list of element in array
    
    public static void printArray(int arr[])
    {

        int n = arr.length;

        for (int i = 0; i < n; i++) 
            {
            System.out.println(arr[i] + " ");
            }
    
    }
}