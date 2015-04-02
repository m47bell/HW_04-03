package nyc.c4q.m47bell;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by c4q-marbella on 4/1/15.
 * Access Code 2-1
 * Marbella Vidals
 * Write a class called WebPageSanitizer which implements a static method called String sanitize(String html)
 * which removes all script tags and the information that they encapsulate and returns a sanitized version of
 * the HTML string.
 *
 * Examples of script tags:
// * <!-- HTML4 and (x)HTML -->
// <script type="text/javascript" src="javascript.js">
//
// <!-- HTML5 -->
// <script src="javascript.js"></script>
 *
 */
public class WebPageSanitizer {

    public static String sanitize(String html) {

        File unsanitized = new File("/Users/c4q-marbella/Desktop/accesscode/HW_04-03/unsanitizedHTML.txt");

        try {
            Scanner sc = new Scanner(unsanitized);

            String textFile;


            //Returns true if the iteration has more elements
            while (sc.hasNext()) {
                textFile = sc.next();

                //look for <script tags and don't store script info
                if (!textFile.startsWith("<script") && (!textFile.endsWith("</script>"))){





                }

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return html;
    }

    public static void main(String [] args){










    }





}
