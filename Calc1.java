import java.io.*;
class Calc1{
   public static void main (String[] args)throws IOException{
	System.out.println("次のように入力してください。");
	System.out.println(" 整数Enter演算子Enter整数Enter演算子Enter整数");

	BufferedReader br =
	  new BufferedReader(new InputStreamReader(System.in));

	String X = br.readLine();
	String A = br.readLine();
	String Y = br.readLine();
	String B = br.readLine();
	String Z = br.readLine();

	int P = Integer.parseInt(X);
	int Q = Integer.parseInt(Y);
	int R = Integer.parseInt(Z);

	switch(A){
	 case "+":
	     switch(B){
		case "+":
		  System.out.println("="+(P+Q+R)+"");
		  break;
		case "-":
		  System.out.println("="+(P+Q-R)+"");
		  break;
		case "*":
		  System.out.println("="+(Q*R+P)+"");
		  break;
		case "/":
		  if(R != 0){
		   System.out.println("="+(Q/R+P)+"");
		  }else{
		   System.out.println("0では割れません");
		  }
		  break;
		}
	     break;
	  case "-":
	     switch(B){
		case "+":
		  System.out.println("="+(P-Q+R)+"");
		  break;
		case "-":
		  System.out.println("="+(P-Q-R)+"");
		  break;
		case "*":
		  System.out.println("="+(Q*R-P)+"");
		  break;
		case "/":
		  if(R != 0){
		   System.out.println("="+(Q/R-P)+"");
		  }else{
		   System.out.println("0では割れません");
		  }
		  break;
		}
	     break;
	  case "*":
	     switch(B){
		case "+":
		  System.out.println("="+(P*Q+R)+"");
		  break;
		case "-":
		  System.out.println("="+(P*Q-R)+"");
		  break;
		case "*":
		  System.out.println("="+(P*Q*R)+"");
		  break;
		case "/":
		  if(R != 0){
		   System.out.println("="+(P*Q/R)+"");
		  }else{
		   System.out.println("0では割れません");
		  }
		  break;
		}
	     break;
	  case "/":
	     if(Q != 0){
		switch(B){
		   case "+":
			System.out.println("="+(P/Q+R)+"");
			break;
		   case "-":
			System.out.println("="+(P/Q-R)+"");
			break;
		   case "*":
			System.out.println("="+(P/Q*R)+"");
			break;
		   case "/":
			if(R != 0){
			  System.out.println("="+(P/Q/R)+"");
			}else{
			  System.out.println("0では割れません");
			}
			break;
		}
	     }else{
		System.out.println("0では割れません");
	      }
	     break;
	}
   }
}