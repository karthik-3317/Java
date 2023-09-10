package StatePattern;

public class StatePatternDemo {
	   public static void main(String[] args) {
	      Context context = new Context();

	      StartState startState = new StartState();
	      startState.presentState(context);

//	      System.out.println(context.getState().toString());

//	      StopState stopState = new StopState();
//	      stopState.doAction(context);

//	      System.out.println(context.getState().toString());
	   }
	}
