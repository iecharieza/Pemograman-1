public class EkspresiWajah {
	public String respons () {
		return ("Perhatikan eskpresi wajah saya");
	}
}

class Gembira extends EkspresiWajah {
	public String respons () {
		return ("ha ha ha..") ;
	}
}

class Sedih extends EkspresiWajah {
	public String respons () {
		return ("hik hik ngeee ngeee ngeee..") ;
	}
}

class Marah extends EkspresiWajah {
	public String respons () {
		return ("Hai kurang ajar !") ;
	}
}