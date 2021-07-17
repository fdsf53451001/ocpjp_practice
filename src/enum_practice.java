
public class enum_practice {
	public static mystate st = mystate.sleeping;
	public static void main(String[] args) {
		switch(st) {
			case sleeping: 
				System.out.println("wake up");
		}
	}
}

enum mystate{
	sleeping("sleeping"),
	working("working")
	,thinking("thinking");
	private String  state_string;
	private mystate(String s){
		this.state_string = s;
	}
	public void print_state() {
		System.out.println(state_string);
	}
}