package com.kocati.form.app.models;

import com.kocati.form.app.models.enums.PolicyType;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany
    private List<Event> eventList;

    private PolicyType policyType;
    private Date policyEffectiveDate;
    private Date policyTerminationDate;
    private Boolean isActive;

    public PolicyType getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType;
    }

    public Date getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }

    public void setPolicyEffectiveDate(Date policyEffectiveDate) {
        this.policyEffectiveDate = policyEffectiveDate;
    }

    public Date getPolicyTerminationDate() {
        return policyTerminationDate;
    }

    public void setPolicyTerminationDate(Date policyTerminationDate) {
        this.policyTerminationDate = policyTerminationDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
}
