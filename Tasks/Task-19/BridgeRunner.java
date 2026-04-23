class BridgeRunner{

    public static void main(String[] args) {

        Bridge bridge1 = new Bridge();
        

        bridge1.open();
        bridge1.close();
        bridge1.allowTraffic();
        bridge1.stopTraffic();
        bridge1.support();
        bridge1.repair();
        bridge1.paint();
        bridge1.inspect();
        bridge1.maintain();
        bridge1.expand();
        bridge1.monitor();
        bridge1.resistWind();
        bridge1.resistEarthquake();
        bridge1.controlEntry();
        bridge1.allowEmergency();

	Bridge bridge2 = new Bridge();
	
        bridge2.open();
        bridge2.close();
        bridge2.allowTraffic();
        bridge2.stopTraffic();
        bridge2.support();
        bridge2.repair();
        bridge2.paint();
        bridge2.inspect();
        bridge2.maintain();
        bridge2.expand();
        bridge2.monitor();
        bridge2.resistWind();
        bridge2.resistEarthquake();
        bridge2.controlEntry();
        bridge2.allowEmergency();

        Bridge.type();
        Bridge.length();
        Bridge.material();
        Bridge.location();
        Bridge.yearBuilt();
    }
}