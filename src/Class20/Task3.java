package Class20;

public class Task3 {
    public static void main(String[] args) {
        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Adem";
        chemistryTeacher.favoriteChemSubject="Organic";
        chemistryTeacher.teachesChemistry();
    }

}
class Teacher{
    String name;
    String subject;
    void teach(){
        System.out.println(name+" teaches "+subject);
    }

}
class MathTeacher extends Teacher{
    String favoriteMathSubject;
    public void teachesMath(){
        System.out.println(name+" "+" teaches math and his favorite math subject is "+favoriteMathSubject);
    }
    }
    class ChemistryTeacher extends Teacher{
        String favoriteChemSubject;
    public void teachesChemistry(){
        System.out.println(name+" teaches chemistry and his favorite Chem subject is "+favoriteChemSubject);
    }
    }
    class PianoTeacher extends Teacher{
    String favoritePiano;
    public void teachesPiano(){
        System.out.println(name+" teaches the piano and her favorite piano is "+favoritePiano);
    }
    }