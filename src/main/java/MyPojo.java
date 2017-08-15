//
//        // Java
//        public class MyPojo {
//            private String name;
//            private int age;
//
//            // getter and setter
//
//            @Override
//            public boolean equals(Object o) {
//                if (this == o) return true;
//                if (o == null || getClass() != o.getClass()) return false;
//
//                MyPojo myPojo = (MyPojo) o;
//
//                if (age != myPojo.age) return false;
//                return name != null ? name.equals(myPojo.name) : myPojo.name == null;
//            }
//
//            @Override
//            public int hashCode() {
//                int result = name != null ? name.hashCode() : 0;
//                result = 31 * result + age;
//                return result;
//            }
//
//            @Override
//            public String toString() {
//                return "MyPojo{" +
//                        "name='" + name + '\'' +
//                        ", age=" + age +
//                        '}';
//            }
//        }
//
//
