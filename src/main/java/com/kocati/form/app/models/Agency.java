package com.kocati.form.app.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Agency implements Serializable {
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "agencyId")
    private Long id;

    private String agencyName;

    @OneToMany(cascade = CascadeType.ALL )
    @JoinColumn(name = "agencyId")
    private List<Client> clientList;

    @OneToMany(cascade = CascadeType.ALL )
    @JoinColumn(name = "agencyId")
    private List<PolicyBucket> policyBuckets;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public List<Client> getClientList() {
        return clientList;
    }

	public void setClientList(List<Client> clientList) {
		this.clientList = clientList;
	}

	public List<PolicyBucket> getPolicyBuckets() {
		return policyBuckets;
	}

	public void setPolicyBuckets(List<PolicyBucket> policyBuckets) {
		this.policyBuckets = policyBuckets;
	}
}
