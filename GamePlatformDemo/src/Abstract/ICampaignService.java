package Abstract;

import Entity.Campaign;

public interface ICampaignService {
	public void addCampaign(Campaign campaign);
	
	public void updateCampaign(Campaign campaign);
	
	public void deleteCampaign(Campaign campaign);
}
