package AbstractClass_DZ1.Profession;

class Runner {
    public static void main(String[] args) {
        Developer developer = new Developer("John", "development", "Java");
        Pilot pilot = new Pilot("Olga", "charter", "AN-188");
        Profession developer2=new Developer("Jeremy", "metallurgy", "php");

        developer.setName("Vasya");
        developer2.setIndustry("trade");
        System.out.println();
        System.out.println("Developer "+developer.getName()+" "+developer.toDoWork()+" in the "+developer.getIndustry()
        +" of the specialty "+developer.getSpeciality());

//        System.out.println();
//        System.out.println("Pilot "+pilot.getName()+" "+pilot.toDoWork()+" on a "+pilot.getIndustry()+"ed cargo plane "
//                +pilot.getTypeOfAirplane());

        System.out.println();
        System.out.println("Developer "+developer2.getName()+" "+developer2.toDoWork()+" in "+developer2.getIndustry()+
                " and writes in "+((Developer) developer2).getSpeciality());

        System.out.println();
        System.out.println(pilot.toString());
    }
}
