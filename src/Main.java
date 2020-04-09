import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*int[] arrayInt=new int[10];
        int[] arrayInt2=new int[]{100,200,300};
        String[] arrayStr = new String[] {"First","Second","Third"};

            for (int i=0; i < arrayInt.length; i++){
                arrayInt[i]=i*10;
                System.out.print(arrayInt[i]+" ");

            }
        System.out.println();


            int index=0;
            while(true){
            arrayInt2[index]=200*index;
            index++;
            if (index>2){break;
            }

        }

            for (int elem: arrayInt){
                System.out.print(elem + " ");
            }
            System.out.println();

            for(int i=7;i>0;i--){
                if (i==3){continue;}
                else if(i==1)break;
            System.out.println(i);
            }

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%NEXT%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        BufferedReader reader2 =
                new BufferedReader(new InputStreamReader(System.in));
        int [] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(reader2.readLine());
        }

        Set<Integer> set1 = new TreeSet<>();

        for(int el: arr2){
            set1.add(el);
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(set1);
        List<String> list1=new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("Three");
        list1.add(0,"Null");
        list1.remove(0);
        System.out.println("Contains Three? : " + list1.contains("Three"));

        System.out.println(list1);

        List<User> list2 = new ArrayList<>();
        list2.add(new User("Oleg",20));
        list2.add(new User("Olga",18));
        list2.add(new User("Ivan",25));

        System.out.println(list2);
        System.out.println(list2.contains(new User("Oleg",30)));
        System.out.println(list2.contains(new User("Oleg",20)));*/

        //Домашняя работа, Сортировка пузырьком и поиск числа

        BufferedReader SortTest =
                new BufferedReader(new InputStreamReader(System.in));
        int [] arrsort = new int[5];//Создаём экземпляр класса Bufferedreader
        System.out.println("Enter the numbers");
        for (int i = 0; i < arrsort.length; i++) {
            arrsort[i] = Integer.parseInt(SortTest.readLine());//Вводим данные с клавиатуры
        }
        System.out.println("Array length = " + arrsort.length);//Проверка длинны массива


        int j = 0;
        while (j<=arrsort.length) {
            int i = 0;
            while (i <= arrsort.length) {
                if (i == arrsort.length - 1) {
                    break;
                }
                if (arrsort[i] > arrsort[i + 1]) {
                    int buf = arrsort[i];
                    arrsort[i] = arrsort[i + 1];
                    arrsort[i + 1] = buf;
                }
                System.out.println(i + 1);
                System.out.println(Arrays.toString(arrsort));

                i++;
            }
            j++;
        }

        System.out.println("Number search. Enter the number");

        BufferedReader SearchTest =
                new BufferedReader(new InputStreamReader(System.in));
        int search = Integer.parseInt(SearchTest.readLine());

        int i=0;
        boolean check=true;
        while(i<=arrsort.length-1){
            if(search==arrsort[i]){
                System.out.println("Number exist");
                check=false;
            }
            i++;
        }
        if(check==true){System.out.println("Number not exist");}
    }
}
