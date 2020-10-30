public class ChristmasTree {

    public String drawTree(int number){
        if(number == 0){
            return "";
        }else {

            System.out.print("/");
            for (int i=0;i<(2*(number-2));i++) {
                if ( i == (2*(number-2))/2 )
                {
                    System.out.print("|");
                }
                System.out.print("_");
            }
            System.out.println("\\");
            return drawTree(number-1);
        }
    }

    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTree();
        String result = christmasTree.drawTree(6);
        System.out.print(result);
    }
}
