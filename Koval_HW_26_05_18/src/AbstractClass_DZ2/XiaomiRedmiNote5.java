package AbstractClass_DZ2;

class XiaomiRedmiNote5 extends Xiaomi implements MobilePhones{
    private String namePhone;

    XiaomiRedmiNote5(String os, double diagonalOfDisplay, int amountOfSim, int ram, int rom, int capacityOfAccum,
                     int megapicOfCam, String markPhone, String namePhone) {
        super(os, diagonalOfDisplay, amountOfSim, ram, rom, capacityOfAccum, megapicOfCam, markPhone);
        this.namePhone = namePhone;
    }


    String getNamePhone() {
        return namePhone;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("Марка телефона - ").append(getMarkPhone()).append('\n');
        sb.append("Название телефона - ").append(getNamePhone()).append('\n');
        sb.append("Операционная система - ").append(getOs()).append('\n');
        sb.append("Диагональ дисплея - ").append(getDiagonalOfDisplay()).append('\n');
        sb.append("Количество Sim карт - ").append(getAmountOfSim()).append('\n');
        sb.append("Оперативная память - ").append(getRam()).append('\n');
        sb.append("Встроенная память - ").append(getRom()).append('\n');
        sb.append("Емкость аккумулятора, mAh- ").append(getCapacityOfAccum()).append('\n');
        sb.append("Разрешение основной камеры, мегапикс - ").append(getMegapicOfCam()).append('\n');
        return sb.toString();
    }

    @Override
    public String goodsInfo(SmartPhone smartPhone) {
        return toString();
    }
}
