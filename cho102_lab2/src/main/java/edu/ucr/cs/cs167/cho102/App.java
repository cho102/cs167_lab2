package edu.ucr.cs.cs167.cho102;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FileSystem;
import java.io.IOException;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        if (args.length !=2) {
            System.err.println("Incorrect number of arguments! Expected two arguments.");
            System.exit(-1);
        }
        else {
            Configuration conf = new Configuration();
            Path inputArg = new Path(args[0]);
            Path outputArg = new Path(args[1]);
            FileSystem inFS = inputArg.getFileSystem(conf);
            FileSystem outFS = outputArg.getFileSystem(conf);
            if (!inFS.exists(inputArg)) {
                System.err.printf("Input file '%s' does not exist!\n", args[0]);
                System.exit(-1);
            }
            if (outFS.exists(outputArg)) {
                System.err.printf("Output file '%s' already exists!\n", args[1]);
                System.exit(-1);
            }

            long startTime = System.nanoTime();
            FSDataInputStream in = inFS.open(inputArg);
            FSDataOutputStream out = outFS.create(outputArg);
            int b;
            int bytes=0;
            while ((b = in.read()) > 0){
                out.write(b);
                bytes += b;
            }
            in.close();
            out.close();
            long estimatedTime = System.nanoTime() - startTime;

            System.out.println("Copied " + bytes +" bytes from '" + args[0] + "' to '" + args[1] + "' in " + estimatedTime +" seconds");

        }
    }
}
