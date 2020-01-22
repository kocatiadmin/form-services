package com.kocati.form.app.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitialize","handler"})
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date renewalDate;
    private String clientName;
    private String contactPerson;
    private String primaryEmail;
    private String secondaryEmail;
    private String phone1;
    private String cellPhone;
    private String currentCarrier;
    private String referredBy;
    private String notes;

    @Transient
    private boolean isProspect;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private List<Policy> policyList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getCurrentCarrier() {
        return currentCarrier;
    }

    public void setCurrentCarrier(String currentCarrier) {
        this.currentCarrier = currentCarrier;
    }


    public String getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<Policy> getPolicyList() {
        return policyList;
    }

    public void addPolicy(Policy policy){
        getPolicyList().add(policy);
    }

    public void removePolicy(Policy policy){
        getPolicyList().remove(policy);
    }

    public boolean isProspect() {
        return isProspect;
    }

    public void setProspect(boolean prospect) {
        isProspect = prospect;
    }




}
    /*Renewal Date
    Client Name, Contact Person, Email 1, Email 2, Phone 1, Mobile 2
    Current Carrier, Coverage – Medical, Dental, Vision, Life, STD, LTD, Other
    Coverage Effective Date - Medical, Dental, Vision, Life, STD, LTD, Other
    Referred By, Coverage Cancelled, Notes
    */