class GrenadeRunner {
    
	public static void main(String[] args) {
         int getWeight = Grenade.getWeight(33);
         String getType = Grenade.getType("fire");
         boolean isExplosive = Grenade.isExplosive();
         int getFuseTime = Grenade.getFuseTime();
        String getColour = Grenade.getColour();
		
		
		System.out.println("getWeight:" + getWeight);
		System.out.println("getType:" + getType);
		System.out.println("isExplosive:" + isExplosive);
		System.out.println("getFuseTime:" + getFuseTime);
		System.out.println("getcolour:" + getColour);
    }
}
