import java.util.ArrayList;
import java.util.List;

enum TipoAtendimento {
    CLINICA,
    PEDIATRIA,
    PNEUMOLOGIA,
    OBSTETRICIA
}

class Plantao {
    private List<Medico> medicosDePlantao;

    public void adicionarMedicoAoPlantao(Medico medico) {
        medicosDePlantao.add(medico);
        System.out.println("Médico adicionado ao plantão: " + medico.getCrm());
    }
}

abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public abstract void realizarAtendimento();
}

class Paciente extends Pessoa {
    private String numeroProntuario;
    private Triagem triagem;
    private List<Atendimento> atendimentos;

    public Paciente(String nome, int idade, String sexo, String numeroProntuario) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.numeroProntuario = numeroProntuario;
        this.atendimentos = new ArrayList<>();
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
        System.out.println("Atendimento adicionado para o paciente: " + numeroProntuario);
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("Paciente realizando atendimento");
    }
}

class AgenteSaude {
    protected String especialidade;
}

class Medico extends AgenteSaude {
    protected String crm;

    public Medico(String especialidade, String crm) {
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void realizarAtendimento() {
        System.out.println("Médico realizando atendimento");
    }
}

class Enfermeiro extends AgenteSaude {
    protected String coren;

    public Enfermeiro(String especialidade, String coren) {
        this.especialidade = especialidade;
        this.coren = coren;
    }

    public void realizarAtendimento() {
        System.out.println("Enfermeiro realizando atendimento");
    }
}

class Triagem {
    private Enfermeiro enfermeiro;
    private String tipoAtendimento;
}

class Atendimento {
    private TipoAtendimento tipo;
    private boolean urgencia;
    private Medico medico;
    private List<Procedimento> procedimentos;

    public Atendimento(TipoAtendimento tipo, boolean urgencia, Medico medico) {
        this.tipo = tipo;
        this.urgencia = urgencia;
        this.medico = medico;
        this.procedimentos = new ArrayList<>();
    }

    public void adicionarProcedimento(Procedimento procedimento) {
        procedimentos.add(procedimento);
        System.out.println("Procedimento adicionado ao atendimento");
    }

    public void direcionarParaMedico(Medico medico) {
        this.medico = medico;
        System.out.println("Atendimento direcionado para o médico: " + medico.getCrm());
    }
}

class Procedimento {
    private String descricao;
    private List<AgenteSaude> equipe;
    private List<MedicamentoRegistro> medicamentosUtilizados;
    private List<InsumoRegistro> insumosUtilizados;
    private List<Procedimento> procedimentosInternos;

    public Procedimento(String descricao) {
        this.descricao = descricao;
        this.equipe = new ArrayList<>();
        this.medicamentosUtilizados = new ArrayList<>();
        this.insumosUtilizados = new ArrayList<>();
        this.procedimentosInternos = new ArrayList<>();
    }

    public void adicionarEquipe(AgenteSaude agente) {
        equipe.add(agente);
        System.out.println("Membro da equipe adicionado ao procedimento");
    }

    public void adicionarMedicamentoUtilizado(MedicamentoRegistro registro) {
        medicamentosUtilizados.add(registro);
        System.out.println("Medicamento utilizado adicionado ao procedimento");
    }

    public void adicionarInsumoUtilizado(InsumoRegistro registro) {
        insumosUtilizados.add(registro);
        System.out.println("Insumo utilizado adicionado ao procedimento");
    }

    public void adicionarProcedimentoInterno(Procedimento procedimentoInterno) {
        procedimentosInternos.add(procedimentoInterno);
        System.out.println("Procedimento interno adicionado ao procedimento");
    }
}

class MedicamentoRegistro {
    private Medicamento medicamento;
    private int quantidade;

    public MedicamentoRegistro(Medicamento medicamento, int quantidade) {
        this.medicamento = medicamento;
        this.quantidade = quantidade;
    }
}

class Medicamento {
    private String nome;
    private String descricao;

    public Medicamento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
}

class InsumoRegistro {
    private Insumo insumo;
    private int quantidade;

    public InsumoRegistro(Insumo insumo, int quantidade) {
        this.insumo = insumo;
        this.quantidade = quantidade;
    }
}

class Insumo {
    private String nome;
    private String descricao;

    public Insumo(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
}

public class Hospital {
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<Enfermeiro> enfermeiros;
    private List<Procedimento> procedimentos;
    private List<Medicamento> medicamentos;
    private List<Insumo> insumos;
    private Plantao plantao;

    public Hospital() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.enfermeiros = new ArrayList<>();
        this.procedimentos = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
        this.insumos = new ArrayList<>();
        this.plantao = new Plantao();
    }

    public void cadastrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente cadastrado: " + paciente.getNumeroProntuario());
    }

    public void cadastrarMedico(Medico medico) {
        medicos.add(medico);
        System.out.println("Médico cadastrado: " + medico.getCrm());
    }

    public void cadastrarEnfermeiro(Enfermeiro enfermeiro) {
        enfermeiros.add(enfermeiro);
        System.out.println("Enfermeiro cadastrado: " + enfermeiro.getCoren());
    }

    public void cadastrarProcedimento(Procedimento procedimento) {
        procedimentos.add(procedimento);
        System.out.println("Procedimento cadastrado");
    }

    public void cadastrarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
        System.out.println("Medicamento cadastrado");
    }

    public void cadastrarInsumo(Insumo insumo) {
        insumos.add(insumo);
        System.out.println("Insumo cadastrado");
    }

    public void adicionarMedicoAoPlantao(Medico medico) {
        plantao.adicionarMedicoAoPlantao(medico);
    }

    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Paciente paciente = new Paciente("João", 25, "Masculino", "12345");
        hospital.cadastrarPaciente(paciente);

        Medico medico = new Medico("Cardiologia", "CRM123");
        hospital.cadastrarMedico(medico);

        Enfermeiro enfermeiro = new Enfermeiro("Geral", "COREN456");
        hospital.cadastrarEnfermeiro(enfermeiro);

        Procedimento procedimento = new Procedimento("Cirurgia de emergência");
        hospital.cadastrarProcedimento(procedimento);

        Medicamento medicamento = new Medicamento("Paracetamol", "Analgésico");
        hospital.cadastrarMedicamento(medicamento);

        Insumo insumo = new Insumo("Gaze", "Material para curativos");
        hospital.cadastrarInsumo(insumo);

        hospital.adicionarMedicoAoPlantao(medico);

        paciente.realizarAtendimento();
        medico.realizarAtendimento();
    }
}