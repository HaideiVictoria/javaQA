package HW8;

public class Computer {
    /*Создать класс Computer c конструктором принимающим параметры
    Марка тип String, цена тип int, оперативная память тип int,и видеокарта тип int.
    Переопределить метод toString для вывода объекта класса в след. виде:
    "Создан PC.
    Имя = марка.
    Цена = цена.
     Видеокарта = объем видеокарты.
    ОЗУ = Объем оперативной памяти."
Все поля класса Computer должны быть приватными.
  Также создайте публичные методы для получения информации о полях класса Computer.
  А также методы для изменения его полей.
    Переопределите метод equals и метод hashCode для вашего класса.
    Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
    равны значения полей марка, оперативная память и видеокарта.
    равны значения полей марка, оперативная память и видеокарта.
    В отдельном классе создайте объект класса компьютер, и выведите в консоль
    информацию о вашем объекте*/

    private String marka;
    private int prica;
    private int ram;
    private int videoCard;
    private int Object;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPrica() {
        return prica;
    }

    public void setPrica(int prica) {
        this.prica = prica;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    public boolean equals(Object obj) {
        if (this==obj)return true;
        if (obj==null|| getClass()!=obj.getClass())return false;
        Computer computer=(Computer) obj;
        return marka.equals(computer.marka)&&
                ram==computer.videoCard&&
                videoCard==computer.ram;


    }

    @Override
    public int hashCode() {
       int result=marka==null ? 0: marka.hashCode();
       result=result+ram;
       result=result+videoCard;
       return result;
    }

}
