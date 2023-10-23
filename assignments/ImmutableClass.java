package assignments;
public final class ImmutableClass {
         private final int value;

         public ImmutableClass(int value) {
             this.value = value;
         }

         public int getValue() {
             return value;
         }
     }
