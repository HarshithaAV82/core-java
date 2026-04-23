        
class CloudStoragreRunner{

    public static void main(String[] args) {
		
		
		CloudStorage.upload("Resume.pdf");
        CloudStorage.upload("Project.zip", 45.6);
        CloudStorage.upload("DataBackup.rar", 120.5, true);
		
 }		
}
