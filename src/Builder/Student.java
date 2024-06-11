package Builder;

public class Student {

    String name ;
    int age;
    String batch;
    double psp;
    String email;
    String phone;

     static class Builder {
        String name ;
        int age;
        String batch;
        double psp;
        String email;
        String phone;

        public Builder() {}



        public int getAge() {
            return age;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public String getBatch() {
            return batch;
        }
        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }
        public double getPsp() {
            return psp;
        }
        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }
        public String getEmail() {
            return email;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getPhone() {
            return phone;
        }
        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getName() {
            return name;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Student build()
        {
            return new Student(this);
        }


    }


    private Student(Builder builder)
    {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
        this.email = builder.getEmail();
        this.phone = builder.getPhone();
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    public double getPsp() {
        return psp;
    }
    public void setPsp(double psp) {
        this.psp = psp;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static Builder builder()
    {
        return new Builder();

    }

}



