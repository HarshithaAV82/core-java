class MissleRunner{

    public static void main(String[] args) {

        Missle missle1 = new Missle();
        

        missle1.launch();
        missle1.lockTarget();
        missle1.trackTarget();
        missle1.accelerate();
        missle1.changeDirection();
        missle1.igniteEngine();
        missle1.increaseAltitude();
        missle1.decreaseAltitude();
        missle1.activateWarhead();
        missle1.deactivateWarhead();
        missle1.selfDestruct();
        missle1.checkFuelLevel();
        missle1.deployFromBase();
        missle1.returnToBase();
        missle1.performTestLaunch();

	
	Missle missle2 = new Missle();
	
        missle2.launch();
        missle2.lockTarget();
        missle2.trackTarget();
        missle2.accelerate();
        missle2.changeDirection();
        missle2.igniteEngine();
        missle2.increaseAltitude();
        missle2.decreaseAltitude();
        missle2.activateWarhead();
        missle2.deactivateWarhead();
        missle2.selfDestruct();
        missle2.checkFuelLevel();
        missle2.deployFromBase();
        missle2.returnToBase();
        missle2.performTestLaunch();

        Missle.showType();
        Missle.showRange();
        Missle.showSpeed();
        Missle.showManufacturer();
        Missle.showCountry();
    }
}