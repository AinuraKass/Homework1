package Homework2;

public class Main {
    public static int countArray(String[][] arrStr) throws MyArraySizeException, MyArrayDataException{
     int count =0;
        if (arrStr.length != 4) {
            throw new MyArraySizeException("Передан массив другого размера для строки");
        }

        for (String[] array : arrStr) {
            if (array.length != 4) {
                throw new MyArraySizeException("Передан массив другого размера для столбца");
            }
        }
//        String[][] arrStr = {
//                {"1", "2", "3", "4"},
//                {"1", "2", "3", "4"},
//                {"1", "2", "3", "4"},
//                {"1", "2", "3", "4"}
//        };
        for (int i = 0; i < arrStr.length; i++) {

                for (int j = 0; j < arrStr[i].length; j++) {
//
                    try {
                        count += Integer.parseInt(arrStr[i][j]);
                    }
                    catch (NumberFormatException e){
                        throw new MyArrayDataException("В ячейке " + i  + "," + j + " лежат неверные данные");
                    }



            }


       }
        return count;
    }

    public static void main(String[] args) {

        String[][] arrStr = {
                {"str", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "5"}
        };
        try {
            System.out.println(countArray(arrStr));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
    }
}