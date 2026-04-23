class TennisBallRunner{

    public static void main(String[] args) {

        TennisBall ball1 = new TennisBall();
       

        ball1.bounce();
        ball1.roll();
        ball1.spin();
        ball1.hit();
        ball1.serve();
        ball1.smash();
        ball1.drop();
        ball1.throwBall();
        ball1.catchBall();
        ball1.checkPressure();
        ball1.checkWeight();
        ball1.checkSize();
        ball1.packBall();
        ball1.unpackBall();
        ball1.polishBall();

	 TennisBall ball2 = new TennisBall();
	 
        ball2.bounce();
        ball2.roll();
        ball2.spin();
        ball2.hit();
        ball2.serve();
        ball2.smash();
        ball2.drop();
        ball2.throwBall();
        ball2.catchBall();
        ball2.checkPressure();
        ball2.checkWeight();
        ball2.checkSize();
        ball2.packBall();
        ball2.unpackBall();
        ball2.polishBall();

        TennisBall.brand();
        TennisBall.color();
        TennisBall.material();
        TennisBall.weight();
        TennisBall.price();
    }
}