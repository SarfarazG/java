package COM.SAF.I_O.Read_write_characters;

	
	class NegativeNumberException extends Exception {
		private int detail;
		NegativeNumberException(int a) {
		detail = a;
		}
		public String toString() {
		return "NegativeNumberException [" + detail + "]";
		}
	}

		
