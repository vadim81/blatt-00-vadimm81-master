class UserInfo {
	public static void main(String[] args) {
		System.out.print("Benutzername: ");
		System.out.println(System.getProperty("user.name"));
		System.out.print("Home-Verzeichnis: ");
		System.out.println(System.getProperty("user.home"));
	}
}