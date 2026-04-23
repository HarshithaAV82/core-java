class BulletRunner{

   public static void main(String[] args){
   
   int getLength = Bullet.getLength();
   int getCount = Bullet.getCount();
   String getName = Bullet.getName();
   String getColour = Bullet.getColour();
   boolean isEmpty = Bullet.isEmpty();
   
   
   System.out.println("get length:" + getLength);
   System.out.println("get count:" + getCount);
   System.out.println("get name:" + getName);
   System.out.println("get colour:" + getColour);
   System.out.println("get empty:" + isEmpty);
   
  
   }
}