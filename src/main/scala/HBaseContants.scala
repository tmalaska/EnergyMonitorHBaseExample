import org.apache.hadoop.hbase.util.Bytes

/**
 * Created by ted.malaska on 11/12/15.
 */
object HBaseContants {
  val tableName = "EnergyTable"
  val columnFamily = Bytes.toBytes("f")
  val column = Bytes.toBytes("a")
}
