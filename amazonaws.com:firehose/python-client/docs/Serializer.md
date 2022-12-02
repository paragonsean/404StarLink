# Serializer

The serializer that you want Kinesis Data Firehose to use to convert data to the target format before writing it to Amazon S3. Kinesis Data Firehose supports two types of serializers: the <a href=\"https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/orc/OrcSerde.html\">ORC SerDe</a> and the <a href=\"https://hive.apache.org/javadocs/r1.2.2/api/org/apache/hadoop/hive/ql/io/parquet/serde/ParquetHiveSerDe.html\">Parquet SerDe</a>.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parquet_ser_de** | [**SerializerParquetSerDe**](SerializerParquetSerDe.md) |  | [optional] 
**orc_ser_de** | [**SerializerOrcSerDe**](SerializerOrcSerDe.md) |  | [optional] 

## Example

```python
from openapi_client.models.serializer import Serializer

# TODO update the JSON string below
json = "{}"
# create an instance of Serializer from a JSON string
serializer_instance = Serializer.from_json(json)
# print the JSON string representation of the object
print(Serializer.to_json())

# convert the object into a dict
serializer_dict = serializer_instance.to_dict()
# create an instance of Serializer from a dict
serializer_from_dict = Serializer.from_dict(serializer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


