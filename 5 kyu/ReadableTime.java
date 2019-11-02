public class HumanReadableTime {
	public static String makeReadable(int seconds) {
		
		String hh = Integer.toString((seconds / 3600));
		String mm = Integer.toString((seconds % 3600) / 60);
		String ss = Integer.toString(seconds % 60);
		
		if (hh.length() == 1) {
			hh = "0" + hh;
		}
		if (mm.length() == 1) {
			mm = "0" + mm;
		}
		if (ss.length() == 1) {
			ss = "0" + ss;
		}
		
		return hh + ":" + mm + ":" + ss;
	}
}

//:vault-boy-thumps-up:
