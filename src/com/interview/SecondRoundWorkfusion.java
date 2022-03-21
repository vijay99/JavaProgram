/*
package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SecondRoundWorkfusion {
    */
/**




     * Please review the class below and suggest improvements. How would


     * you refactor this class if it would be in a real-life project?


     * There are many problems here, both high-level design mistakes,


     * and low-level implementation bugs. We're interested to see high-level


     * problems first, since they are most critical. The more mistakes


     * you can spot, the better


     *//*







    */
/**


     * This class is thread safe.


     *//*



    public class Parser {


        private File file;


        public synchronized void setFile(File f) {


            file = f;


        }


        public synchronized File getFile() {


            return file;


        }


        public String getContent() throws IOException {


            InputStream i = new FileInputStream(file);


            String output = "";


            int data;


            while ((data = i.read()) > 0) {


                output += (char) data;


            }


            return output;


        }


        public String getContentWithoutUnicode() throws IOException {


            InputStream i = new FileInputStream(file);


            String output = "";


            int data;


            while ((data = i.read()) > 0) {


                if (data < 0x80) {


                    output += (char) data;


                }


            }


            return output;


        }


        public void saveContent(String content) throws IOException {


            OutputStream o = new FileOutputStream(file);


            for (int i = 0; i < content.length(); i += 1) {


                o.write(content.charAt(i));


            }


        }


    }


    a)
    Here is the table given:
    Employee
--------------------
    id
            name


    Name is not unique. Please, find all the names, which appear more than once. And next to them reckon the number of employees with these names.
    E.g.

            Mike  - 2
    Tom - 3
    Anna – 4


    Select e.name count(*) from Employee e  where e.name group by Employee.name ;



2. There are 6 cutlets. They are needed to be fried. There can be placed only 4 cutlets on the frying pan. Each side is fried for 5 minutes. How to fry 6 cutlets in 15 minutes on one pan?


}
*/
