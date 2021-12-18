package top.umeh.proj;

import lombok.Data;

import java.util.Objects;

/**
 * @author Box
 */
@Data
public class Course {
    private String offeringUnit;
    private String offeringDepartment;
    private String newCode;
    private String oldCode;
    private String courseTitleEng;
    private String courseTitleChi;
    private Integer credits;
    private String courseDuration;
    private String mediumOfInstruction;

    public String getOfferingUnit () {
        return offeringUnit;
    }

    public void setOfferingUnit (String offeringUnit) {
        this.offeringUnit = offeringUnit;
    }

    public String getOfferingDepartment () {
        return offeringDepartment;
    }

    public void setOfferingDepartment (String offeringDepartment) {
        this.offeringDepartment = offeringDepartment;
    }

    public String getNewCode () {
        return newCode;
    }

    public void setNewCode (String newCode) {
        this.newCode = newCode;
    }

    public String getOldCode () {
        return oldCode;
    }

    public void setOldCode (String oldCode) {
        this.oldCode = oldCode;
    }

    public String getCourseTitleEng () {
        return courseTitleEng;
    }

    public void setCourseTitleEng (String courseTitleEng) {
        this.courseTitleEng = courseTitleEng;
    }

    public String getCourseTitleChi () {
        return courseTitleChi;
    }

    public void setCourseTitleChi (String courseTitleChi) {
        this.courseTitleChi = courseTitleChi;
    }

    public Integer getCredits () {
        return credits;
    }

    public void setCredits (Integer credits) {
        this.credits = credits;
    }

    public String getCourseDuration () {
        return courseDuration;
    }

    public void setCourseDuration (String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getMediumOfInstruction () {
        return mediumOfInstruction;
    }

    public void setMediumOfInstruction (String mediumOfInstruction) {
        this.mediumOfInstruction = mediumOfInstruction;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Course)) {
            return false;
        }
        Course that = ( Course ) o;
        return getNewCode ().equals (that.getNewCode ());
    }

    @Override
    public int hashCode () {
        return Objects.hash (getNewCode ());
    }

    @Override
    public String toString () {
        return "Course{" +
                "offeringUnit='" + offeringUnit + '\'' +
                ", offeringDepartment='" + offeringDepartment + '\'' +
                ", newCode='" + newCode + '\'' +
                ", oldCode='" + oldCode + '\'' +
                ", courseTitleEng='" + courseTitleEng + '\'' +
                ", courseTitleChi='" + courseTitleChi + '\'' +
                ", credits=" + credits +
                ", courseDuration='" + courseDuration + '\'' +
                ", mediumOfInstruction='" + mediumOfInstruction + '\'' +
                '}';
    }
}
