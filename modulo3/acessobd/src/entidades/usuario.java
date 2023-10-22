package entidades;

public class usuario {
    private int codigo;
    private String name;
    private String sexo;
    private String email;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo (int codigo) {
        this.codigo = codigo;
    }
    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo (String sexo) {
        this.sexo = sexo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail (String email) {
        this.email = email;
    }
}
