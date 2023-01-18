package edu.ucr.cs.cs167.cho102;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FileSystem;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length !=2) {
            System.err.println("Incorrect number of arguments! Expected two arguments.");
            System.exit(-1);
        }
        else {
            System.out.println(args[0]);
            System.out.println(args[1]);
            Path inputArg = new Path(args[0]);
            Path outputArg = new Path(args[1]);
        }
    }
}
