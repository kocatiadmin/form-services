package com.kocati.form.app.models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

@Embeddable
public class ClientPolicyBucketPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long clientId;
	private Long policyBucketId;
	
	public long getClientId() {
		return clientId;
	}
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}
	public Long getPolicyBucketId() {
		return policyBucketId;
	}
	public void setPolicyBucketId(Long policyBucketId) {
		this.policyBucketId = policyBucketId;
	}
	
	@Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof ClientPolicyBucketPK)) {
            return false;
        }
        ClientPolicyBucketPK clientPolicyPK = (ClientPolicyBucketPK) o;
        return clientId == clientPolicyPK.clientId &&
        		policyBucketId == clientPolicyPK.policyBucketId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, policyBucketId);
    }

}
