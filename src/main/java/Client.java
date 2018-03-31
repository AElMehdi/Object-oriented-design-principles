public class Client {


	public static void main(String[] args) {
		DefaultSubEntity defaultSubEntity = new DefaultSubEntity();
		SubEntity subEntity = new SubEntity();

		// Should return an Abstract Entity
		EntityTransformer.toEntity(defaultSubEntity);
		EntityTransformer.toEntity(subEntity);



	}
}
