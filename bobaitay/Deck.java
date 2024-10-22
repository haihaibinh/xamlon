package bobaitay;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	private List<Card> tuLoKho = new ArrayList<>();
	
	public Deck() {
        // Khởi tạo bộ bài với 52 lá, rank từ 1 đến 13, suit từ 0 đến 3
        for ( int suit = 1; suit < 5; suit++ ) {
            for ( int rank = 1; rank <= 13; rank++ ) {
                tuLoKho.add( new Card( rank, suit ) );
            }
        }
        // Trộn bài
        shuffle();
    }
	
	
	public void shuffle() {
		Collections.shuffle( tuLoKho , new Random() );
	}
	
	@Override
    public String toString() {
        return tuLoKho.toString();
    }

}
