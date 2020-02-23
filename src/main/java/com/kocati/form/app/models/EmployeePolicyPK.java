package com.kocati.form.app.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmployeePolicyPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "dependent_id")
	private Long dependentId;
	
	@Column(name = "client_bucket_pk")
	private ClientPolicyBucketPK clientBucketPK;
	
	public Long getDependentId() {
		return dependentId;
	}

	public void setDependentId(Long dependentId) {
		this.dependentId = dependentId;
	}

	public ClientPolicyBucketPK getClientBucketPK() {
		return clientBucketPK;
	}

	public void setClientBucketPK(ClientPolicyBucketPK clientBucketPK) {
		this.clientBucketPK = clientBucketPK;
	}

	@Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof ClientPolicyBucketPK)) {
            return false;
        }
        EmployeePolicyPK employeePoliciesPK = (EmployeePolicyPK) o;
        return dependentId == employeePoliciesPK.dependentId &&
        		Objects.equals(clientBucketPK, employeePoliciesPK.clientBucketPK);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dependentId, clientBucketPK);
    }

}
