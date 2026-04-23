class ProductStore{
	
	Product[] products;
	int currentIndex = 0;
	
	ProductStore(Product[] products){
		this.products=products;
	}
	
	void saveProductStore(Product product){
		
		System.out.println("Executing saveProductStore in productStore..");
		if(this.products != null && product != null){
			
			System.out.println("Array and name is not null, so we can save here..");
			int index = products.length-1;
			if(currentIndex <= index){
				
				this.products[currentIndex]=product;
				System.out.println("save the product in the current index..." + currentIndex);
				currentIndex++;
				
			}
			else{
				
				System.out.println("Array Index is full...");
			}
		}else{
			System.out.println("Array and name is null, so we cannot do operation here..");
		}
	}
	
	void saveProductStore(Product[] product){
		System.out.println("Executing saveProductStore in productStore, here i am using overloading method to perform operation...");
		if(this.products != null && product != null){
			System.out.println("Array and name is not null, so we can save here.");
			int index = products.length-1;
			for(Product item: product){
			if(currentIndex <= index && item != null){
				this.products[currentIndex] = item;
				System.out.println("save the product in the current index..." + currentIndex);
				currentIndex++;
			}
			else{
				System.out.println("Array Index is full...");
				break;
			}
			}
		}else{
			System.out.println("Array and name is null, so we cannot do operation here..");
		}
	}
		
		boolean searchByName(String name){
			boolean found = false;
			System.out.println("Executing searchByName in productStore..");
			if(this.products != null && name != null){
				for(Product product:this.products){
				if(product != null && product.name == name){
					System.out.println("name is not null, before applying this method check first or else we get an error as a nullPointer exception..");
					System.out.println("Product found:" + name);
					found = true;
					break;
				}
			}
			}
			else{
				System.out.println("product not found");
				
			}
		
	
	return found;
}

boolean  SearchByUniqueId(String uniqueId){
	
	System.out.println("Executing searchByUniqueId... in productStore.");
	boolean found = false;
	   if(this.products!= null && uniqueId != null)
	   {
		   System.out.println("array and Id is not null...");
		   int index = this.products.length-1;
		   
		      for(Product product: this.products){
				   if(product != null && product.uniqueId == uniqueId)
		   {
			    System.out.println("Id is not null..");
			   System.out.println("Product Id found :" + uniqueId);
			   found = true;
			   break;
                			   
		   }
	   }
	   }else{
		   System.out.println("Product id is not found...");
	   }
	   return found;
   }
   boolean SearchByUniqueIdAndName(String uniqueId , String name){
	   
	   System.out.println("Executing searchByUniqueIdAndName in productStore..");
	   boolean found = false;
	   if(this.products != null && uniqueId != null && name != null){
		   System.out.println("array , Id and name is not null...");
		   int index = this.products.length-1;
		   
		   for(Product product: this.products){
			   if(product != null && product.uniqueId == uniqueId && product.name == name){
				   System.out.println("Array , id, name is not null.. ");
				   System.out.println("Product Id found:" + uniqueId);
				   System.out.println("Product name found:" + name);
				   found = true;
				   break;
			   }
		   }
	   }else{
		   System.out.println("Product id and name is not found...");
	   }
	   return found;
   }
   
    boolean SearchByUniqueIdAndNameAndOriginCountry(String uniqueId , String name, String originCountry){
		System.out.println("Executing searchByUniqueIdAndNameAndOriginName in productStore..");
	   boolean found = false;
	   if(this.products != null && uniqueId != null && name != null && originCountry != null){
		   System.out.println("array , Id and name originCountry is not null...");
		   int index = this.products.length-1;
		   
		   for(Product product: this.products){
			   if(product != null && product.uniqueId == uniqueId && product.name == name && product.originCountry == originCountry){
				   System.out.println("Array , id, name , originCountry is not null.. ");
				   System.out.println("Product Id found:" + uniqueId);
				   System.out.println("Product name found:" + name);
				   System.out.println("Product originCountry found:" + originCountry);
				   found = true;
				   break;
			   }
		   }
	   }else{
		   System.out.println("Product id and name , originCountry  is not found...");
	   }
	   return found;
   }
	
	boolean checkWarrantyExpiredByUniqueId(String uniqueId){
		boolean found = false;
		
		System.out.println("Executing checkWarrantyExpiredByUniqueId in productStore...");
		if(this.products != null && uniqueId != null){
			for(Product product : this.products){
				if(product != null && product.uniqueId == uniqueId && product.warrantyExpired != null){
					System.out.println("Product found with id:" + uniqueId);
					System.out.println("Product found :" + product.warrantyExpired);
					return true;
				
				}
			}
		}
		else{
			System.out.println("Warranty is not expired .... so we can use");
		}
		return found;
	}
	
	void displayAllProducts(){
		System.out.println("Executing displayAllProducts in productStore...");
		if(this.products != null){
			for(Product product : this.products){
				if(product != null){
		System.out.println("name:" + product.name);
		System.out.println("make:" + product.make);
		System.out.println("mfgDate:" + product.mfgDate);
		System.out.println("cost:" + product.cost);
		System.out.println("productType:" + product.productType);
		System.out.println("seller:" + product.seller);
		System.out.println("productWarranty:" + product.productWarranty);
		System.out.println("warrantyExpired:" + product.warrantyExpired);
		System.out.println("uniqueId:" + product.uniqueId);
		System.out.println("originCountry:" + product.originCountry);
				}
			}
		}else{
			System.out.println("no more products are there in the productStore");
		}
	}
	void getAllByType(ProductType productType){
		
		
		System.out.println("Executing getAllByType in productStore");
		if(this.products != null && productType != null){
			for(Product product: this.products){
				if(product != null && product.productType == productType){
	    System.out.println("name:" + product.name);
		System.out.println("make:" + product.make);
		System.out.println("mfgDate:" + product.mfgDate);
		System.out.println("cost:" + product.cost);
		System.out.println("productType:" + product.productType);
		System.out.println("seller:" + product.seller);
		System.out.println("productWarranty:" + product.productWarranty);
		System.out.println("warrantyExpired:" + product.warrantyExpired);
		System.out.println("uniqueId:" + product.uniqueId);
		System.out.println("originCountry:" + product.originCountry);
				}
			}
			
			
		}else{
			System.out.println("all getAllByType are get  displayed..");
		}
		
	}
	
	boolean getAllByWarrantyYears(ProductWarranty warranty){
		
		System.out.println("Executing getAllByWarrantyType in productStore...");
		if(this.products!= null && warranty != null){
			
			for(Product product: this.products){
				if(product != null){
					
				 System.out.println("product is not null..");
				if(product.productWarranty == warranty){
					product.displayInfo();
				}
				}
			}
		}else{
			System.out.println("product is null....");
		}
		return false;
	}

}