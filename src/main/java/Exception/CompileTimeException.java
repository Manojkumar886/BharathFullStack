package Exception;

import java.io.IOException;

public class CompileTimeException {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Runtime run=Runtime.getRuntime();
		//Runtime run1=new Runtime();
		Process pro;
		pro=run.exec("notepad");//compiletime Exceptionx/Checked
		Thread.sleep(5000);
		pro=run.exec("calc");
	}

}
