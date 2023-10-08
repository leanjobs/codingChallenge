import java.util.ArrayList;

public class coba {
    public static void main(String[] args) {
        int counter= 0;
        int counter2 = 0;

        ArrayList<Integer> dataTuti = new ArrayList<>();
        dataTuti.add(0, 3);
        dataTuti.add(1, 5);
        dataTuti.add(2, 2);
        dataTuti.add(3, 12);
        dataTuti.add(4, 7);

        dataTuti.remove(4);
        dataTuti.remove(0);

        System.out.println("Data Kucing Tini");
        for(int i = 0; i < dataTuti.size(); i++){
            counter++;
            int umurKucingTuti = dataTuti.get(i);
            if(umurKucingTuti >= 3){
                System.out.println("kucing nomor "+ counter + " adalah kucing dewasa dan berusia " +umurKucingTuti+ " tahun");
            }else{
                System.out.println("kucing nomor "+ counter + " adalah kucing kecil dan berusia " +umurKucingTuti+ " tahun");
            };
           
        };

        ArrayList<Integer> dataNining = new ArrayList<>();
        dataNining.add(0, 4);
        dataNining.add(1, 1);
        dataNining.add(2, 15);
        dataNining.add(3, 8);
        dataNining.add(4, 3);

        System.out.println("Data Kucing Nining");
        for(int i = 0; i < dataNining.size(); i++){
            counter2++;
            int umurKucingNining = dataNining.get(i);
            if(umurKucingNining >= 3){
                System.out.println("kucing nomor "+ counter2 + " adalah kucing dewasa dan berusia " +umurKucingNining+ " tahun");
            }else{
                System.out.println("kucing nomor "+ counter2 + " adalah kucing kecil dan berusia " +umurKucingNining+ " tahun");
            };
           
        };
        
    };
    
};
