package Builder;

public class Client {
    public static void main(String[] args) {
        //Builder.Student s = new Builder.Student(); this is not allowed as there is no constructor
        //so we need to build the builder object and inser that object in student
        //Builder.Builder b = new Builder.Builder(); // instead of clinet , let student provide a new buidler object

//        Builder.Builder b = Builder.Student.builder(); // inorder to access this we need a studnet object but there is
//                                        // studnet object so we need to make builder methpd static
//        b.setName("bhargav");
//        b.setAge(23);
//
//        //Builder.Student s = new Builder.Student(b);
//        Builder.Student s = b.build();

        // insted of above all lines, lets make this in one line
        // the below code can be used and it can be more genreic also but we need to chnage the return type
        // of all setname classess in builder class

        Student s = Student.builder().
                setName("Bhargav").
                setAge(23).
                setBatch("Beginner")
                .setPsp(98.0)
                .build();

        System.out.println("Debug");
        System.out.println(s.getAge());

        // The above code ensures the clinet is using just student and the prone to error is very less

        //Builder.Student s1 = new Builder.Student(Builder.Student.builder());
        // but the above line of code is still allowing to make new studnet object which violate
        //singleton , so this should be avoided , to avoid this make studnet constr private

        // by making the const private , the builder class wont be allowed to access the constructor outside
        // the class, so we put the builder class inside the studnet class, nested classess

        //Now the builder class will become the object of studnet class, inorder to create an
        // object to builder class, we need object of studnet class, else make the builder class as static

        //Builder.Student.Builder.Builder builder = Builder.Student.builder();

        // now the above statemmnet is allowed as we made the builder class statisc, class can access the objects



    }
}
