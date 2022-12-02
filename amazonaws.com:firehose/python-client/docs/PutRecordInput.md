# PutRecordInput


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_stream_name** | **str** |  | 
**record** | [**PutRecordInputRecord**](PutRecordInputRecord.md) |  | 

## Example

```python
from openapi_client.models.put_record_input import PutRecordInput

# TODO update the JSON string below
json = "{}"
# create an instance of PutRecordInput from a JSON string
put_record_input_instance = PutRecordInput.from_json(json)
# print the JSON string representation of the object
print(PutRecordInput.to_json())

# convert the object into a dict
put_record_input_dict = put_record_input_instance.to_dict()
# create an instance of PutRecordInput from a dict
put_record_input_from_dict = PutRecordInput.from_dict(put_record_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


