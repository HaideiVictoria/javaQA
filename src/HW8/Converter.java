package HW8;

public class Converter {/*Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String).
При вводе boolean выводитсообщение, что введен тип boolean.

convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String).
При вводе boolean выводит сообщение, что введен тип boolean.

converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).

У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
А также только один метод геттер для получения информации о названии данного конвертра.*/

public String converterName;

    public String getConverterName() {
        return converterName;
    }

    public void setConverterName(String converterName) {
        this.converterName = converterName;
    }

    public static void main(String[] args) {
    }

    public double converToDouble(Object chanche){
            if (chanche instanceof Boolean) {
                System.out.println("Тип даних Boolean");
                return 0;
            } else if (chanche instanceof Byte) {
                return ((int) ((Byte) chanche).byteValue());
            } else if (chanche instanceof Short) {
                return ((int) ((Short) chanche).byteValue());
            } else if (chanche instanceof Integer) {
                return (((Integer) chanche).intValue());
            } else if (chanche instanceof Long) {
                return (int) ((Long) chanche).longValue();
            } else if (chanche instanceof Character) {
                return (((Character) chanche).charValue());
            } else if (chanche instanceof Float) {
                return ((int) ((Float) chanche).floatValue());
            } else if (chanche instanceof Double) {
                return ((int) ((Double) chanche).doubleValue());
            } else if (chanche instanceof String) {
                return Double.parseDouble((String) chanche);
            } else {
                return 0;
            }




    }
public int  convertToInt(Object  convertToInt) {

        if (convertToInt instanceof Boolean) {
            System.out.println("Тип введен как boolean");
            return 0;
        } else if (convertToInt instanceof Number) {
            return ((Number) convertToInt).intValue();
        } else if (convertToInt instanceof Character) {
            return (char) convertToInt;
        } else if (convertToInt instanceof String) {
            return Integer.parseInt((String) convertToInt);
        } else {
            return 0;
    }
}
public double String (Object converToString){

 return Double.parseDouble((String)converToString);}}





