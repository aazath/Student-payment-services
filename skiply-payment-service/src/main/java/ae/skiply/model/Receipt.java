package ae.skiply.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="receipt")
public class Receipt {
	@Id
	private Long id;
	
	@Column(name="student_name",length=45)
	private String student_name;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_time", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date generatedDate;

	@PrePersist
	private void onCreate() {
		generatedDate = new Date();
	}
	
	@Column(name="student_id")
	private Long student_id;
	
	@Column(name="reference_no")
	private Long reference_no;
	
	@Column(name="card_no", length=20)
	private String card_no;
	
	@Column(name="card_type", length=20)
	private String card_type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public Date getDateTime() {
		return generatedDate;
	}


	public Long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}

	public Long getReference_no() {
		return reference_no;
	}

	public void setReference_no(Long reference_no) {
		this.reference_no = reference_no;
	}

	public String getCard_no() {
		return card_no;
	}

	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	@Override
	public String toString() {
		return "Receipt [id=" + id + ", student_name=" + student_name + ", generatedDate=" + generatedDate
				+ ", student_id=" + student_id + ", reference_no=" + reference_no + ", card_no=" + card_no
				+ ", card_type=" + card_type + "]";
	}

	

	
	
	
	
}
