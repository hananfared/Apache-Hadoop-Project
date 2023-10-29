package hanan;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class StockStudyDriver {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		Configuration conf = new Configuration();

		Job job = new Job(conf);

		job.setJarByClass(StockStudyDriver.class);

		job.setMapperClass(StockStudyMapper.class);

		job.setNumReduceTasks(1);
		job.setReducerClass(StockStudyReducer.class);

		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(FloatWritable.class);

		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));

		// FileSystem fs = FileSystem.get(conf);
		// fs.delete(new Path(args[1]));
		// Submit job
		job.waitForCompletion(true);

	}
}