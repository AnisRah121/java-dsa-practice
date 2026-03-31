package Practice;

public class Company  {
    String cname ;
    Employe e;
    Company( String cname,Employe e)
    {
        this.cname=cname;
        this.e=e;
    }

    static void main() {
        Employe e = new Employe("Anis ");
        Company c = new Company("Amazon",e);
        System.out.println("this employe "+e.name+"is working in company "+c.cname);

    }
}
