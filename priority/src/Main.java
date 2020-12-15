
import java.util.PriorityQueue;
import java.util.Queue;
class Player implements Comparable<Player>{
    private String isim ;
    private int id ;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Player{" + "isim = " + isim + ", id = " + id + '}';
    }

    @Override
    public int compareTo(Player player) {
        if(this.id<player.id){
            return -58;
            
        }else if(this.id>player.id){
            return 58;
        }
        return 0;
    }
    
}

public class Main {
    public static void main(String[] args) {
              /*
        Priority queue somut bir sınıftır ve queue interface implemente ediyor.
        normal queue mantığı ile çalışmıyor.
        bu yapıda öncelik sıralı var 
        hangi sırada eklediğiniz değil öncelik sırasına göre yerleşiyor.
        en küçük sayıda en büyük öncelik en ,en büyük sayıda ise en  küçük öncelik oluyor.
        alfabetik olarak ise z a den önceliklidir diye biliriz.
        priority -->> öncelik anlamına geliyor
        biz queue de kulalndığımız poll peek vb bu yapıdada kullanabiliyoruz.
        bunlara ek olarak clear adlı bir metodumuz var.Bu yapı queue yapısındada var
        
        
        */
        Queue<Integer> queue = new PriorityQueue<Integer>();
        
        Queue<Integer> liste = new PriorityQueue<Integer>();
        
        
        queue.offer(5);
        queue.offer(1);
        queue.offer(8);
        queue.offer(4);
        queue.offer(100);//bu yapıları foreach ile bastırırsan sırası ile  göstermiyor.
        
        
        liste.add(5);
        liste.add(8);
        liste.add(2);
        liste.add(120);
        liste.add(88);
        
      for(int a : queue){
            System.out.println(a);
        }
        System.out.println("**************************");
        for(int b : liste){
            System.out.println(b);
        }
        System.out.println("**************************");
        System.out.println(queue.contains(14));
        System.out.println(liste.contains(88));
        //en yüksek öncelikli ifadenin en ende olduğunu görmek için == 
        System.out.println("**************************");
         while(!queue.isEmpty()){
         System.out.println("Queue boşaltılıyor :"+queue.poll());
         
     }
        System.out.println("**************************");
        while (!liste.isEmpty()) {
            System.out.println("Yüksek Öncelikli değer çıkartılıyor (liste) :"+liste.poll());
            
        }
        
        System.out.println("//////////////////////////////////////////////////");
        Queue<Player> oyuncu = new PriorityQueue<Player>();
        
        Queue<Player> oyuncu2 = new PriorityQueue<Player>();
        
        
        oyuncu.offer(new Player("ali", 5));
        oyuncu.offer(new Player("ahmet", 58));
        oyuncu.offer(new Player("murat", 85));
        oyuncu.offer(new Player("mustafa", 55));
        oyuncu.offer(new Player("musa", 88));
        oyuncu.offer(new Player("yunus", 8));
        oyuncu.offer(new Player("hakan", 4));
        oyuncu.offer(new Player("harun", 12));
        
        oyuncu2.add(new Player("ali", 5));
        oyuncu2.add(new Player("ahmet", 58));
        oyuncu2.add(new Player("murat", 85));
        oyuncu2.add(new Player("mustafa", 55));
        oyuncu2.add(new Player("musa", 88));
        oyuncu2.add(new Player("yunus", 8));
        oyuncu2.add(new Player("hakan", 4));
        oyuncu2.add(new Player("harun", 12));
        
        while(!oyuncu.isEmpty()){
            
            System.out.println("oyuncu oyundan çıkarılıyor : "+oyuncu.poll());

        }
        System.out.println("//////////////////////////////////////////");
        while(!oyuncu2.isEmpty()){
            
            System.out.println("oyuncu oyundan çıkarılıyor : "+oyuncu2.poll());

        }
        
        
    }
}
