
package multiplecatch;


public class MultipleCatch {

   
    public static void main(String[] args) {
        System.out.println("\n****** Menggunakan Multiple "+"Catch ******\n");
        
        try{
            int array[] = new int[9];
            array[9] = 13/0;
            System.out.println("Elemen array index ke "+"9 adalah "+array[9]);
            System.out.println("Pernytaaan dalam blok "+"try bebas dari exception");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.err.println("Anda mengakses array di "+"luar index yang dideklrasikan ");
        }catch(NegativeArraySizeException ex){
            System.err.println("Anda mendeklarisikan array "+"dengan ukuran negatif");
        }catch(Exception ex){
            System.err.println("Anda melakukan pemabgian "+"bilangan oleh nol");
        }
    }
    
}
