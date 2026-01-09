public class Array2{
public static void main(String args[]){
 
int marks[]={1,2,3,4,5};

int first=0, last=marks.length-1;


while(first<last){
             int temp=marks[last];
             marks[last]=marks[first];
             marks[first]=temp;
    
           first++;
           
           last--;

}
 for(int i=0; i<marks.length; i++){


  System.out.print(marks[i]+" ");
}



}}