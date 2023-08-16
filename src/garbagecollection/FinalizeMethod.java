package garbagecollection;

public class FinalizeMethod
{
        String s;
        public FinalizeMethod(String s) {
            this.s = s;
        }
        public static void main(String[] args) {
            FinalizeMethod t1 = new FinalizeMethod("t1");
            FinalizeMethod t2 = new FinalizeMethod("t2");
            t1 = t2;
            System.gc();
        }
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object previously referenced by " + this.s + " is successfully garbage collected.");
        }
    }

