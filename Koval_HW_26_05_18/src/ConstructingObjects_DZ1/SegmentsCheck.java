package ConstructingObjects_DZ1;

import static ConstructingObjects_DZ1.Segments.checkLength;

public class SegmentsCheck{
    public static void main(String[] args) {
        Segments segment1=new Segments();
        Segments segment2=new Segments();

        segment1.startPointX=1;
        segment1.endPointX=2;
        segment1.startPointY=1;
        segment1.endPointY=2;
        segment1.printSegment();
        double length1=segment1.length();
        System.out.println("Длина первого отрезка: "+segment1.length());

        segment2.startPointX=-3;
        segment2.endPointX=1;
        segment2.startPointY=0;
        segment2.endPointY=1;
        segment2.printSegment();
        double length2=segment1.length();
        System.out.println("Длина второго отрезка: "+segment2.length());

        checkLength(length1, length2);
    }
}
