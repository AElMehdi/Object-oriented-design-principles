public class EntityTransformer {

	static TargetObjectType toEntity(AbstractEntity abstractEntity) {
		TargetObjectType targetObjectType = new TargetObjectType();

		targetObjectType.setName(abstractEntity.getName());
		targetObjectType.setAddress(abstractEntity.getAddress());
		targetObjectType.setAge(abstractEntity.get);
		targetObjectType.setIdCard();


		return null;
	}

}
