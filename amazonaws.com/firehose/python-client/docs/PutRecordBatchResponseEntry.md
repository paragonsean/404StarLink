# PutRecordBatchResponseEntry

Contains the result for an individual record from a <a>PutRecordBatch</a> request. If the record is successfully added to your delivery stream, it receives a record ID. If the record fails to be added to your delivery stream, the result includes an error code and an error message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**record_id** | **str** |  | [optional] 
**error_code** | **str** |  | [optional] 
**error_message** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.put_record_batch_response_entry import PutRecordBatchResponseEntry

# TODO update the JSON string below
json = "{}"
# create an instance of PutRecordBatchResponseEntry from a JSON string
put_record_batch_response_entry_instance = PutRecordBatchResponseEntry.from_json(json)
# print the JSON string representation of the object
print(PutRecordBatchResponseEntry.to_json())

# convert the object into a dict
put_record_batch_response_entry_dict = put_record_batch_response_entry_instance.to_dict()
# create an instance of PutRecordBatchResponseEntry from a dict
put_record_batch_response_entry_from_dict = PutRecordBatchResponseEntry.from_dict(put_record_batch_response_entry_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


