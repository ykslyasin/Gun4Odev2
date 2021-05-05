package Concrete;

import Entity.Campaign;

public class CampaignManager {
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " campaign added with % " + campaign.getDiscount() + " discount.");
	}
	
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " campaign updated.");
	}
	
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " campaign deleted.");
	}
}
