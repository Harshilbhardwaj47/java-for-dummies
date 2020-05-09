import java.util.Scanner

public class lift{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Etner the max no of floors:- ");
		int tf=in.nextInt();
		int A=0,B=tf;
		System.out.println("Enter the number of test cases that you want to run");
		int test = in.nextInt();
		for (int i = 0; i < test; i++) {
			lift_function(lift_A, lift_B, top_floor);
		}
	}
	public static void lift_function(int A, int B, int tf)
{
	Scanner inp=new Scanner(System.in);
	System.out.println("Which floor :- ");
	int call=inp.nextInt();
	if(call<=tf) {
		if(call>A && call<B) {
			if(call-A < B-call) {
				System.out.println("Lift");
				A=call;
			}
