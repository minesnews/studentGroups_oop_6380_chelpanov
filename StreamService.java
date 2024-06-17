import java.util.Collections;
import java.util.List;

public class StreamService {
   public void sortByGroupCount(List<Stream> stream){
       StreamComparator comparator = new StreamComparator();
       Collections.sort(stream, comparator);
    }
}