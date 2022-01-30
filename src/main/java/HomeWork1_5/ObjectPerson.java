package HomeWork1_5;

public class ObjectPerson {
    public static void main(String[] args){

        Person person1 = new Person("Иванов Иван Иванович", "teamlead","van'ka@ya.ru",89112223344L,5000, 45);
        Person person2 = new Person("Петров Петр Петрович", "senior","pet'ka@ya.ru",89556667788L,4000, 40);
        Person person3 = new Person("Сидоров Сидр Сидорович", "middle","sidorka@ya.ru",89991112233L,3000, 35);
        Person person4 = new Person("Кузнецов Кузьма Кузьмич", "junior","kuz'ka@ya.ru",89445556677L,2000, 30);
        Person person5 = new Person("Джеков Джек Джекович", "intern","zheka@gm.com",3495911L,1000, 25);

        person1.printInfoPerson();
        System.out.println();

        person2.printInfoPerson();
        System.out.println();

        person3.printInfoPerson();
        System.out.println();

        person4.printInfoPerson();
        System.out.println();

        person5.printInfoPerson();
        System.out.println();
        System.out.println();
        System.out.println();


        Person[] persArrey = {person1, person2, person3, person4, person5};
        for (int i = 0; i < persArrey.length; i++) {
            if (persArrey[i].getAge() >= 40){
                System.out.println("СОТРУДНИКИ СТАРШЕ 40 ЛЕТ");
                System.out.println();
                persArrey[i].printInfoPerson();
                System.out.println();
            }
        }
    }
}
