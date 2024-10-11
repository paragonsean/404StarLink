# PutRecordBatchInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_stream_name** | **str** |  | 
**records** | **List** |  | 

## Example

```python
from openapi_client.models.put_record_batch_input import PutRecordBatchInput

# TODO update the JSON string below
json = "{}"
# create an instance of PutRecordBatchInput from a JSON string
put_record_batch_input_instance = PutRecordBatchInput.from_json(json)
# print the JSON string representation of the object
print(PutRecordBatchInput.to_json())

# convert the object into a dict
put_record_batch_input_dict = put_record_batch_input_instance.to_dict()
# create an instance of PutRecordBatchInput from a dict
put_record_batch_input_from_dict = PutRecordBatchInput.from_dict(put_record_batch_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


