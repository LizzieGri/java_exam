package exam.task4;

/**
 * Основной метод.
 */
public class Task4 {
    public static void main(String[] args) {
        String source = "/*\n"
                + " * My first ever program in Java!\n"
                + " */\n"
                + "class Hello { // class body starts here \n"
                + "  \n"
                + "  /* main method */\n"
                + "  public static void main(String[] args/* we put command line\n"
                + "arguments here*/) {\n"
                + "    // this line prints my first greeting to the screen\n"
                + "    System.out.println(\"Hi!\"); // :)\n"
                + "  }\n"
                + "} // the end\n"
                + "// to be continued...\n";
        String noComments = removeJavaComments(source);
        System.out.println(noComments);

    }

    /**
     * Функция удаления комментариев из строки.
     *
     * @param withComments строка с комментариями
     * @return строка без комментариев
     */
    private static String removeJavaComments(String withComments) {
        return withComments.replaceAll("(/\\*([\\S\\s]+?)\\*/)|(//.*)", "");
    }

}
