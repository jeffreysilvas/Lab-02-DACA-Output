/**
 * This program creates a prototype of an Employment Authorization Card using ASCII characters,
 * along with variables to control the card's displayed information. Created June 11, 2026.
 * @author Jeffrey Silvas
 */
public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surname = "SPECIMEN";
		String givenName = "TEST V";
		String uscisNum = "000-000-725";
		String category = "C09";
		String cardNum = "SRC0000000725";
		String countryOfBirth = "Ethiopia";
		String termsAndConditions = "None";
		String dateOfBirth = "01 JAN 1920";
		String sex = "M";
		String validFrom = "01/01/80";
		String validUntil = "05/10/11";

		//INPUT SECTION

		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
		System.out.println("║         UNITED STATES OF AMERICA                                    ║");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD      ║");
		System.out.println("║                       Surname                                       ║");
		System.out.println("║                       " + surname + "                                      ║");
		System.out.println("║  .----.    .----.     Given Name                                    ║");
		System.out.println("║ (   ^  \\  /  ^   )    " + givenName + "                                        ║");
		System.out.println("║        |  |           USCIS#         Category   Card#               ║");
		System.out.println("║       _/  \\_          " + uscisNum + "    "+ category +"        " + cardNum + "       " +
				"║");
		System.out.println("║      (_    _)         Country of Birth                              ║");
		System.out.println("║   ,    `--`    ,      " + countryOfBirth + "                                      ║");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions                          ║");
		System.out.println("║    \\          /       " + termsAndConditions + "                                      " +
				"    ║");
		System.out.println("║     '.--..--.'        Date of Birth   Sex                           ║");
		System.out.println("║       `\"\"\"\"\"`         " +dateOfBirth + "     " + sex + "                          " +
				"   ║");
		System.out.println("║                       Valid From:     " + validFrom + "                      ║");
		System.out.println("║                       Card Expires:   " + validUntil + "                      ║");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.                 ║");
		System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}