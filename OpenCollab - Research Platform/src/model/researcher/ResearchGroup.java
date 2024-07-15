/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.researcher;

import constants.GrantStatus;
import enterprise.auth.Auth;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author drag
 */
public class ResearchGroup {

	private List<Researcher> group;
	private String createrEmail;
	private ResearchPaper paper;
	private String uuid;
	private List<Grant> grants;

	public ResearchGroup(String createrEmail) {
		this.group = new ArrayList<>();
		this.createrEmail = createrEmail;
		this.paper = new ResearchPaper();
		this.uuid = Auth.generateUUID();
		this.grants = new ArrayList<>();
	}

	public List<Grant> getGrants() {
		return grants;
	}

	public void addGrant(String amount) {
		this.grants.add(new Grant(amount));
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void addMember(Researcher r) {
		this.group.add(r);
	}

	public void removeMember(Researcher r) {
		this.group.remove(r);
	}

	public List<Researcher> getGroup() {
		return group;
	}

	public void setGroup(List<Researcher> group) {
		this.group = group;
	}

	public String getCreaterEmail() {
		return createrEmail;
	}

	public void setCreaterEmail(String createrEmail) {
		this.createrEmail = createrEmail;
	}

	public ResearchPaper getPaper() {
		return paper;
	}

	public void setPaper(ResearchPaper paper) {
		this.paper = paper;
	}

	public String getTotalFunding() {
		int totalFunding = 0;

		for (var grant : this.grants) {
			if (grant.getStatus() == GrantStatus.ACCEPTED) {
				totalFunding += Integer.parseInt(grant.getAmount().replace("$", ""));
			}
		}
		return "$" + String.valueOf(totalFunding);
	}

}
