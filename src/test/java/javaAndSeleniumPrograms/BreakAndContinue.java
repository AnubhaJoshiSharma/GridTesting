package javaAndSeleniumPrograms;

public class BreakAndContinue {

public static void main(String[] args) {
	int i=10;
	
for(int x=1;x<=i;x++) {
if(i%x==0) {
	continue;
}
else {
	System.out.println(x);
	break;
}
}
}
}
