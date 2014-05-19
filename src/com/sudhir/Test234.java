package com.sudhir;

import org.apache.log4j.Logger;


import java.util.*;

public class Test234{
  /* Get actual class name to be printed on */
  static Logger log = Logger.getLogger(
		  Test234.class.getName());

  public static void main(String[] args)
                {
   
     log.debug("Hello this is an DEBUG message");
     log.info("Hello this is an INFO message  sudhir");
     log.error("Error Message");
     System.out.println("Std out messaging");
     
     }
}