package builders;

import interfaces.Asset;
import domain.AssetH;

public class AssetBuilder implements BuilderI<Asset>{

	private String entityName="Asset";
  
	public Asset build() {
		return  new AssetH(entityName);
	}

}
