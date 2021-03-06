package com.bytatech.ayoos.patientgateway.client.doctor.model;


import java.io.Serializable;

/**
 * A DoctorSettings.
 */ 
public class DoctorSettings implements Serializable {

    private static final long serialVersionUID = 1L;
 
    private Long id;
 
    private String approvalType;
 
    private Boolean isMailNotificationsEnabled; 
    private Boolean isSMSNotificationsEnabled;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApprovalType() {
        return approvalType;
    }

    public DoctorSettings approvalType(String approvalType) {
        this.approvalType = approvalType;
        return this;
    }

    public void setApprovalType(String approvalType) {
        this.approvalType = approvalType;
    }

    public Boolean isIsMailNotificationsEnabled() {
        return isMailNotificationsEnabled;
    }

    public DoctorSettings isMailNotificationsEnabled(Boolean isMailNotificationsEnabled) {
        this.isMailNotificationsEnabled = isMailNotificationsEnabled;
        return this;
    }

    public void setIsMailNotificationsEnabled(Boolean isMailNotificationsEnabled) {
        this.isMailNotificationsEnabled = isMailNotificationsEnabled;
    }

    public Boolean isIsSMSNotificationsEnabled() {
        return isSMSNotificationsEnabled;
    }

    public DoctorSettings isSMSNotificationsEnabled(Boolean isSMSNotificationsEnabled) {
        this.isSMSNotificationsEnabled = isSMSNotificationsEnabled;
        return this;
    }

    public void setIsSMSNotificationsEnabled(Boolean isSMSNotificationsEnabled) {
        this.isSMSNotificationsEnabled = isSMSNotificationsEnabled;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DoctorSettings)) {
            return false;
        }
        return id != null && id.equals(((DoctorSettings) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "DoctorSettings{" +
            "id=" + getId() +
            ", approvalType='" + getApprovalType() + "'" +
            ", isMailNotificationsEnabled='" + isIsMailNotificationsEnabled() + "'" +
            ", isSMSNotificationsEnabled='" + isIsSMSNotificationsEnabled() + "'" +
            "}";
    }
}
