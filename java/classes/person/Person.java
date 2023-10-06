package classes.person;

public class Person {
    private String name;
    private String cpf;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(validateCpf(cpf))
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private boolean validateCpf(String cpf) {
        //
        return true;
    }
}
