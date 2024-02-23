package regioni.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="giunta_lazio")
public class GiuntaLazio {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id", columnDefinition = "int(2)")
	private int id;
	
	@Column(name="nome", columnDefinition = "varchar(14)")
	private String nome;
	
	@Column(name="cognome", columnDefinition = "varchar(14)")
	private String cognome;
	
	@Column(name="assessorato", columnDefinition = "varchar(200)")
	private String assessorato;
	
	@Column(name="presidente", columnDefinition = "varchar(2)")
	private String presidente;
	
	@Column(name="partito", columnDefinition = "varchar(20)")
	private String partito;
	
	@Column(name="generalita", columnDefinition = "varchar(5)")
	private String generalita;
	
	@Column(name="inizio_legislatura", columnDefinition = "float")
	private float inizioLegislatura;

	public GiuntaLazio() {
		super();
	}

	public GiuntaLazio(int id, String nome, String cognome, String assessorato, String presidente, String partito,
			String generalita, float inizioLegislatura) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.assessorato = assessorato;
		this.presidente = presidente;
		this.partito = partito;
		this.generalita = generalita;
		this.inizioLegislatura = inizioLegislatura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getAssessorato() {
		return assessorato;
	}

	public void setAssessorato(String assessorato) {
		this.assessorato = assessorato;
	}

	public String getPresidente() {
		return presidente;
	}

	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}

	public String getPartito() {
		return partito;
	}

	public void setPartito(String partito) {
		this.partito = partito;
	}

	public String getGeneralita() {
		return generalita;
	}

	public void setGeneralita(String generalita) {
		this.generalita = generalita;
	}

	public float getInizioLegislatura() {
		return inizioLegislatura;
	}

	public void setInizioLegislatura(float inizioLegislatura) {
		this.inizioLegislatura = inizioLegislatura;
	}

	

	
	@Override
	public String toString() {
		return "giunta_lazio [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", assessorato=" + assessorato
				+ ", presidente=" + presidente + ", partito=" + partito + ", generalita=" + generalita
				+ ", inizioLegislatura=" + inizioLegislatura + "]";
	}
	
	
	
}
