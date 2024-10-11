# PutRecordBatchOutput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**failed_put_count** | **int** |  | 
**encrypted** | **bool** |  | [optional] 
**request_responses** | **List** |  | 

## Example

```python
from openapi_client.models.put_record_batch_output import PutRecordBatchOutput

# TODO update the JSON string below
json = "{}"
# create an instance of PutRecordBatchOutput from a JSON string
put_record_batch_output_instance = PutRecordBatchOutput.from_json(json)
# print the JSON string representation of the object
print(PutRecordBatchOutput.to_json())

# convert the object into a dict
put_record_batch_output_dict = put_record_batch_output_instance.to_dict()
# create an instance of PutRecordBatchOutput from a dict
put_record_batch_output_from_dict = PutRecordBatchOutput.from_dict(put_record_batch_output_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


