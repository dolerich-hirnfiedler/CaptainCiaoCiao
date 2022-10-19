package captainciaociao.kapitel_15._2_listen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guest {
	
	private static Random RANDOM = new Random();
	
	public boolean likesToShoot;
	public boolean likesToGamble;
	public boolean likesToBlackmail;
	
	/**
	 * @param likesToShoot
	 * @param likesToGamble
	 * @param likesToBlackmail
	 */
	public Guest(boolean likesToShoot, boolean likesToGamble, boolean likesToBlackmail) {
		this.likesToShoot = likesToShoot;
		this.likesToGamble = likesToGamble;
		this.likesToBlackmail = likesToBlackmail;
	}
	
	public static int allGuestsHaveSimilarInterests(List<Guest> guests) {
		for (int i = 1; i < guests.size() - 1; i++) {
			if (!haveOneCommon(guests.get(i - 1), guests.get(i))) {
				return i - 1;
			}
		}
		return -1;
	}
	
	public static boolean haveOneCommon(Guest one, Guest two) {
		return one.likesToShoot == two.likesToShoot || one.likesToGamble == two.likesToGamble
			|| one.likesToBlackmail == two.likesToBlackmail;
	}
	
	public static Guest generateRandomGuest() {
		return new Guest(RANDOM.nextBoolean(), RANDOM.nextBoolean(), RANDOM.nextBoolean());
		
	}
	
	public static void main(String[] args) {
		List<Guest> guests = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			guests.add(generateRandomGuest());
		}
		System.out.printf("%d%n", allGuestsHaveSimilarInterests(guests));
	}
}
