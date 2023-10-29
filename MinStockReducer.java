package hanan;

import java.io.IOException;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class StockStudyReducer extends Reducer<Text, FloatWritable, Text, FloatWritable> {

	@Override
	protected void reduce(Text key, Iterable<FloatWritable> values,
			Reducer<Text, FloatWritable, Text, FloatWritable>.Context context)
			throws IOException, InterruptedException {

		float minValue = (float) 100000;
		for (FloatWritable minimum : values) {
			minValue = Math.min(minValue, minimum.get());
		}

		context.write(key, new FloatWritable(minValue));
	}
}
