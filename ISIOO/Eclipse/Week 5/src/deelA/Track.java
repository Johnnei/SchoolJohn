package deelA;

public class Track {
		private String titel;
		private String duur;
		
		public Track(String titel, String duur) {
			this.titel = titel;
			this.duur = duur;
		}
		
		public String toString() {
			return titel + " ("+duur+")";
		}
}
