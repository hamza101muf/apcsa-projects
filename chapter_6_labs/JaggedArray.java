/* 
 * Hamza Mufti
 * Jagged Array project
 * 1/31/2023
 */
import java.text.DecimalFormat;
import java.util.Scanner;
  
public class JaggedArray {
  public static void main(String[] args) {
    int count = 0;
    int maxPitch = Integer.MIN_VALUE;
    int minPitch = Integer.MAX_VALUE;
    int total = 0;
    String report="";
    int more = 1;
    DecimalFormat fmt = new DecimalFormat("#.##");
    Scanner scan = new Scanner(System.in);
    
    
    int[] [] pitchArray = { 
      {45, 105, 67},
      {81, 100, 93, 25, 128, 88},
      {45, 53},
      {79, 107, 53, 79},
      {11, 9, 3, 63, 20, 18, 3} };
    String[] reports = new String[pitchArray.length];
    for (int r=0;r<pitchArray.length;r++) {
      count = 0;
      maxPitch = Integer.MIN_VALUE;
      minPitch = Integer.MAX_VALUE;
      total = 0;
      for (int c=0;c<pitchArray[r].length;c++) {
        count++;
        if (pitchArray[r][c]>maxPitch)
          maxPitch = pitchArray[r][c];
        if (pitchArray[r][c]<minPitch)
          minPitch = pitchArray[r][c];
        total += pitchArray[r][c];
        
      }
      report = "Pitcher #"+(r+1)+" pitched "+
                           count+" games. Their largest pitch was: "
        +maxPitch+". Their smallest pitch was: "+minPitch
                             +". Pitch Total: "+total
                           +" Average Pitch: "+ fmt.format(total/(double)count);
      reports[r]=report;
      System.out.println(report);
    }
     
    while (more!=-1) {
      System.out.print("Which player would you like statistics for: ");
      report = reports[scan.nextInt()-1];
      System.out.print(report+"\n Would you like to continue (-1 to quit, any other number for yes");
      more = scan.nextInt();
      
    }  
    
    scan.close();
  }
}
        
                                        