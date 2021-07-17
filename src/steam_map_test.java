import java.util.stream.Stream;

public class steam_map_test {
	public static void main(String[] args) {
		Stream<Integer> s= Stream.of(1,2,3,4)
									  			.map(n->n*2);
		Stream.of(1,2,3,4)
	  				.map(n->n*2)
					.forEach(n->{System.out.println(n);});
									  			
	}
}
