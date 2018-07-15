// Объекты допускается передавать методам в качестве параметров
    class Test2 {
        int а , b ;
        Test2(int i , int j) {
            а = i;
            b = j;
        }
            // возвратить логическое значение true, если в качестве
            // параметра о указан вызывающий объект
            boolean equals (Test2 o){
                if (o.а == а && o.b == b) return true;
                else return false;
            }
    }
                class PassOb {
                    public static void main(String args[]) {
                        Test2 ob1 = new Test2(100, 22);
                        Test2 ob2= new Test2(100, 22);
                        Test2 ob3 = new Test2(-1, -1);
                        System.out.println("ob1==оb2: " + ob1.equals(ob2));
                        System.out.println("ob1==оb3: " + ob1.equals(ob3));
                    }
                }