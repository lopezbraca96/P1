package dev.lopez.models;

import java.sql.Timestamp;

public class RequestForm {
    private Integer formId;
    private Integer userid;
    private String status; // pending after benco approval, until a pass/fail grade or presentation is provided
    private String eventType;// 6 types
    private String eventLocation;
    private String description;
    private Double eventCost;// set different event cost depending the eventtype
    private Timestamp dateSubmitted;
    private Timestamp dateOccur; //maybe missing date where event ends
    private String justification;
    private String gradeFormat; //reference from another table (A,B,C,D/PASS/FAIL/ PRESENTAION)
    private String gradeCutOff;
    private String gradeReceived; //maybe for reimbursementafter event
    private Double pending;

    //constructor 1
    public RequestForm() {
    }

    //constructor 2
    public RequestForm(Integer userid, String eventType, String eventLocation, String description, Double eventCost, Timestamp dateOccur,
                       String justification, String gradeFormat, String gradeCutOff, Double pending) {
        this.userid = userid;
        this.eventType = eventType;
        this.eventLocation = eventLocation;
        this.description = description;
        this.eventCost = eventCost;
        this.dateOccur = dateOccur;
        this.justification = justification;
        this.gradeFormat = gradeFormat;
        this.gradeCutOff = gradeCutOff;
        this.pending = pending;
    }
    //constructor 3
    //public RequestForm (Integer formId)
    public RequestForm(Integer userid, Integer formId, String status, String eventType, String eventLocation, String description, Double eventCost, Timestamp dateSubmitted, Timestamp dateOccur, String justification, String gradeFormat, String gradeCutOff, String gradeReceived) {
        this.formId = formId;
        this.userid = userid;
        this.status = status;
        this.eventType = eventType;
        this.eventLocation = eventLocation;
        this.description = description;
        this.eventCost = eventCost;
        this.dateSubmitted = dateSubmitted;
        this.dateOccur = dateOccur;
        this.justification = justification;
        this.gradeFormat = gradeFormat;
        this.gradeCutOff = gradeCutOff;
        this.gradeReceived = gradeReceived;

    }






    //getters and setters


    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getEventCost() {
        return eventCost;
    }

    public void setEventCost(Double eventCost) {
        this.eventCost = eventCost;
    }

    public Timestamp getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Timestamp dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public Timestamp getDateOccur() {
        return dateOccur;
    }

    public void setDateOccur(Timestamp dateOccur) {
        this.dateOccur = dateOccur;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    public String getGradeFormat() {
        return gradeFormat;
    }

    public void setGradeFormat(String gradeFormat) {
        this.gradeFormat = gradeFormat;
    }

    public String getGradeCutOff() {
        return gradeCutOff;
    }

    public void setGradeCutOff(String gradeCutOff) {
        this.gradeCutOff = gradeCutOff;
    }

    public String getGradeReceived() {
        return gradeReceived;
    }

    public void setGradeReceived(String gradeReceived) {
        this.gradeReceived = gradeReceived;
    }

    public Double getPending() {
        return pending;
    }

    public void setPending(Double pending) {
        this.pending = pending;
    }

    @Override
    public String toString() {
        return "Form{" +
                "userid=" + userid +
                ", formId=" + formId +
                ", status='" + status + '\'' +
                ", eventType='" + eventType + '\'' +
                ", eventLocation='" + eventLocation + '\'' +
                ", description='" + description + '\'' +
                ", eventCost=" + eventCost +
                ", dateSubmitted=" + dateSubmitted +
                ", dateOccur=" + dateOccur +
                ", justification='" + justification + '\'' +
                ", gradeFormat='" + gradeFormat + '\'' +
                ", gradeCutOff='" + gradeCutOff + '\'' +
                ", gradeReceived='" + gradeReceived + '\'' +
                ", pending='" + pending + '\'' +

                '}';
    }
    //covered cost depending on the event type(certification 80%) after benco approves reimbursement
   // public double coveredCost() {
      // switch ((eventCost)) { ///doesnt let me use double, required type int (but you need double)
          //  case "University Courses":
               // pending = (eventCost) * .8;
             //   break;
          //  case "Seminars":
               // pending = (eventCost) * .6;
               // break;
          //  case "Certification preparation classes":
              //  pending = (eventCost) * .75;
               // break;
          // case "Certifications":
              //  pending = (eventCost) * 1.0;
              //  break;
           // case "Technical training":
               // pending = (eventCost) * .9;
               // break;
           // default:
              //  pending = (eventCost) * .3;
              //  break;
      //  }
       // if (pending < 0.0) {
        //    pending = 0.0;
       // } else if (pending > 1000.0) {
       //     pending = 1000.0;
      //  }
        //return pending;
   // }
}

