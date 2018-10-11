public class bracket {
    public static boolean iscorrectbracket(String str)
    {
        int count = 0; //создаем счетчик
        for (int i = 0; i < str.length(); i++)
        {
            String symbol = str.substring(i, i + 1); //берем 1 символ, с помощью подстроки
            if (symbol.equals("(")) //сравниваем символ
            {count++;} //если встретили откр скобку - счетчик +1
            else {count--;} //если закрывающаяся - счетчик -1
            if (count < 0) //каждый раз проверяем счетчик на неотрицательность, это помогает отлавливать неверную посл-ть
            {return false;}
        }
        return true;
    }

    public static void main(String[] args)
    {
        String var = ")()(";
        System.out.println(iscorrectbracket(var));
    }
}
