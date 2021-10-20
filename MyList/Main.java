
public class Main {
    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
         
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        System.out.println("Silme öncesi dizi: " + liste.toString());

        System.out.println("7. indisteki değer : " + liste.get(7));
        System.out.println("Silme işlemi sonucu 7.indisteki değer : " + liste.remove(7));
        System.out.println("Silme işlemi sonucu dizi: " + liste.toString());
   
        liste.add(40);
        System.out.println("Dizi : " + liste.toString());
        
        liste.set(0, 100);
        System.out.println("Dizi : " + liste.toString());

        System.out.println("10 İndis değeri : " + liste.indexOf(10));
        System.out.println("100 İndis değeri : " + liste.indexOf(100));
        System.out.println("İndis : " + liste.lastIndexOf(40));
        System.out.println("İndis : " + (liste.isEmpty()? "Boş":"Dolu"));
        System.out.println("40 için : " + liste.contains(40));
        System.out.println("400 için : " + liste.contains(400));

        MyList<Integer> altListem = liste.subList(3, 5);
        System.out.println("Alt Liste: " + altListem.toString());
        
        liste.clear();
        System.out.println(liste.toString());
    }
}
