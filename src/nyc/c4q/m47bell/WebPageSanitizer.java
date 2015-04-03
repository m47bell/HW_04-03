package nyc.c4q.m47bell;

/**
 * Access Code 2-1
 * Marbella Vidals
 * Write a class called WebPageSanitizer which implements a static method called String sanitize(String html)
 * which removes all script tags and the information that they encapsulate and returns a sanitized version of
 * the HTML string.
 */

//Don't know why HTTP does not work??????

import java.net.URL;
import java.util.Scanner;

public class WebPageSanitizer
{

    //receive a html string
    public static String sanitize(String html)
    {
        String startTag = "<script";
        String endTag = "</script>";
        String newHtml;
        int startIndex = html.indexOf(startTag);
        int endIndex = html.indexOf(endTag);

        //while the file contains <script tag keep reading file

        while(html.contains(startTag))
        {
            //get the location of script tags via index,set it equal to newHTML
            newHtml = html.substring(startIndex, endIndex);

            // remove script tags and replace with ""
            html = html.replace(newHtml, "");
        }
        //return html
        return html;
    }

    public static void main(String[] args)throws Exception
    {

        //From Alex's HttpTest code
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Url");
        //for example  http://google.com
        String input = scanner.nextLine();

        //converts a string to a URL
        URL url = HTTP.stringToURL(input);

        //gets the html source code
        String html = HTTP.get(url);

        //call method sanitize and prints out sanitize html
        System.out.println(sanitize(html));
    }


}




















