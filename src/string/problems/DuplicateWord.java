package string.problems;

/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String[] keys = st.split(" ");
        String[] uniqueKeys;
        int count = 0;
        System.out.println(st);
        uniqueKeys = getUniqueKeys(keys);

        for(String key: uniqueKeys)
        {
            if(null == key)
            {
                break;
            }
            for(String s : keys)
            {
                if(key.equals(s))
                {
                    count++;
                }
            }
            System.out.println("Count of ["+key+"] is : "+count);
            count=0;
        }
    }

    private static String[] getUniqueKeys(String[] keys)
    {
        String[] uniqueKeys = new String[keys.length];

        uniqueKeys[0] = keys[0];
        int uniqueKeyIndex = 1;
        boolean keyAlreadyExists = false;

        for(int i=1; i<keys.length ; i++)
        {
            for(int j=0; j<=uniqueKeyIndex; j++)
            {
                if(keys[i].equals(uniqueKeys[j]))
                {
                    keyAlreadyExists = true;
                }
            }

            if(!keyAlreadyExists)
            {
                uniqueKeys[uniqueKeyIndex] = keys[i];
                uniqueKeyIndex++;
            }
            keyAlreadyExists = false;
        }
        return uniqueKeys;
    }

}
