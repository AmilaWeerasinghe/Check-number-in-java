
import java.util.*;
public class E15385lab01q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
System.out.print("Enter a number:");
String word1,word2 = null,word3 = null,word4; //Create four string for four outputs
int number = keyboard.nextInt();
if(number%15==0){ word1="special";}//check weather it is special
else { word1="not special";}
if( number>999){word3="big";}//check weather it is big
else{word3="not big";}
if(number%5==0&&number%6==0&&number%18!=0){word2="weird";} //check weather it is weird
else{word2="not weird";}
if(word3=="big"||word2=="weird"){word4="scary";}//check weather it is scary
else{word4="not scary";}
 
// strings ae compared in oder to check the all possible outcome combinations
//Then outcomes are printed as given in the sample test cases

if(word1=="special" && word4!="scary"){
	System.out.println(number+" is "+" "+word1+", but "+word4+".");
}
if(word1=="special" && word3!="big"&& word2=="weird"){
	System.out.println(number+" is "+word1+", "+word2+", "+word4+", but "+word3+".");
}
if(word1=="special" && word3=="big" && word2!="weird"){
	System.out.println(number+" is "+word1+" , "+word3+", "+word4+", but "+word2+".");
}
if(word1!="special" && word3=="big" && word2!="weird"){
	System.out.println(number+" is "+word3+", "+word4+", but "+word2+".");
}
if(word1!="special" && word3!="big" && word2=="weird"){
	System.out.println(number+" is "+word2+", "+word4+", but "+word3+".");
}
if(word1!="special" && word3!="big" && word2!="weird"){
	System.out.println(number+" is "+word4+".");
}
if(word1=="special" && word3=="big" && word2=="weird"){
	System.out.println(number+" is "+word1+", "+word3+", "+word2+", "+word4+".");
}


keyboard.close();
	}

}
