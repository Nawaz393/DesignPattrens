package GOF.LabFinalExam;

import java.util.Date;

public class Announcement {
    private String message;
    private Date date;
    private Stakeholder issuedBy;


    public Announcement(String message, Stakeholder issuer) {
        this.message = message;
        this.issuedBy = issuer;
        this.date = new Date(); // Set the announcement date to current
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Stakeholder getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(Stakeholder issuedBy) {
        this.issuedBy = issuedBy;
    }

}
