package comum

class Permissao implements Serializable {

	private static final long serialVersionUID = 1

	String authority

	static constraints = {
		authority  blank: false, unique: true
	}

	static mapping = {
		cache true
	}
}