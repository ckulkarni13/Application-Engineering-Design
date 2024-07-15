 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.researcher;

import constants.GrantStatus;
import enterprise.auth.Auth;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author drag
 */
public class Grant {

	private String grantedDate;
	private String amount;
	private String uuid;
	private GrantStatus status;
	private String comment;

	private final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");

	public Grant(String amount) {
		this.uuid = Auth.generateUUID();
		this.grantedDate = dateFormat.format(new Date());
		this.amount = amount;
		this.status = GrantStatus.UNDER_REVIEW;
		this.comment = "";
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public GrantStatus getStatus() {
		return status;
	}

	public void setStatus(GrantStatus status) {
		this.status = status;
	}

	public String getGrantedDate() {
		return grantedDate;
	}

	public void setGrantedDate(String grantedDate) {
		this.grantedDate = grantedDate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
