package hanan;

import java.io.IOException;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class StockStudyMapper extends Mapper<LongWritable, Text, Text, FloatWritable> {

	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, FloatWritable>.Context context)
			throws IOException, InterruptedException {

		String inputLine = value.toString();
		String[] stockArray = inputLine.split(",");

		try {
			context.write(new Text(stockArray[0]), new FloatWritable(Float.parseFloat(stockArray[6])));
		} catch (NumberFormatException e) {
			System.out.print("error");
		}

	}
}